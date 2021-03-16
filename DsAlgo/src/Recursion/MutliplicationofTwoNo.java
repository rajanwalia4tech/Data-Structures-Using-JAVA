package Recursion;

public class MutliplicationofTwoNo {

	public static void main(String[] args) {
		int a=3;
		int b=20;
		System.out.println(multiply(a,b));

	}

	private static int  multiply(int a, int b) {
		if(a==0 || b==0)
			return 0;
		int mul = multiply(a,b-1);
		int ans = a+mul;
		return ans;
	}

}
