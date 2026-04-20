# Heaps
- it is a `complete binary` tree
* Now what is a `complete Binary` tree?
    -
    - all previous fileds are filled before moving to next level. 
    - Simply without filling the left child we can't fill right child
    - Always filled Left to right.
    - In CBT
        - left child address in array: LC = P*2+1
        - right child address in array: RC = P*2+2
    - Address of Parent
        - P=[(C-1)/2]
    - Using above relations we can manage the Heap in form of `arraylists/arrays`
- in Java there is `Priority Queue` which works as Heap, it is not similar than heap both as some differences
- What is `priority queue`?
    - 
    - we know queue already which is a linear `FIFO` data structure. 
    - but in priority queue the data is having some priority and based on this priority the data manipulation occurs.
- In Java Priority Queue is a built-in class.
- Heap has priority associated and based on this priority we've two heaps-> `Min Heap` and `Max Heap`
- Min Heap
    -
    - it has priority as `Rank` means less value more priority.
- Max Heap
    - 
    - It has priority as `Marks` means more value more priority.
* Implementation-
    -
    - We'll use an array list to store data
    - add elements to last of list and keep checkin for conditions
    - if condition of min/max heap violates then swap the element with its parent as per the formula (`up-heapify` process), until it follows the max/min heap condition. 

