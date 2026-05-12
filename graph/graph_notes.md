# Graph
## Where we see uses of graph?
- In the friends suggestion on facebook
- In the google maps route navigation
- In the Routing table of wifi routers
## what is a graph?
- It is a `finite set` of edges and vertices. 
---
### Types of Graph
- Directed
    - Weighted Directed
    - Unweighted Directed
- Undirected
    - Weighted Undirected
    - Unweighted Undirected
### How to Identify Graph Type?
- Refer this [Diagram](graph.tldr)
---
## How to Represent Graph in Computer(Code format)-
- > Undirected Weighted Graph
- Refer to this [Graph](graph.tldr)
- **Ways to Represent above graph**
    - ### Adjacency Matrix Representation
        - Count No. of Edges and create ExE matrix i.e. 7*7 if there are 7 edges in graph
        - **Merit:** We can check in `O(1)` time if there exist a edge between two nodes.
        - **Demerit:** We are wasting a lot of memory in storing the edges with 0 weight(no edge)
    - To avoid this waste of memory we use another method of representing graph in computer.
    - ### Adjacency List Representation
        - It stores in form of Linked-List where an array stores the head of the Start node of LLs. [See here](graph.tldr)
        - We are now saving space in comparison to previous representation method but now we need `O(n)` time to check if a edge exist between two nodes. (Due to LL traversal)
        - `Space Time Trade-Off`
    - So now, we want to acieve some representation which balances the space-time tradeoff.
    - ### HashMap Representation
        - Here we'll create a Hashmap<Integer, Hashmap<Integer, Integer>> to represent the graph. Where Internal haspmap further store the connected(neighbour) nodes. [See here](graph.tldr)
#### What is Complete Graph?
- In Complete graph there exists an direct edge between any two vertices
* How many edges there are in total in a complete graph? `N*(N-1)/2` if there is `N vertices` in the graph

## Graph Searching Algorithms
- ### BFS
    - Level order Traversal of Tree is BFS - We'll use `Queue` for BFS
    - We can also use BFS to check cycle in graph.
    - Here are the steps for the BFS:
        1. Remove the vertex from the queue
        2. Ignore if it already exists in the visited set (it means that graph has a cycle.)
        3. Mark the vertex as visited
        4. do the work (printing, sum etc.)
        5. add the unvisited neighbours of the vertex in the queue
- ### DFS
    - We traverse on branch fully before going to next branch
    - Use use `Stack` in DFS.
    - DFS also can detect cycle in graph.
    - Steps are same as BFS:
         1. Remove the vertex from the Stack
        2. Ignore if it already exists in the visited set (it means that graph has a cycle.)
        3. Mark the vertex as visited
        4. do the work (printing, sum etc.)
        5. add the unvisited neighbours of the vertex in the Stack

## Graph Traversal Algorithms
- Traversal is updated algo of searching
- For [disconnected graphs](graph.tldr) we use seperate Breadth/Depth First Traversal for each component of graph.

## Graph & Tree Relation
- Every Tree is Graph but vice-versa is not true.
- A cyclic graph can't be tree
- A disconnected graph can't be tree    

### BiPartite Graph
- agar hum graph ke vertices ko 2 alag sets me divide kr paye jisme unka union me sare vertices aaye aur intersection me nill aaye.
- also vertices ke edges ko connect krne par wo across the set connect ho within the set nahi. [See Example](graph.tldr)
- `Every Acyclic Graph is BiPartite`
    - we can always keep the adjacent neighbours in different sets for acyclic graph.
- `Acyclic->100% biprtite` check cycle using BFT or DFT
- `Cyclic`
    - Odd length Cycle Not Bipartite
    - Even length Cycle 100% bipartite
- **Graph coloring question can be also solved using concept of bipartite graphs just try to keep the different colors in different sets which connects with other colors in different sets not in the same set.**
### How to check cycle length in cyclic graph ?
- Use BFT/DFT and keep track of the vertices with distance with source and if at any moment the same node shows different distance with source node then it means that the graph cycle is odd length.

## Single Source Shortest Path (SSSP):-
- This algo is used to find the minimum cost to travel from source node to destination node.
- If we want to calculate the min. cost in terms of edges then we should use `BFS` algo as `BFS gurantee for the shortest path using edges` while DFS doesn't
- If we want to calculate in terms of cost then we'll use SSSP algo.
- We've 2 algos for SSSP-
    - 1. `Dijkstra's algo`- Widely used in routers to maintin the routing table
    - 2. `Bellman Ford algo`
    ### Dijkstra's Algo:-
    - It is mandatory to have the all node cost as `+ve (mandatory)`, why? see bellman ford algo.
    - Doesn't work in disconnected graphs
    - Steps-
        - Traversal BFT/DFT
        - We'll use priority queue here as we've to minimise the cost.
        - rest steps are:
        - remove from priority queue
        - ignore
        - visited set.
        - self work
        - Add to priority queue.
    - We can be asked the cost of the path and path as well.
    - Dijkstra algo can also detect cycle in the graph but take more resources than BFT/DFT

## Spanning Tree
- A spanning tree is subset of graph which has all the vertices covered with minimum possible edges.
- It is a tree so it don't has any cycle nor it is disconnected.
- [See Example](graph.tldr)
- Properties:
    - A connected graph can have more than one spanning tree. but every spanning tree will have same no. of nodes and edges.
    - Spanning tree has (n-1) edges if there are `n` vertices.
    - Removing one edge from the spanning tree make the graph disconnected (i.e. spanning tree). Spanning tree is minimally connected.
    - Spanning tree is maxmally acyclic.
- `Minimumm spanning tree` among all the spanning trees the one with minimum cost on edges is called minimum spanning tree.
- Algo to design Min. Spanning Tree:
    - `Prims` Algo
    - `Kruskal` Algo
    - Both are `Greedy Algo`
#### Kruskal's Algo (Pending)
- In kruskal's algo keep chossing the `edge` with minimum cast until we covered all the vertices.
- In interviews we can be asked about the order in which we picked the edges so keep in mind.
- For applying Kruskal's algo we need to have knowledge of DSU- `Disjoint Set Union`
#### DSU (Pending)
- DSU is a Data Structure

#### Prim's Algo
- We pick a `node` to start and keep chosing edge with minimum cost to move to other node and stop when all the nodes are covered.