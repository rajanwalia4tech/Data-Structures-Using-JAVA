package graph;

import java.util.*;
public class CycleDetectionInDirectedGraph {
    static class Edge {
        int src;
        int dest;
        public Edge(int s, int d) {
            this.src = s;
            this.dest = d;
        }
    }

    //Below Graph has cycle - true
    static void createCyclicGraph(ArrayList<Edge> graph[]) {
        for(int i=0; i<graph.length; i++) {
            graph[i] = new ArrayList<>();
        }
        graph[0].add(new Edge(0, 2));
        graph[1].add(new Edge(1, 0));
        graph[2].add(new Edge(2, 3));
        graph[3].add(new Edge(3, 0));
    }

    //Below graph has no cycle - false
    static void createAcyclicGraph(ArrayList<Edge> graph[]) {
        for(int i=0; i<graph.length; i++) {
            graph[i] = new ArrayList<>();
        }
        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 2));
        graph[1].add(new Edge(1, 3));
        graph[2].add(new Edge(2, 3));
    }

    static boolean isCycleExists(ArrayList<Edge> []graph, int cur, boolean []visited, boolean stack[]){
        visited[cur] = true;
        stack[cur] = true;
        for(Edge e : graph[cur]){
            if(stack[e.dest]){ // Cycle Exists
                return true;
            }else if(!visited[e.dest] && isCycleExists(graph, e.dest, visited, stack)){
                return true;
            }
        }
        stack[cur] = false;
        return false;
    }

    // Time - O(V+E)
    public static boolean isCycle(ArrayList<Edge> graph[]){
        boolean visited[] = new boolean[graph.length];
        for(int i=0; i<graph.length; i++){
            if(visited[i] == false){
                boolean isCycle = isCycleExists(graph, i, visited, new boolean[graph.length]);
                if(isCycle)
                    return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int V = 4;
        ArrayList<Edge> graph[] = new ArrayList[V];
        // createAcyclicGraph(graph); // false
        createCyclicGraph(graph); // true
        System.out.println(isCycle(graph));
    }
}
