## Map
- It is `interface` in java.
- it has classes that implement it- `HashMap`, `TreeMap`, `LinkedHashMap`
- Map stores data in form of `Key:value` pair.
- In hashmap, add, remove, get operations take `O(1)` time.
- Map and HashMap are different:-
    - Map: Interface
    - HashMap: Class
- Key is always `unique` in map
- HashMap `doesn't maintain the insertion order`. (because it want to achieve O(1) complexity)
---
### HashMap
    - 
    - put()- put a value in map
    - get()- get value from map
    - contains()- a value is in map or not
    - remove()- remove a key from map
- > HashMap is implemented using `LinkedList` data structure internally.
- > null can be a key in hashmap, multiple null will overriden
---
### TreeMap
- The difference in TreeMap and Hashmap is that, TreeMap stores keys in `Lexicographically sorted` order.
- In TreeMap all operation happen in `log(n)` time because it maintain sorted order in insertion.
- > Tree Map is implemented using `Red-Black Tree` 
internally.
- In TreeMap `a key can't be null`, as we need comparisons in TreeMap.
---
### LinkedHashMap
- It preserves the `Insertion Order`
- > Implemented using `Doubly Linked List`
- `Constant TC` for operations.
- `null` can be inserted as a key here.