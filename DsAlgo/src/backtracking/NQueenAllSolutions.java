package backtracking;

import java.io.*;
import java.util.*;

public class NQueenAllSolutions {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the board Size : ");
        int n = scn.nextInt();
        int [][]chess = new int[n][n];
        printNQueens(chess,"",0);
    }
    
    public static void printNQueens(int[][] chess, String qsf, int row) {
        if(row == chess.length){
           //System.out.println(qsf+".");
            for(int i=0;i<chess.length;i++) {
				for(int j=0;j<chess.length;j++) {
					System.out.print(chess[i][j]+" ");
				}
				System.out.println();
			}
            System.out.println();
            return ;
        }
        
        for(int col=0;col<chess.length;col++){
            if(isQueenSafe(chess,row,col) == true){
                chess[row][col] = 1;
                printNQueens(chess, qsf+row+"-"+col+", ",row+1);
                chess[row][col]=0;
            }
        }
    }
    
    //Check if given queen is safe or not
    public static boolean isQueenSafe(int [][]chess, int row, int col){
        // check in Vertical coloumn
        for(int i=row-1,j=col;i>=0;i--){
            if(chess[i][j]==1)
                return false;
        }
        
        // check in left diagonal
        for(int i=row-1,j=col-1;i>=0 && j>=0;i--,j--){
            if(chess[i][j]==1)
                return false;
        }
        
        // check in right diagonal
        for(int i=row-1,j=col+1;i>=0 && j<chess.length;i--,j++){
            if(chess[i][j]==1)
                return false;
        }
        return true;
    }


}