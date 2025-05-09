package Recursion;

public class Print_1_To_N {

	static void fun(int n) {
		if(n<1)
			return ;
		fun(n-1);
		System.out.println(n);
		
	}
		
	public static void main(String[] args) {
		fun(5);
	}

}
