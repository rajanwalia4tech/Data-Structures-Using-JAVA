package Strings;

public class ReverseEachWord {

	public static void main(String[] args) {
		String s = "My name is rajan";
		s = reverse(s);
		System.out.println(s);
	}

	private static String reverse(String s) {
		String ans="";
		int currentWordStart = 0; // start index of each new word
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)==' ' || i==s.length()-1) {
				int currentWordEnd; //End index of each word
				if(s.length()-1==i)
					currentWordEnd = s.length()-1; 
				else
					currentWordEnd=i-1;
				String reversedWord ="";
				for(int j=currentWordStart;j<=currentWordEnd;j++) {
					reversedWord = s.charAt(j) + reversedWord;
				}
				ans+=reversedWord+' ';//add each reversed word into answer
				currentWordStart = i+1;//Change the index for next word
			}
		}
		return ans;
	}
}
