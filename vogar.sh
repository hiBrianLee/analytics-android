#!/bin/bash

java -jar vogar.jar --benchmark --mode device --device-dir /sdcard/vogar --sourcepath core/src/main/java --verbose core/src/androidTest/java/com/segment/analytics/SampleBenchmark.java
