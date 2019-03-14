package Graphs;


import java.util.Stack;

class Vertex{
    boolean visited;
    char label;
    void vertex(char label){
        this.label=label;
        visited=false;
    }
}
class Graph{
    int adjMatrix[][];
    int vertexcount;
    int maxVertices;
    Vertex vertexList[];
    Stack s;
    void graph(int V){
        vertexcount=0;
        maxVertices=V;
        Vertex vertexList[]=new Vertex[maxVertices];
        Stack s= new Stack();
        adjMatrix=new int[maxVertices][maxVertices];
        for(int i=0;i<V;i++){
            for(int j=0;j<V;j++) {
                adjMatrix[i][j] = 0;
            }
        }

    }
}
public class DFS {
}
