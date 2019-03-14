package Graphs;

import java.util.LinkedList;
import java.util.List;

class Graphs {
     int V;
     LinkedList<Integer> adj[];

    Graphs(int v) {
       this.V = v;
        adj = new LinkedList[v+1];
        for (int i = 1; i <=v; ++i)
            adj[i] = new LinkedList();
    }


    void addEdge(int u, int w) {
        adj[u].add(w);
    }
}
public class TopologicalSorting {
}
