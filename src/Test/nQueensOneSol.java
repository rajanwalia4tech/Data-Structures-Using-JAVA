package Test;

import java.util.Scanner;

public class nQueensOneSol {

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
	
			
		for(int col = 0;col<n;col++) {
			if(isSafe(arr,row,col,n)) {
				arr[row][col] = 1;
				if(nQueen(arr,row+1,n)){
					return true;
				}
				arr[row][col] = 0; // Bactracking
			}
		}
		return false;
	}

	private static boolean isSafe(int[][] arr, int x, int y, int n) {
		
		int row = x;
		int	col = y;
		
		// vertical col
		while(row>=0) {
			if(arr[row][col] == 1)
				return false;
			row--;
		}
		//Left Diagonal
		row = x;
		col = y;
		
		while(col>=0 && row>=0) {
			if(arr[row][col] == 1)
				return false;
			col--;
			row--;
		}
		
		//Right Diagonal
		row = x;
		col = y;
		
		while(col<n && row>=0) {
			if(arr[row][col] == 1)
				return false;
			col++;
			row--;
		}
		
		return true;
	}
	
}
