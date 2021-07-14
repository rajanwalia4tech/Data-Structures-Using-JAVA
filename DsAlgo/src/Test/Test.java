package Test;

import java.util.ArrayList;

public class Test {
	static int  count=0;
	    public static void main(String args[]) {
	        System.out.println(numDecodings("226"));
	    }

	     
	    public static int numDecodings(String s) {
	        numDecodings(s,0);
	        return count;
	    }
	    public static void numDecodings(String s,int c) {
	        if(s.length() == 0){
	            count++;
	            return ;
	        }
	        int firstDigit = (int)(s.charAt(0)-'0');
	        if(firstDigit!=0){
	            numDecodings(s.substring(1),c);
	            if(s.length()>=2){
	                int secondDigit = (int)(s.charAt(1)-'0');
	                int twoDigit = firstDigit*10 + secondDigit;
	                if(twoDigit>=10 && twoDigit<=26)
	                    numDecodings(s.substring(2),c);
	            }
	        }
	    }
	}
