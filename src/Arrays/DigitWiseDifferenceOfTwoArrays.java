package Arrays;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class DigitWiseDifferenceOfTwoArrays {
	
	public static void main(String[] args) throws Exception {
		
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	    int n1 = Integer.parseInt(br.readLine());
	    int[] a1 = new int[n1];
	    for(int i = 0; i < n1; i++){
	       a1[i] = Integer.parseInt(br.readLine());
	    }

	    int n2 = Integer.parseInt(br.readLine());
	    int[] a2 = new int[n2];
	    for(int i = 0; i < n2; i++){
	       a2[i] = Integer.parseInt(br.readLine());
	    }

	    int[] difference = new int[n1 > n2? n1: n2];
	    int i = n1 - 1;
	    int j = n2 - 1;
	    int k = difference.length - 1;
	    int c = 0;
	    while(i >= 0 || j >= 0){
	       int d = c;

	       if(a[i]<a[j]) {
	    	  
	       }
	       
	       
	       if(i >= 0)		
	         d += a1[i];

	      if(j >= 0)
	         d += a2[j];

	       c = d / 10;
	       d = d % 10;
	       difference[k] = d;

	       i--;
	       j--;
	       k--;
	    }
	    if(c > 0){
	       System.out.println(c);
	    }
	    for(int val: difference){
	       System.out.println(val);
	    }


}
}