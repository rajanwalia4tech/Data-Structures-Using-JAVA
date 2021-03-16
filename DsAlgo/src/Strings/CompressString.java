package Strings;

public class CompressString {

	public static void main(String[] args) {
		String s = "abcdaasaa";
		s = compress(s);
		System.out.println(s);
	}

	private static String compress(String s) {
		if(s.length()==0)
			return "";
		String ans="";
		int count=1;
		for(int i=0;i<s.length()-1;i++) {
			if(s.charAt(i)!=s.charAt(i+1)) {
				if(count!=1)
					ans+=s.charAt(i)+Integer.toString(count);
				else
					ans+=s.charAt(i);
				count=1;
			}else
				count++;
		}
		if(count!=1)
			ans+=s.charAt(s.length()-1)+Integer.toString(count);
		else
			ans+=s.charAt(s.length()-1);
		return ans;
	}
}
