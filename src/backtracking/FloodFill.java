package backtracking;
import java.util.Scanner;




public class FloodFill {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = scn.nextInt();
            }
        }
        floodfill(arr);
    }

    public static void floodfill(int[][] maze) {
        int row=0;
        int col=0 ;
       
        boolean visited[][] = new boolean[maze.length][maze[0].length];
            
        floodfill(maze,row,col,visited,"");
    }
    
    static boolean isSafe(int [][]maze,int row,int col,boolean[][] visited){
        if(row<0 ||col<0 || row>=maze.length || col>=maze[0].length ||
        maze[row][col]==1 || visited[row][col] == true)
            return false;
        
        return true;
    }
    public static void floodfill(int[][] maze,int row,int col,boolean[][] visited,String path){
        if(row==maze.length-1 && col==maze[0].length-1){
            System.out.println(path);
            return;
        }
        
        if(isSafe(maze,row,col,visited)){
            visited[row][col]=true;
            floodfill(maze,row-1,col,visited,path +"t");
            floodfill(maze,row,col-1,visited,path +"l");
            floodfill(maze,row+1,col,visited,path +"d");
            floodfill(maze,row,col+1,visited,path +"r");
            visited[row][col] = false;
        }
    }

}
