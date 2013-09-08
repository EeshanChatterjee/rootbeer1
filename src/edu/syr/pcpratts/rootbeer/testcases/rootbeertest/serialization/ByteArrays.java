/* 
 * Copyright 2012 Phil Pratt-Szeliga and other contributors
 * http://chirrup.org/
 * 
 * See the file LICENSE for copying permission.
 */

package edu.syr.pcpratts.rootbeer.testcases.rootbeertest.serialization;

import edu.syr.pcpratts.rootbeer.runtime.Kernel;
import edu.syr.pcpratts.rootbeer.test.TestSerialization;

import org.trifort.rootbeer.remap.java.util.ArrayList;
import org.trifort.rootbeer.remap.java.util.List;

public class ByteArrays implements TestSerialization {

  public List<Kernel> create() {
    List<Kernel> jobs = new ArrayList<Kernel>();
    for(int i = 0; i < 20; ++i){
      ByteArraysRunOnGpu curr = new ByteArraysRunOnGpu();
      jobs.add(curr);
    }
    return jobs;
  }

  public boolean compare(Kernel lhs, Kernel rhs) {
    ByteArraysRunOnGpu blhs = (ByteArraysRunOnGpu) lhs;
    ByteArraysRunOnGpu brhs = (ByteArraysRunOnGpu) rhs;
    return blhs.compare(brhs);
  }
}
