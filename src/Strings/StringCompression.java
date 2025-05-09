package Strings;
import java.util.*;
public class StringCompression {

	public static String compression1(String str){
		String ans = String.valueOf(str.charAt(0)) ;
		for(int i=1;i<str.length();i++) {
			char cur = str.charAt(i);
			char prev = str.charAt(i-1);
			if(cur!=prev)
				ans+=cur;
		}
		return ans;
	}

	public static String compression2(String str){
		String ans = String.valueOf(str.charAt(0)) ;
		int count = 1;
		for(int i=1;i<str.length();i++) {
			char cur = str.charAt(i);
			char prev = str.charAt(i-1);
			if(cur==prev) {
				count++;
			}
			else {
				if(count>1)
				ans+=count;
				ans+=cur;
				count=1;
			}
		}
		if(count>1)
		ans+=count;
		return ans;
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		System.out.println(compression1(str));
		System.out.println(compression2(str));
	}
}
