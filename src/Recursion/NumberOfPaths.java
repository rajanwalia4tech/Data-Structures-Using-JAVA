package Recursion;

public class NumberOfPaths {
	
	 static long numberOfPaths(int row, int col) {
	        if(row==1 || col==1)
	        {
	        	return 1;
	        }
	        long rowsPaths = numberOfPaths(row-1,col);
	        long colsPaths = numberOfPaths(row,col-1);
	        return rowsPaths+colsPaths;
	    }
	public static void main(String[] args) {
		int m=3,n=3;
		System.out.print(numberOfPaths(m, n));
	}

}
