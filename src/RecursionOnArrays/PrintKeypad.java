package RecursionOnArrays;

public class PrintKeypad {


	public static String[] singleDigit(int n) {
		if(n<=1 || n>=10)
			return new String[0];
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
	
	private static void printKeypad(int input){
		printKeypad(input,"");
	}
	
	
	private static void printKeypad(int input,String output) {
		if(input == 0)
		{
			System.out.println(output);
			return;
		}
		String singleDigit[] = singleDigit(input%10);
		for(int i=0;i<singleDigit.length;i++)
		{
			printKeypad(input/10,singleDigit[i]+output);
		}
	}
	public static void main(String[] args) {
		int input = 70;
		printKeypad(input);
	}

}
