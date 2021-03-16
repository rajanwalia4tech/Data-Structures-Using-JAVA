package RecursionOnArrays;
import java.util.HashMap;

/*
Problem - Return Keypad Code

Given an integer n, using phone keypad find out all the possible strings that can be made using digits of input n.
Return empty string for numbers 0 and 1.

Note : 1. The order of strings are not important.
2. Input and output has already been managed for you. You just have to populate the output array and return the count of elements populated in the output array.
Input Format :
Integer n
Output Format :
All possible strings in different lines
Constraints :
1 <= n <= 10^6
Sample Input:
23
Sample Output:
ad
ae
af
bd
be
bf
cd
ce
cf
*/

public class Returnkeypad {
	
	public static String[] singleDigit(int n) {
		if(n<=1 || n>=10)
			return new String[] {" "};
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
		int n =233;
		String totalKeys[] = Keypad(n);
		for(String keys : totalKeys)
			System.out.println(keys);
	}
}

/*
HashMap<Integer,String> map = new HashMap<>();
map.put(2,"abc");
map.put(3,"def");
map.put(4,"ghi");
map.put(5,"jkl");
map.put(6,"mno");
map.put(7,"pqr");
map.put(8,"stu");
map.put(9,"wxyz");
*/