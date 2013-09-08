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

public class StringConstantTest implements TestSerialization {

  public List<Kernel> create() {
    List<Kernel> ret = new ArrayList<Kernel>();
    for(int i = 0; i < 20; ++i){
      ret.add(new StringConstantKernel());
    }
    return ret;
  }

  public boolean compare(Kernel original, Kernel from_heap) {
    StringConstantKernel lhs = (StringConstantKernel) original;
    StringConstantKernel rhs = (StringConstantKernel) from_heap;
    return lhs.compare(rhs);
  }

}
