package dynamicprogramming;

public class MinimumCoinChange {

	public static void main(String[] args) {
		int coins[] = {1,7,10};
		int n = 55;
		int memo[] = new int[n+1];
		int minCoins = memoization(n,coins,memo);
		System.out.println(minCoins);
		System.out.println(tabulation(n,coins));
	}
	
	// Time = O(n * coins.length)
	private static int memoization(int n, int[] coins, int[] memo) {
		if(n==0) // Base Case
			return 0;
		if(memo[n]!=0)
			return memo[n];
		int min = Integer.MAX_VALUE;
		for(int i=0;i<coins.length;i++) {
			if(n-coins[i]>=0) {
				int subProblem = 1+memoization(n-coins[i], coins, memo);
				min = Math.min(subProblem, min) ;
			}
		}
		memo[n] = min;
		return memo[n];
	}
	// Time = O(n * coins.length)
	private static int tabulation(int n, int[] coins) {
		int dp[] = new int[n+1];
		for(int i=1;i<=n;i++) {
			dp[i] = Integer.MAX_VALUE;
			for(int j=0;j<coins.length;j++) {
				if(i-coins[j]>=0) {
					int subProb = 1+dp[i-coins[j]];
					dp[i] = Math.min(dp[i],subProb);
				}
			}
		}
		return dp[n];
	}

}
