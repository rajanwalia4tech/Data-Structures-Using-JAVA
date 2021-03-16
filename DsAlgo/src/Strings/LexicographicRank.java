package Strings;

public class LexicographicRank {
	
	public static int factorial(int n)
	{
		return (n<=1)?1:n*factorial(n-1);
	}
	
	public static int lexicographicRank(char s[])
	{
		int rank = 1;  // initialize the rank by one because rank = count of smaller strings + 1
		int n = s.length;
		int mul = factorial(n);
		int count[] = new int[256];
		
		for(int i=0;i<n;i++)
			count[s[i]]++;
		
		for(int i=1;i<256;i++)
			count[i] = count[i] + count[i-1];
		
		for(int i=0;i<n;i++)
		{
			mul = mul/(n-i);
			rank = rank + count[s[i]-1] * mul;
			
			for(int j=s[i];j<256;j++)
				count[j]--;
		}
		
		return rank;
	}

	public static void main(String[] args) {
		char s[] = "string".toCharArray();
		int rank = lexicographicRank(s);
		
		System.out.println(rank);
	}

}
