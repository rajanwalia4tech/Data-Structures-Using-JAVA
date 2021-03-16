package Strings;

public class ReverseStringWordWise {

	public static void main(String[] args) {
		String s = "My name is rajan";
		s = reverse(s);
		System.out.println(s);
	}

	private static String reverse(String s) {
		int currentWordStart=0;
		String ans="";
		for(int i=0;i<s.length();i++) {
			if(i==s.length()-1 || s.charAt(i)==' ') {
				int currentWordEnd;
				if(i==s.length()-1)
					currentWordEnd=s.length()-1;
				else 
					currentWordEnd = i-1;
				//Find substring for each word;
				String word = s.substring(currentWordStart,currentWordEnd+1);
				ans= word+" " +ans ;
				currentWordStart = i+1;
			}
		}
		return ans;
	}
}
