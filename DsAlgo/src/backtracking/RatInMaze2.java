package backtracking;

public class RatInMaze2 {
	public static void main(String[] args) {
		int maze[][]= {
				{1,1,1,0,1},
				{0,0,1,1,1},
				{1,1,1,1,0},
				{1,0,0,0,1},
				{1,1,1,1,1} };
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

	static boolean isSafe(int maze[][],int x,int y,int path[][]) {
		// next block is safe then return true else false	
		//path is for travesed path check
		if((x>=0 && x<maze.length && y>=0 && y<maze.length)
				&& (maze[x][y]==1 && path[x][y]==0 ) )
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
		
		if(isSafe(maze,x,y,path)) {
			path[x][y] = 1;
			if(ratInMaze(maze,x-1,y,path)) {	// go up
				return true;
			}
			if(ratInMaze(maze,x,y+1,path)) {	// go right
				return true;
			}
			if(ratInMaze(maze,x+1,y,path)) {	// go down
				return true;
			}
			if(ratInMaze(maze,x,y-1,path)) { // go left
				return true;
			}
			path[x][y] = 0; // Backtracking
			//reset the traverse position when path is not possible
			return false;
		}
		return false;
	}
}
