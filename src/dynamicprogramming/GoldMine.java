package dynamicprogramming;

import java.util.Scanner;

public class GoldMine {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int arr[][] = new int[n][m];
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		//int ans = maxGoldCollected(arr,n,m);
		int ans = maxGoldDP(arr);
		System.out.println(ans);
	}

	public static int maxGoldDP(int [][]arr) {
		int n = arr.length;
		int m = arr[0].length;
		
		int [][]dp = new int[n][m];
		// fill the last column
		for(int i=0;i<n;i++)
			dp[i][m-1] = arr[i][m-1];
		
		for(int c=m-2;c>=0;c--) {
			for(int r=0;r<n;r++) {
				if(r==0)
					dp[r][c] = Math.max(dp[r][c+1], dp[r+1][c+1]);
				else if(r==n-1)
					dp[r][c] = Math.max(dp[r-1][c+1], dp[r][c+1]);
				else {
						dp[r][c] = Math.max(Math.max(dp[r-1][c+1],
								dp[r][c+1]),dp[r+1][c+1]);
				}
				dp[r][c]+=arr[r][c];
			}
		}
//		for(int i=0;i<n;i++) {
//			for(int j=0;j<m;j++) 
//				System.out.print(dp[i][j]+" ");
//			System.out.println();
//		}
//		
		int max = 0;
		for(int i=0;i<n;i++) {
			if(max<dp[i][0])
				max = dp[i][0];
		}		
		return max;
	}
	
    public static int maxGoldCollected(int[][] mine, int n, int m) {
        int maxGold = 0;

        for (int i = 0; i < n; i++) {

            // Recursive function call for  ith row.
            int goldCollected = collect(mine, i, 0, n, m);
            maxGold = Math.max(maxGold, goldCollected);
        }

        return maxGold;
    }

    private static int collect(int[][] mine, int r, int c, int n, int m) {

        // Base condition.
        if ((r < 0) || (r == n) || (c == m)) {  
            return 0;
        }

        // Right upper diagonal.
        int upperDiagonal = collect(mine, r - 1, c + 1, n, m);

        // Straight right.  
        int straight = collect(mine, r, c + 1, n, m); 

        // Lower right diagonal.
        int lowerDiagonal = collect(mine, r + 1, c + 1, n, m);  

        // Return the maximum gold collected.
        return mine[r][c] + Math.max(Math.max(upperDiagonal, straight), lowerDiagonal);  
    }
    
}
/*


*/

/*
6
6
0 1 4 2 8 2
4 3 6 5 0 4
1 2 4 1 4 6
2 0 7 3 2 2
3 1 5 9 2 4
2 7 0 8 5 1
*/