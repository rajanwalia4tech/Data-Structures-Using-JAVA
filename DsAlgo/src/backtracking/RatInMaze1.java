package backtracking;

/*
 * Code: Rat In A Maze

You are given a N*N maze with a rat placed at maze[0][0]. Find whether any path exist that 
rat can follow to reach its destination i.e. maze[N-1][N-1]. 
Rat can move in any direc­tion ( up and right).
Value of every cell in the maze can either be 0 or 1. 
Cells with value 0 are blocked means rat can­not enter into those cells and 
those with value 1 are open.
Input Format
Line 1: Integer N
Next N Lines: Each line will contain ith row elements (separated by space)
Output Format :
The output line contains true if any path exists for the rat to reach its destination
 otherwise print false.
Sample Input 1 :
3
1 0 1
1 0 1
1 1 1
Sample Output 1 :
true 
1 0 1 
1 0 1
1 1 1
Sample Input 2 :
3
1 0 1
1 0 1
0 1 1
Sample Output 2 :
 false
 */
public class RatInMaze1 {

	public static void main(String[] args) {
		int maze[][]= {
				{1,0,1,0,1},
				{1,1,1,1,1},
				{0,1,1,1,0},
				{1,0,1,1,1},
				{1,1,1,0,1} };
		System.out.println("Given Matrix ");
		for(int i=0;i<maze.length;i++) {
			for(int j=0;j<maze[i].length;j++) {
				System.out.print(maze[i][j]+" ");
			}
			System.out.println();
		}
		
		int path[][] = new int[maze[0].length][maze.length];
		int x=0,y=0;
		if(ratInMaze(maze,x,y,path)) {
			System.out.println("Solution Matrix");
			for(int i=0;i<path.length;i++) {
				for(int j=0;j<path[i].length;j++) {
					System.out.print(path[i][j]+" ");
				}
				System.out.println();
			}
		}
		else
			System.out.println("No path Available");
	}

	static boolean isSafe(int maze[][],int x,int y) {
		// next block is safe then return true else false
		if((x<maze.length && y<maze.length) && maze[x][y]==1)
			return true;
		return false;
	}
	
	private static boolean ratInMaze(int[][] maze,int x,int y,int[][] path) {
		int n = maze.length;
		// Destination cell
		if(x==n-1 && y==n-1) {
			path[x][y]=1;
			
			return true;
		}
		if(isSafe(maze,x,y)) {
			path[x][y] = 1;
			if(ratInMaze(maze,x+1,y,path)) {// go right
				return true;
			}
			if(ratInMaze(maze,x,y+1,path)) { // go down
				return true;
			}
			path[x][y] = 0; // Backtracking
			//reset the traverse position when path is not possible
			return false;
		}
		return false;
	}
}
