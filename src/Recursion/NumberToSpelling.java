package Recursion;

public class NumberToSpelling {

	public static void main(String[] args) {
		int n=2056;
		printNumberToSpelling(n);
		System.out.println();
		System.out.println(returnNumberToSpelling(n));
	}
	
	private static String returnNumberToSpelling(int n) {
		if(n==0)
			return "" ;
		String ans = returnNumberToSpelling(n/10);
		String word = convertNoToWord(n%10);
		ans +=word + " ";
		return ans;
	}
	
	private static void printNumberToSpelling(int n) {
		if(n==0)
			return ;
		printNumberToSpelling(n/10);
		String word = convertNoToWord(n%10);
		System.out.print(word+" ");
	}

	private static String convertNoToWord(int digit) {
		String word[] = {"zero","one","two","three","four",
					"five","six","seven","eight","nine"
		};
		return word[digit];
	}

}
