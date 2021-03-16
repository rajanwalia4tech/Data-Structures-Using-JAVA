package recursionOnStrings;

public class StringToInteger {

	public static void main(String[] args) {
		String s = "0";
		int ans = convertToInteger(s);
		System.out.println(ans);
	}

	private static int convertToInteger(String s) {
		if(s.length()==1)
			return s.charAt(0) - '0';
		int small = convertToInteger(s.substring(0,s.length()-1));
		int integer= s.charAt(s.length()-1) - '0';
		return small*10 +integer;
	}
}
