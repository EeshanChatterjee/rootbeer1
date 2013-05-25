/* 
 * Copyright 2012 Phil Pratt-Szeliga and other contributors
 * http://chirrup.org/
 * 
 * See the file LICENSE for copying permission.
 */

package edu.syr.pcpratts.rootbeer.testcases.rootbeertest.serialization.hama;

import org.apache.hadoop.io.NullWritable;
import org.apache.hama.bsp.BSPPeer;
import org.apache.hama.bsp.gpu.GpuBSP;

public class TestGpuBSP extends GpuBSP<NullWritable, NullWritable, NullWritable, NullWritable, NullWritable> {

  public TestGpuBSP() {
    super();
  }

  @Override
  public void setupGPU(BSPPeer<NullWritable, NullWritable, NullWritable, NullWritable, NullWritable> peer){
    System.out.println("Rootbeer TestGpuBSP setupGPU!");
  }

  @Override
  public void bspGPU(BSPPeer<NullWritable, NullWritable, NullWritable, NullWritable, NullWritable> peer){
    System.out.println("Rootbeer TestGpuBSP bspGPU!");
  }

  @Override
  public void cleanupGPU(BSPPeer<NullWritable, NullWritable, NullWritable, NullWritable, NullWritable> peer){
    System.out.println("Rootbeer TestGpuBSP cleanupGPU!");
  }
}
