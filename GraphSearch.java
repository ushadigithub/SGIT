import java.util.ArrayList;

public class GraphSearch {
    int v;
    ArrayList<Integer>[] adj;

    GraphSearch(int noOfVertex) {
        v = noOfVertex;
        adj = new ArrayList[noOfVertex];
        for (int i = 0; i < noOfVertex; i++) {
            adj[i] = new ArrayList<>();
        }
    }
    void addEdge(int x, int y) {
        adj[x].add(y);
    }
    void breadthFirstSearch(int SourceVertex){
        boolean[] visited=new boolean [v];
        ArrayList<Integer> a1=new ArrayList<>();
        visited[SourceVertex]=true;
        a1.add(SourceVertex);
        while (!a1.isEmpty()){
            SourceVertex=a1.remove(0);
            System.out.print(SourceVertex+" ");
            for (Object n : adj[SourceVertex]) {
                if (!visited[(int) n]) {
                    visited[(int) n] = true;
                    a1.add((Integer) n);
                }
            }
        }
    }

    public static void main(String[] args) {
        GraphSearch g1=new GraphSearch(6);
        g1.addEdge(0,1);
        g1.addEdge(0,2);
        g1.addEdge(0,5);
        g1.addEdge(1,0);
        g1.addEdge(1,2);
        g1.addEdge(2,0);
        g1.addEdge(2,1);
        g1.addEdge(2,3);
        g1.addEdge(2,4);
        g1.addEdge(3,2);
        g1.addEdge(4,2);
        g1.addEdge(5,0);
        g1.addEdge(5,4);
        System.out.println("The Breadth  First Traversal is as fallows: ");
        g1.breadthFirstSearch(0);

    }
}












