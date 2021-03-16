package RecursionOnArrays;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class MaxOfArray {

    public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    int n = Integer.parseInt(br.readLine());
	    int[] a = new int[n];
	    for(int i = 0; i < n; i++){
	       a[i] = Integer.parseInt(br.readLine());
	    }
	    int max = maxOfArray(a,n-1);
	    System.out.println(max);
    }

    public static int maxOfArray(int[] arr, int idx) {
        if(idx == 0)
        {
            return arr[idx];
        }
        
       int max = maxOfArray(arr,idx-1);
       return arr[idx]>max?arr[idx]:max;
    }
}
