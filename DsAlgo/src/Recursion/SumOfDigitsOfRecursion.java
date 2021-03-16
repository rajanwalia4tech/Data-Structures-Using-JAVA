package Recursion;

public class SumOfDigitsOfRecursion {
	
	public static int sum(int n) {
		if(n<10)
			return n;
		return sum(n/10) + n%10;
	}
	
	public static void main(String[] args) {
		int n = 12345;
		System.out.print(sum(n));
	}

}
