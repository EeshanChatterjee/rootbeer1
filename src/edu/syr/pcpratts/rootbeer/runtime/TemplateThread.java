/* 
 * Copyright 2012 Phil Pratt-Szeliga and other contributors
 * http://chirrup.org/
 * 
 * See the file LICENSE for copying permission.
 */
package edu.syr.pcpratts.rootbeer.runtime;

public class TemplateThread extends Thread {

  private TemplateThreadListsProvider templateThreadListsProvider;
  public boolean compute = false;
  public int startid;
  public int endid;
  public int m_threadIdxx;
  public int m_blockIdxx;
  public Kernel kernel;

  public TemplateThread(TemplateThreadListsProvider templateThreadListsProvider) {
    this.templateThreadListsProvider = templateThreadListsProvider;
  }
  
  @Override
  public void run() {
    while (true) {
      while (!compute) {
        try {
          sleep(100000);
        } catch (InterruptedException ex) {
        }
      }
      templateThreadListsProvider.getComputing().add(this);
      for (m_threadIdxx = startid; m_threadIdxx < endid; ++m_threadIdxx) {
        try{
          kernel.gpuMethod();
        }catch(Exception e){
          e.printStackTrace();
        }
      }
      compute = false;
      templateThreadListsProvider.getComputing().remove(this);
      templateThreadListsProvider.getSleeping().add(this);
    }
  }
}
