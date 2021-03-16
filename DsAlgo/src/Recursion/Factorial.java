package Recursion;

public class Factorial {

	public static long fact(int n) {
		System.out.println("call fun("+n+")");
		if(n<1)
			return 1;
		long f = n*fact(n-1);
		System.out.println("done! fact("+n+")-"+f);
		return f;
	}
	
	public static void main(String[] args) {
		System.out.println(fact(100));

	}

}
