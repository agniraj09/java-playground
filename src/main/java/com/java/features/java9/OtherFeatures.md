Compact String
---
1. Starting from Java 9, String objects use byte[] implementation instead of char[] implementation to save memory.
2. A new field called 'coder' has been added to the String class to denote the type of string/characters(ex. LATIN1)
3. Several String functions such as charAt() are also modified to incorporate new changes.
4. This is applicable for StringBuilder and StringBuffer too.

## Benefits

1. Memory usage is drastically reduced
2. Frequency and pressure on GC is reduced
3. Performance gain and reduced latency
