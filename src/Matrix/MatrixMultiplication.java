package Matrix;

import java.util.Scanner;

public class MatrixMultiplication {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int m = sc.nextInt();
	    int a[][] =new int[n][m];
	    for(int i=0;i<n;i++){
	        for(int j=0;j<m;j++)
	            a[i][j] = sc.nextInt();
	    }
	    
	    int p = sc.nextInt();
	    int q = sc.nextInt();
	    int b[][] =new int[p][q];
	    for(int i=0;i<p;i++){
	        for(int j=0;j<q;j++)
	            b[i][j] = sc.nextInt();
	    }
	    
	    if(m!=p) {
	    	System.out.println("Invalid input");
	    }
	    else
	    {
		    for(int i=0;i<n;i++){
		        for(int j=0;j<q;j++) {
		        	int sum=0;
		        	for(int k=0;k<p;k++) {
		        		sum+=a[i][k]*b[k][j];
		        	}
		        	System.out.print(sum+" ");
		        }
		        System.out.println();
		    }
	    }
	}

}
