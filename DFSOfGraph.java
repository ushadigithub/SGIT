import java.util.ArrayList;
import java.util.Stack;

public class DFSOfGraph {
    int v;
    ArrayList<Integer>[] adj;

    DFSOfGraph(int noOfVertex) {
        v = noOfVertex;
        adj = new ArrayList[noOfVertex];
        for (int i = 0; i < noOfVertex; i++) {
            adj[i] = new ArrayList<>();
        }
    }

    void Edge(int x, int y) {
        adj[x].add(y);
    }

    void DepthFirstSearch(int SourceVertex) {
        boolean[] visited = new boolean[v];
        Stack<Integer> s1 = new Stack<>();
        s1.push(SourceVertex);
        int node;
        while (!s1.isEmpty()) {
            SourceVertex = s1.peek();
            s1.pop();
            if (!visited[SourceVertex]) {
                System.out.print(SourceVertex + " ");
                visited[SourceVertex] = true;
            }
            for (int i = 0; i < adj[SourceVertex].size(); i++) {
                node =  adj[SourceVertex].get(i);
                if (!visited[node]) {
                    s1.push(node);
                }
            }
        }
    }
    public static void main(String[] args){

        DFSOfGraph g1 = new DFSOfGraph(6);
            g1.Edge(0, 1);
            g1.Edge(0, 2);
            g1.Edge(1, 0);
            g1.Edge(1, 2);
            g1.Edge(2, 0);
            g1.Edge(2, 1);
            g1.Edge(2, 3);
            g1.Edge(2, 4);
            g1.Edge(3, 2);
            g1.Edge(4, 2);
            g1.Edge(4, 5);
            g1.Edge(5, 0);
            g1.Edge(5, 4);

            System.out.println("result of depth first search:");
            g1.DepthFirstSearch(0);
        }

    }

