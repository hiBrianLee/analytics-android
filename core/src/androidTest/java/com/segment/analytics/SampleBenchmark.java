package com.segment.analytics;

import com.google.caliper.Benchmark;
import com.google.caliper.Param;
import java.util.Random;

public class SampleBenchmark extends Benchmark {
  @Param(value = { "16", "64", "1024", "4096", "8192" }) int length;

  String data;

  @Override protected void setUp() throws Exception {
    char[] chars = new char[length];
    Random dice = new Random(0);
    for (int i = 0; i < chars.length; i++) {
      chars[i] = (char) dice.nextInt(128);
    }
    data = new String(chars);
  }

  public void timeNativeEncoder(int reps) {
    for (int i = 0; i < reps; i++) {
      data.contains("he");
    }
  }

  public void timeGetBytes(int reps) {
    for (int i = 0; i < reps; i++) {
      data.contains("he");
    }
  }
}
