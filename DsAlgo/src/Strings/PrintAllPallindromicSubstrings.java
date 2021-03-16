package Strings;

import java.util.Scanner;

public class PrintAllPallindromicSubstrings {

	public static void solution(String str){
		for(int i=0;i<str.length();i++)
		{
		    for(int j=i+1;j<=str.length();j++)
		    {
		    	String substring = str.substring(i,j);
		    	int length = substring.length();
		    	boolean flag = true;
		    	for(int k=0;k<=length/2;k++) {
		    		if(substring.charAt(k) != substring.charAt(length - k - 1))
		    		{
		    			flag=false;
		    		}
		    	}
		    	if(flag)
		    		System.out.println(str.substring(i,j));
		    }
		}
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		solution(str);
	}	
	
}
