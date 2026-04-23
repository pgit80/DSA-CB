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
  > internally.
- In TreeMap `a key can't be null`, as we need comparisons in TreeMap.

---

### LinkedHashMap

- It preserves the `Insertion Order`
- > Implemented using `Doubly Linked List`
- `Constant TC` for operations.
- `null` can be inserted as a key here.

---

### Implementation method of hashmap
- We've to implement it in a way that we can achieve O(1) TC for Get, Put, ContainsKey & Remove operations.
- This implementation is widely asked in most product based companies interview round.
- We know in `array` Set and Get works in constant time.
- The problem arise to implement the `containsKey()` method, that returns in O(1) time that a key is in map or not.
- We define a `hashFunction` for this means we take modulo of the  ASCII value of the data and store it. 
- But collision is a problem here when more than 2 data values generates same result with hash function.
- Now we want to design a `collision free` hashmap.
- to implement a collision free hashmap we use a method called `chaining`.
- In chaining we use linked list to store chained data, then the issue is that Linked List will not give constant searching
- So now we need some strong method to store values and do operations on it in constant time.
- here we take help of `Threshold factor` and `Load Factor`.
- #### Threshold Factor: we only put 2 elements in a bucket.
- #### Load factor: The value which tells that how our data is stored in each bucket
- [Diagram](mapdiagram.tldr)

- > if out hash function selection is so bad that even our load factor is less but data searching is taking O(n) time.
