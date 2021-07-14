package recursionOnStrings;
/*
 * Print all Codes - String

Assume that the value of a = 1, b = 2, c = 3, ... , z = 26. You are given a numeric string S. Write a program to print the list of all possible codes that can be generated from the given string.
Note : The order of codes are not important. Just print them in different lines.
Input format :
A numeric string S
Output Format :
All possible codes in different lines
Constraints :
1 <= Length of String S <= 10
Sample Input:
1123
Sample Output:
aabc
kbc
alc
aaw
kw

 */
public class printAllCodes {

	public static void main(String[] args) {
		String code = "12345";
		 printCodes(code);
		
	}
	
	private static char getCodes(int n) {
		return (char)(96 + n);
	}
	
	private static void printCodes(String s) {		
		printCodes(s,"");
		
	}

	private static void printCodes(String s, String output) {
		if(s.length()==0) {
			System.out.println(output);
			return ;
		}
		int firstDigit = s.charAt(0) - '0';
		String firstDigitChar = getCodes(firstDigit)  + "";
		printCodes(s.substring(1),output + firstDigitChar);
		
		if(s.length()>=2) {
			int secondDigit = (s.charAt(0)-'0')*10 + (s.charAt(1) - '0');
			if(secondDigit>=10 & secondDigit<=26) {
			String firstTwoDigitChar = getCodes(secondDigit)+"";
			printCodes(s.substring(2),output + firstTwoDigitChar);
			}
		}
	}

}
