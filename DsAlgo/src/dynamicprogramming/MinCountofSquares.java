package dynamicprogramming;

public class MinCountofSquares {

	public static void main(String[] args) {
		int n=6;
		int res = minCountMemo(n);
		System.out.println(res);
	}

	static int minCountMemo(int n) {
		int memo[] = new int[n+1];
		return minCountMemo(n,memo);
	}
	private static int minCountMemo(int n,int memo[]) {
		if(n==0)
			return 0;
		int min = n;	// current minimum as no.
		for(int i=1;i<=Math.sqrt(n);i++) {
			if(n-i*i>=0) {
				if(memo[n-i*i]!=0)
					return memo[n];
				// calling the n-i*i the no.
				min = minCountMemo(n-i*i,memo);
				//finding minimum 
				memo[n] = 1 + Math.min(memo[n],min);	
			}
		}
		return memo[n];
	}
	
	
	
	
	
	
	private static int minCount(int n) {
		if(n==0)
			return 0;
		int min = n;	// current minimum as no.
		for(int i=1;i<=Math.sqrt(n);i++) {
			if(n-i*i>=0) {
				// calling the n-i*i the no.
				int res = minCount(n-i*i);
				//finding minimum 
				min = 1 + Math.min(res,min);	
			}
		}
		return min;
	}

}
