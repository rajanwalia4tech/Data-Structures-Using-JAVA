package recursionOnStrings;

public class ReplaceCharacters {

	public static void main(String[] args) {
		String s = "ababababasdsfdb";
		char c1 = 'b';
		char c2 = 'x';
		String ans = replacec1Byc2(s,c1,c2);
		System.out.println(ans);
	}

	private static String replacec1Byc2(String s,char c1 ,char c2) {
		if(s.length()==0)
			return "";
		String smallAns = replacec1Byc2(s.substring(1),c1,c2);
		String ans = smallAns;
		if(s.charAt(0)==c1)	// if char is 'a' replace by 'x's
		{
			ans = c2 + ans;
		}
		else { 	// if char is not 'a'
			ans = s.charAt(0) + ans;
		}
		return ans;
	}
}
