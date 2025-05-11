package graph;

import java.util.*;

public class TopologicalSorting {
    
    static class Edge{
        int src;
        int dest;
        public Edge(int src, int dest){
            this.src = src;
            this.dest = dest;
        }
    }

    public static void createGraph(ArrayList<Edge> graph[]){
        for(int i=0; i<graph.length; i++) {
            graph[i] = new ArrayList<>();
        }
        graph[2].add(new Edge(2, 3));
        graph[3].add(new Edge(3, 1));
        graph[4].add(new Edge(4, 0));
        graph[4].add(new Edge(4, 1));
        graph[5].add(new Edge(5, 0));
        graph[5].add(new Edge(5, 2));
    }

    public static void topologicalSortingUtil(ArrayList<Edge> graph[], int cur, boolean visited[], Stack<Integer> stack){
        visited[cur] = true;
        for(Edge e : graph[cur]){
            if(!visited[e.dest]){
                topologicalSortingUtil(graph, e.dest, visited, stack);
            }
        }
        stack.push(cur);
    }

    // Time : O(V+E)
    public static void topologicalSorting(ArrayList<Edge> graph[]){
        boolean visited[] = new boolean[graph.length];
        Stack<Integer> stack = new Stack<>();
        for(int i=0;i<graph.length;i++){
            if(!visited[i]){
                topologicalSortingUtil(graph, i, visited, stack);
            }
        }

        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
    }
    
    public static void main(String[] args) {
        int V = 6;
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);
        topologicalSorting(graph);
    }

}
