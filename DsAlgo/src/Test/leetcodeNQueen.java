package Test;

import java.util.ArrayList;
import java.util.*;
public class leetcodeNQueen {

	public static void main(String[] args) {
		List<List<String>> r = solveNQueens(4);
		System.out.println(r);

	}

	public static List<List<String>> solveNQueens(int n) {
	    char[][] board = new char[n][n];
	        for(int i = 0; i < n; i++)
	            for(int j = 0; j < n; j++)
	                board[i][j] = '.';
	        List<List<String>> res = new ArrayList<List<String>>();
	        solveNQueens(0, board, res);
	        return res;
	    }
	    
	    public static void solveNQueens(int row,char[][] board,List<List<String>> res ){
	        if(row==board.length){
	        	System.out.println("he");
	            ArrayList<String> sol = new ArrayList<>();
	            for(int i=0;i<board.length;i++){
	                String s ="";
	                for(int j=0;j<board.length;j++){
	                    s+=board[i][j];
	                }
	                sol.add(s);
	            }
	            res.add(sol);
	            return ;
	        }
	        
	        for(int col=0;col<board.length;col++){
	            if(isBoardSafe(row,col,board)){
	            	System.out.println("b");
	                board[row][col] = 'Q';
	                solveNQueens(row+1,board,res);
	                board[row][col] = '.';
	            }
	        }
	    }
	    
	    public static boolean isBoardSafe(int row,int col,char[][] board){
	        int r = row;
	        int c = col;
	        
	        while(r>=0){
	            if(board[r][c] == 'Q') return false;
	            r--;
	        }
	        
	        r = row;
	        c = col;
	        while(r>=0 && c>=0){
	            if(board[r][c] == 'Q') return false;
	            r--;
	            c--;
	        }
	        
	        r = row;
	        c = col;
	        while(r>=0 && c<board.length){
	            if(board[r][c] == 'Q') return false;
	            r--;
	            c++;
	        }        
	        return true;
	        
	    }

}

