package Recursion;

public class Test {
		
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
		
		public static String[] Keypad(int n){
			if(n==0)
			{
				String keys[] = {""};
				return keys;
			}
			String[] smallerNumberArray = Keypad(n/10);
			String singleDigitKeys[] = singleDigit(n%10);
			String[] totalKeys = new String[singleDigitKeys.length *smallerNumberArray.length];
			int k=0;
			for(int i=0;i<singleDigitKeys.length;i++)
			{
				for(int j=0;j<smallerNumberArray.length;j++)
				{
					totalKeys[k] = smallerNumberArray[j] +singleDigitKeys[i];
					k++;
				}
			}
		return totalKeys;
		}

		public static void main(String[] args) {
			int n =47;
			String totalKeys[] = Keypad(n);
			for(String keys : totalKeys)
				System.out.println(keys);
		}
	}
