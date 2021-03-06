package org.trifort.rootbeer.examples.multigpu;

import java.util.List;
import java.util.ArrayList;
import org.trifort.rootbeer.runtime.Kernel;
import org.trifort.rootbeer.runtime.RootbeerGpu;

public class ArrayMult implements Kernel {
  
  private int[] m_source;
  
  public ArrayMult(int[] source){
    m_source = source;
  }
  
  public void gpuMethod(){
    int thread_id = RootbeerGpu.getThreadId();
    m_source[thread_id] *= 11;
  }
}
