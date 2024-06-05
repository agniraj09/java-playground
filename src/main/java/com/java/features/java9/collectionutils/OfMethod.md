of() method to create un-modifiable collection
---
1. Earlier in Java 8 we cannot directly create un-modifiable collection(list, set, map).
2. We had to use Collections.unmodifiableList() or Collections.unmodifiableSet() methods and pass a list/set as input so that an un-modifiable collection is returned.
3. Java 9 has introduced of method using which we can directly create un-modifiable collection.
   1. List.of()
      1. Creates un-modifiable list.
      2. No limit in input params.
   2. Set.of()
      1. Creates un-modifiable set.
      2. No limit in input params.
   3. Map.of()
      1. Creates un-modifiable map.
      2. Max 10 key-value pairs are allowed.
      3. To add more, need to use Map.Entries(entry(key, value), entry(key, value)..) method.
4. **null** elements are not allowed in List, Set, Map(key & value)
5. **Duplicate** elements are not allowed in Set
6. **Duplicate** keys are not allowed in Map
