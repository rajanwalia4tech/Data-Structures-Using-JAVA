package Strings;
import java.util.*;
public class PrintAllPermutationsOfAStringIteratively {
	public static void solution(String str){
		int f = factorial(str.length());
		int n = str.length();
		for(int i=0;i<f;i++)
		{
		    int temp = i;
		    StringBuilder s = new StringBuilder(str);
		    
		    for(int div = n;div>=1;div--){
		        int que = temp/div;
		        int rem = temp%div;
		        System.out.print(s.charAt(rem));
		        s.deleteCharAt(rem);
		        temp = que;
		    }
		    System.out.println();
		}
	}
	
	public static int factorial(int n){
	    int f=1;
	    for(int i=2;i<=n;i++)
	        f*=i;
	   return f;
	}
	public static void main(String[] args) {
		String str = "ABCD";
		solution(str);
	}

	
	
}
