package recursionOnStrings;

public class PairStar {

	public static void main(String[] args) {
		String s = "hello Tommorow";
		String ans = pairstar(s);
		System.out.println(ans);
	}

	private static String pairstar(String s) {
		if(s.length()<=1)return s;
		String ans = "";
		if(s.charAt(0) == s.charAt(1)) {
			String small = pairstar(s.substring(1));
			ans = s.charAt(0) + "*" + small;	
		}else {
			ans = s.charAt(0) +pairstar(s.substring(1));
		}
	return ans;
	}

}
