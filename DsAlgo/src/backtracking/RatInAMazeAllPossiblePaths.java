package backtracking;

public class RatInAMazeAllPossiblePaths {
	public static void main(String[] args) {
		int maze[][]= {
				{1,1,1,1,1},
				{0,0,0,1,1},
				{1,1,0,1,1},
				{1,0,1,0,1},
				{1,1,1,1,1}};
		System.out.println("Given Matrix ");
		for(int i=0;i<maze.length;i++) {
			for(int j=0;j<maze[i].length;j++) {
				System.out.print(maze[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
		int path[][] = new int[maze[0].length][maze.length];
		int x=0,y=0;
		printAllPaths(maze,x,y,path);
		
	}

	static boolean isSafe(int maze[][],int x,int y,int path[][]) {
		// next block is safe then return true else false	
		//path is for travesed path check
		if((x>=0 && x<maze.length && y>=0 && y<maze.length)
				&& (maze[x][y]==1 && path[x][y]==0 ) )
			return true;
		return false;
	}
	
	private static void printAllPaths(int[][] maze,int x,int y,int[][] path) {
		int n = maze.length;
		// Destination cell
		if(x==n-1 && y==n-1) {
			path[x][y]=1;
			for(int i=0;i<n;i++) {
				for(int j=0;j<n;j++) {
					System.out.print(path[i][j]+" ");
				}
				System.out.println();
			}
			System.out.println();
			path[x][y] = 0;
			return ;
		}
		
		if(isSafe(maze,x,y,path)) {
			path[x][y] = 1;
			printAllPaths(maze,x-1,y,path); // go up
			
			printAllPaths(maze,x,y+1,path);	// go right
			
			printAllPaths(maze,x+1,y,path);	// go down
			
			printAllPaths(maze,x,y-1,path);// go left
			
			path[x][y] = 0; // Backtracking
			//reset the traverse position when path is not possible
		}
	}
}
