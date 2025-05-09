package recursionOnStrings;

public class ReplacePI {
	public static void main(String[] args) {
		String s = "piipi";
		String ans = replacepi(s);
		System.out.println(ans);
	}

	private static String replacepi(String s) {
		if(s.length()<=1)
			return s;
		String smallAns ="";
		String ans = smallAns;
		if(s.substring(0,2).equals("pi") ) {
			smallAns = replacepi(s.substring(2));
			ans= "3.14" + smallAns;
		}
		else {
			smallAns = replacepi(s.substring(1));
			ans = s.charAt(0) + smallAns;		
		}
		return ans;
	}
}
