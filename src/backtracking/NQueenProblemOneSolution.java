package backtracking;

import java.util.Scanner;

public class NQueenProblemOneSolution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Board size : ");
		int n = sc.nextInt();
		int[][] arr = new int[n][n];
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++)
				arr[i][j] = 0;	// Initialize Board
		}
		if(nQueen(arr,0,n)) {
			for(int i=0;i<n;i++) {
				for(int j=0;j<n;j++)
					System.out.print(arr[i][j]+" ");
				System.out.println();
			}
		}else {
			System.out.println("Solution Not Exist");
		}
	}
	
	private static boolean nQueen(int[][] arr, int row, int n) {
		if(row==n) {
			return true;
		}
		for(int col=0;col<n;col++) {
			if(isBoardSafe(arr,row,col,n)) {
				arr[row][col] = 1;
				if(nQueen(arr,row+1,n)){
					return true;
				}
				arr[row][col] = 0; // Backtracking
			}
		}
		return false;
	}
	
	private static boolean isBoardSafe(int[][] arr,int x,int y,int n) {
		int row = x;
		int col = y;
		
		// check column if queen present or not
		for(int i=0;i<row;i++) {
			if(arr[i][col] == 1) {
				return false;
			}
		}
		//check left diagonal if queen present or not
		while(row>=0 && col>=0) {
			if(arr[row][col] == 1)
				return false;
			row--;
			col--;
		}
		row = x;
		col = y;
		// check Right Diagonal if queen present or not
		while(row>=0 && col<n) {
			if(arr[row][col] == 1)
				return false;
			row--;
			col++;
		}
		return true;	// If safe 
	}

	
}
