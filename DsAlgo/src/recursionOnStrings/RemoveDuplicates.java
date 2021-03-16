package recursionOnStrings;

//Given a string S,
//remove consecutive duplicates from it recursively.
public class RemoveDuplicates {

	public static void main(String[] args) {
		String s = "xxxyyyabnnnnn";
		String ans = removeDuplicates(s);
		System.out.println(ans);
	}

	private static String removeDuplicates(String s) {
		if(s.length()<=1)
			return s;
		if(s.charAt(0)!=s.charAt(1)) {
			String small =removeDuplicates(s.substring(1));
			return s.charAt(0) + small;
		}
		else 
			return removeDuplicates(s.substring(1));
	}
}
