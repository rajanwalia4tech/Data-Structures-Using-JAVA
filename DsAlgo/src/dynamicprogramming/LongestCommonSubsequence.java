package dynamicprogramming;

public class LongestCommonSubsequence {

	public static void main(String[] args) {
		String s1 = "ae";
		String s2 = "aeg";
		
		int maxLength = lcsM(s1,s2);
		System.out.println(maxLength);
		
		maxLength = lcsDP(s1,s2);
		System.out.println(maxLength);
	}

	private static int lcsDP(String s1, String s2) {
		int n = s1.length();
		int m = s2.length();
		int [][]dp = new int[n+1][m+1];
		
		for(int i=1;i<n+1;i++) {
			for(int j=1;j<m+1;j++) {
				if(s1.charAt(i-1)==s2.charAt(j-1))
					dp[i][j] =1+ dp[i-1][j-1];
				else
					dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
			}
		}
		
		System.out.println("dp Table");
		for(int i=0;i<dp.length;i++) {
			for(int j=0;j<dp[0].length;j++)
				System.out.print(dp[i][j]+" ");
			System.out.println();
		}
		
		return dp[n][m];
	}

	private static int lcs(String s1, String s2) {
		int m = s1.length();
		int n = s2.length();
		
		if(m==0 || n==0)
			return 0;
		
		if(s1.charAt(0) == s2.charAt(0))
			return 1 + lcs(s1.substring(1),s2.substring(1));
		else
			return Math.max(lcs(s1.substring(1),s2), lcs(s1,s2.substring(1)));
	}
	static int lcsM(String s1,String s2) {
		int [][]memo = new int[s1.length()+1][s2.length()+1];
		for(int i=0;i<memo.length;i++) {
			for(int j=0;j<memo[0].length;j++)
				memo[i][j] = 0;
		}
		
		int l = lcsM(s1,s2,memo);
		
		System.out.println("Memo Table");
		for(int i=0;i<memo.length;i++) {
			for(int j=0;j<memo[0].length;j++)
				System.out.print(memo[i][j]+" ");
			System.out.println();
		}
		return l;
	}
	
	private static int lcsM(String s1, String s2,int[][] memo) {
		int n = s1.length();
		int m = s2.length();
		
		if(n==0 || m==0) {
			memo[n][m] = 0;
			return 0;
		}
		
		if(memo[n][m] != 0)
			return memo[n][m];
		
		if(s1.charAt(0) == s2.charAt(0))
			memo[n][m] = 1 + lcsM(s1.substring(1),s2.substring(1),memo);
		else {
			int op1 = lcsM(s1.substring(1),s2,memo);
			int op2 = lcsM(s1,s2.substring(1),memo);
			 memo[n][m] = Math.max(op1,op2);
		}
			
		return memo[n][m];
	}
	
}
