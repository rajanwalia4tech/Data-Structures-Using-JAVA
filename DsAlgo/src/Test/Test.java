package Test;

public class Test {
	public static String[] singleDigit(int n) {
		if(n<=1 || n>=10)
			System.exit(0);
		if(n==2)
		{
			String key[] = {"a","b","c"};
			return key;
		}
		else if(n==3)
		{
			String key[] = {"d","e","f"};
			return key;
		}
		else if(n==4)
		{
			String key[] = {"g","h","i"};
			return key;
		}
		else if(n==5)
		{
			String key[] = {"j","k","l"};
			return key;
		}
		else if(n==6)
		{
			String key[] = {"m","n","o"};
			return key;
		}
		else if(n==7)
		{
			String key[] = {"p","q","r","s"};
			return key;
		}
		else if(n==8)
		{
			String key[] = {"t","u","v"};
			return key;
		}
		else
		{
			String key[] = {"w","x","y","z"};
			return key;
		}
	}
	
	public static void main(String[] args) {
		int n = 234;
		print(n);
	}
	
	private static void print(int n) {
		print(n,"");
	}
	
	private static void print(int n,String output) {
		if(n==0) {
			System.out.println(output);
			return ;
		}
			
		String small[] = singleDigit(n%10);
		for(int i=0;i<small.length;i++)
			print(n/10,small[i] + output);
	}
}
