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

public class CmplInfTest implements TestSerialization {

  public List<Kernel> create() {
    List<Kernel> ret = new ArrayList<Kernel>();
    ret.add(new CmplInfRunOnGpu(Double.NEGATIVE_INFINITY));
    ret.add(new CmplInfRunOnGpu(Double.POSITIVE_INFINITY));
    ret.add(new CmplInfRunOnGpu(-10.0));
    ret.add(new CmplInfRunOnGpu(10.0));
    ret.add(new CmplInfRunOnGpu(0.0));
    return ret;
  }

  public boolean compare(Kernel original, Kernel from_heap) {
    CmplInfRunOnGpu lhs = (CmplInfRunOnGpu) original;
    CmplInfRunOnGpu rhs = (CmplInfRunOnGpu) from_heap;
    return lhs.compare(rhs);
  }

}
