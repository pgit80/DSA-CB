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
        - Here we'll create a Hashmap<Integer, Hashmap> to represent the graph. Where Internal haspmap further store the connected nodes. [See here](graph.tldr)
