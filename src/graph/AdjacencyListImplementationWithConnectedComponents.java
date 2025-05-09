package graph;
import java.util.*;

public class AdjacencyListImplementationWithConnectedComponents {

    static class Edge{
        int src;
        int dest;
        int wt;
        public Edge(int src, int dest,int wt){
            this.src = src;
            this.dest = dest;
            this.wt = wt;
        }
    }

    static void createGraph(ArrayList<Edge> graph[]){
        for(int i=0;i<graph.length;i++){
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0, 1,1));
        graph[0].add(new Edge(0,2,1));

        graph[1].add(new Edge(1, 0,1));
        graph[1].add(new Edge(1,3,1));

        graph[2].add(new Edge(2, 0,1));
        graph[2].add(new Edge(2,4,1));

        graph[3].add(new Edge(3, 1,1));
        graph[3].add(new Edge(3,4,1));
        graph[3].add(new Edge(3,5,1));

        graph[4].add(new Edge(4, 2,1));
        graph[4].add(new Edge(4,3,1));
        graph[4].add(new Edge(4,5,1));

        graph[5].add(new Edge(5, 3,1));
        graph[5].add(new Edge(5,4,1));

        graph[6].add(new Edge(5,6,1));
    }

    public static void bfs(ArrayList<Edge> graph[], boolean visited[]){
        // Go to the immediate neighbour
        /*
         1. Print current vertex
         2. mark currect vertex as visited
         3. Go to the neighbour and push it to the queue
         */
        Queue<Integer> q = new LinkedList<>();
        q.add(0); // source node from where to start the BFS

        while(!q.isEmpty()){
            int currentVertex = q.remove();
            if(visited[currentVertex] == false){
                System.out.print(currentVertex + " ");
                visited[currentVertex] = true;
                for(Edge e : graph[currentVertex])
                    q.add(e.dest);
            }
        }
    }

    public static void main(String[] args) {
        /*
            1 --- 3
          /       | \
          0       |  5 -- 6
           \      | /
            2 --- 4
        */
        int v = 7; // no. of vertices
        ArrayList<Edge> graph[] = new ArrayList[v];
        createGraph(graph);

        System.out.println("---------- BFS STARTED ------------");
        boolean visited [] = new boolean[v];
        bfs(graph,visited);
        System.out.println();
        System.out.println("---------- BFS COMPLETED ------------");

        visited = new boolean[v];
        System.out.println("---------- DFS STARTED ------------");
        dfs(graph, 0, visited);
        System.out.println();
        System.out.println("---------- DFS COMPLETED ------------");
    }


    static void dfs(ArrayList<Edge> graph[], int curr, boolean visited[]){
        if(visited[curr])
            return;

        System.out.print(curr + " ");
        visited[curr] = true;
        for(Edge e : graph[curr]){
            if(visited[e.dest] == false)
                dfs(graph, e.dest, visited);
        }
    }

}