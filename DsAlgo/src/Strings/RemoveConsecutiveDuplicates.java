package Strings;

public class RemoveConsecutiveDuplicates {

	public static void main(String[] args) {
		String s = "aaacccsssabcs";
		s = removeDuplicates(s);
		System.out.println(s);
	}

	private static String removeDuplicates(String s) {
		if(s.length()==0)
			return "";
		String ans="";
		for(int i=0;i<s.length()-1;i++) {
			if(s.charAt(i)!=s.charAt(i+1)) {
				ans+=s.charAt(i);
			}
		}
		ans+=s.charAt(s.length()-1);
		return ans;
	}
}
