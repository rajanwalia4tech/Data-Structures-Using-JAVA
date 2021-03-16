package RecursionOnArrays;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class LastIndexOfitemInArray {
    public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    int n = Integer.parseInt(br.readLine());
	    int[] a = new int[n];
	    for(int i = 0; i < n; i++){
	       a[i] = Integer.parseInt(br.readLine());
	    }
	    int x = Integer.parseInt(br.readLine());
	    System.out.println(lastIndex(a,n-1,x));
    }

    public static int lastIndex(int[] arr, int idx,int x) {
        if(idx == -1)
        	return -1;
        else if(arr[idx] == x)
        {
            return idx;
        }
       return lastIndex(arr,idx-1,x);
    }
}
