package Recursion;

public class Print_N_To_1 {
	
	static void fun(int n) {
		if(n<1)
			return ;
		System.out.println(n);
		fun(n-1);
		
	}
		
	public static void main(String[] args) {
		fun(5);
	}

}
