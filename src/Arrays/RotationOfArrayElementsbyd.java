package Arrays;
import java.io.*;
import java.util.*;
public class RotationOfArrayElementsbyd {


	  public static void display(int[] a){
	    StringBuilder sb = new StringBuilder();

	    for(int val: a){
	      sb.append(val + " ");
	    }
	    System.out.println(sb);
	  }

	  public static void rotate(int[] a, int k){
	    int d = k%a.length;
	    int []arr = new int[d];
	    
	    for(int i=a.length-d,j=0;i<a.length;i++,j++){
	        arr[j] = a[i];
	    }
	    
	    for(int j=a.length-d-1;j>=0;j--) {
	    	a[j+d] = a[j];
	    }
	    for(int j=0;j<d;j++)
	    {
	    	a[j] = arr[j];
	    }
	    
	  }

	public static void main(String[] args) throws Exception {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	    int n = Integer.parseInt(br.readLine());
	    int[] a = new int[n];
	    for(int i = 0; i < n; i++){
	       a[i] = Integer.parseInt(br.readLine());
	    }
	    int k = Integer.parseInt(br.readLine());

	    rotate(a, k);
	    display(a);
	 }

	
}
