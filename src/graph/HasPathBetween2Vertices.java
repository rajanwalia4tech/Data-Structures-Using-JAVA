package graph;

import java.util.Scanner;

/*
 * Has Path?

Given an undirected graph G(V, E) and two vertices v1 and v2 (as integers), check if there exists any path between them or not. Print true if the path exists and false otherwise.
Note:
1. V is the number of vertices present in graph G and vertices are numbered from 0 to V-1. 
2. E is the number of edges present in graph G.
Input Format :
The first line of input contains two integers, that denote the value of V and E.
Each of the following E lines contains two integers, that denote that there exists an edge between vertex 'a' and 'b'.
The following line contain two integers, that denote the value of v1 and v2.
Output Format :
The first and only line of output contains true, if there is a path between v1 and v2 and false otherwise.
Constraints :
0 <= V <= 1000
0 <= E <= 1000
0 <= a <= V - 1
0 <= b <= V - 1
0 <= v1 <= 2^31 - 1
0 <= v2 <= 2^31 - 1
Time Limit: 1 second
Sample Input 1 :
4 4
0 1
0 3
1 2
2 3
1 3
Sample Output 1 :
true
Sample Input 2 :
6 3
5 3
0 1
3 4
0 3
Sample Output 2 :
false

 */
public class HasPathBetween2Vertices {

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
		
		int sourceVertex = s.nextInt();
		int destinationVertex = s.nextInt();
		boolean result = hasPathUsingDFS(adjMatrix,sourceVertex,destinationVertex);
		System.out.println(result);
	}

	private static boolean hasPathUsingDFS(int[][] adjMatrix,
			int sourceVertex, int destinationVertex) {
		boolean visited[] = new boolean[adjMatrix.length];
		return hasPathUsingDFS(adjMatrix,sourceVertex,destinationVertex,visited);
	}

	private static boolean hasPathUsingDFS(int[][] adjMatrix, int s,int d, boolean[] visited) {
		if(s==d)
			return true;
		visited[s] = true;
		for(int i=0;i<adjMatrix.length;i++) {
			if(adjMatrix[s][i]==1 && visited[i]==false) {
				
				return hasPathUsingDFS(adjMatrix,i,d,visited);
			}
		}
		return false;
	}

}
