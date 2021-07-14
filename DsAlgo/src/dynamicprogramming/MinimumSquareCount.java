package dynamicprogramming;

public class MinimumSquareCount {
	public static void main(String[] args) {
		int n=58;
		int res ;
		res = minCountSquare(n);
		System.out.println(res);
		int[] memo = new int[n+1];
		res = memo(n,memo);	// Memoization
		System.out.println(res);
		
		//Tabulation
		int[] dp = new int[n+1];
		res = dp(n,dp);
		System.out.println(res);
	}

	private static int dp(int n, int[] dp) {
		dp[0] = 0;
		dp[1] = 1;
		
		for(int i=2;i<=n;i++) {
			int min = Integer.MAX_VALUE;
			for(int j=1; j*j<=i;j++) {
				if(i-j*j<0) {
					break;
				}
				min = Math.min(dp[i - j*j],min);
			}
			dp[i] = min+1;
		}
		return dp[n];
	}

	private static int minCountSquare(int n) {
		if(n == 0)
			return 0;
		int min = Integer.MAX_VALUE;
		
		for(int i=1;i<=Math.sqrt(n);i++) {
			int curMin = 1 + minCountSquare(n-i*i);
			min = Math.min(curMin, min);
		}
		
		return min;
	}
	
	private static int memo(int n,int[] memo) {
		if(n == 0)
			return 0;
		if(memo[n]!=0) return memo[n];
		
		int min = Integer.MAX_VALUE;
		
		for(int i=1;i<=Math.sqrt(n);i++) {
			int curMin = 1 + memo(n-i*i,memo);
			min = Math.min(curMin, min);
		}
		memo[n] = min;
		return memo[n];
	}
	
}
