package recursionOnStrings;

public class Removex {

	public static void main(String[] args) {
		String s = "xxxx";
		String ans = removex(s);
		System.out.println(ans);
	}

	private static String removex(String s) {
		if(s.length()==0)
			return "";
		String smallAns = removex(s.substring(1));
		String ans = smallAns;
		if(s.charAt(0)!='x')
		{
			ans = s.charAt(0) + ans;
		}
		return ans;
	}
}
