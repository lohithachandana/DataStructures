package Graphs;

import Graphs.TopologicalSorting.*;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;

public class DFSwithList {

  static Stack s= new Stack();
   static void printNodes(Graphs obj,int node, boolean[] visited){
       visited[node]=true;
       //System.out.println(node+" is curr node");
       s.push(node);

       Iterator<Integer> it=obj.adj[node].iterator();
       while(it.hasNext()){
         //  System.out.println("iterating");
           int v=it.next();
           //System.out.println("v is "+v);
           if(visited[v]!=true){
               printNodes(obj,v,visited);
           }
       }
       if(!(s.isEmpty())){
           System.out.println(s.pop());
       }

   }

    static void DFS(Graphs obj){
       boolean[] visited=new boolean[(obj.V)+1];

       for(int i=1;i<obj.V;i++){
           if(visited[i]==false && obj.adj[i].size()>1){
               printNodes(obj,i,visited);
           }
       }
    }

    public static void main(String[] args){
        Graphs g= new Graphs(10);
        g.addEdge(1,8);
        g.addEdge(1,9);
        g.addEdge(1,10);
        g.addEdge(2,5);
        g.addEdge(2,6);
        g.addEdge(8,7);
        g.addEdge(8,4);
        DFS(g);


    }


}
