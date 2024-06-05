G1 Garbage Collector
---
G1 Garbage Collector is the default garbage collector starting from Java 9

1. Heap memory is divided into multiple regions to accommodate different level of lively objects.
2. Less Pause time(when app is stopped to do GC) - 200 ms
3. Less latency and High throughput.
4. During young collection phase, objects are allocated in Eden region.
5. In next cycle, if objects survive in Eden region, they are moved to Survivor regions.
6. In next cycle, if objects survive in Eden and Survivor region, they are moved to Old region.
7. When entire heap is 45% full, Old region GC will kick in,
   1. A 'Concurrent Mark' process kick in. App is not stopped during this process. This process removes dead objects in the region and removes them.
   2. Once above process is completed, 'Mixed Collections' starts, in this process GC happens at both young and old regions.