package graph;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class AdjacencyMatrixImplementation {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int v = s.nextInt(); // no. of vertices
		int e = s.nextInt(); // no. of edges
		int adjMatrix[][] = new int[v][v]; //adjacency Matrix
		for(int i=0;i<e;i++) {
			int v1 = s.nextInt();
			int v2 = s.nextInt();
			adjMatrix[v1][v2] = 1;
			adjMatrix[v2][v1] = 1;
		}
		
		for(int i=0;i<v;i++) {
			for(int j=0;j<v;j++) {
				System.out.print(adjMatrix[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("DFS Travesal");
		dfsTraversal(adjMatrix);
		
		System.out.println("BFS Traversal");
		bfsTraversal(adjMatrix);
	}
	
	// Time :- O(v^2)
	private static void bfsTraversal(int[][] adjMatrix) {
		Queue<Integer> pendingVertices = new LinkedList<>();
		boolean visited[] = new boolean[adjMatrix.length];
		visited[0] = true;
		pendingVertices.add(0);
		
		while(!pendingVertices.isEmpty()) {
			int currentVertex = pendingVertices.poll();
			System.out.print(currentVertex+" ");
			for(int i=0;i<adjMatrix.length;i++) {
				if(adjMatrix[currentVertex][i]==1 && visited[i]==false) {
					// i is unvisited neighbour of currentVertex
					pendingVertices.add(i);
					visited[i] = true;
				}
			}
		}
	}

	// Time :- O(v^2)
	public static void dfsTraversal(int adjMatrix[][]) {
		boolean visited[] = new boolean[adjMatrix.length];
		dfsTraversal(adjMatrix,0,visited);
	}

	private static void dfsTraversal(int[][] adjMatrix, int currentVertex,
			boolean[] visited) {
		System.out.print(currentVertex+" ");
		visited[currentVertex] = true;
		for(int i=0;i<adjMatrix.length;i++) {
			if(adjMatrix[currentVertex][i]==1 && visited[i]==false) {
				// i is the neighbour vertex
				dfsTraversal(adjMatrix,i,visited);
			}
				
		}
		 
		
	}
}
