#include <stdio.h>
#ifndef NAN
#include <math_constants.h>
#define NAN CUDART_NAN
#endif

#ifndef INFINITY
#include <math_constants.h>
#define INFINITY CUDART_INF
#endif

__shared__ size_t m_Local[3];
__shared__ char m_shared[40*1024];

__device__
int getThreadId(){
  return blockIdx.x * blockDim.x + threadIdx.x;
}

__device__
int getThreadIdxx(){
  return threadIdx.x;
}

__device__
int getBlockIdxx(){
  return blockIdx.x;
}

__device__
int getBlockDimx(){
  return blockDim.x;
}

__device__
void synchthreads(){
  __syncthreads();
}

__device__ clock_t global_now;