package RecursionOnArrays;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class DisplayArrayInReverse {
    public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	    int n = Integer.parseInt(br.readLine());
	    int[] a = new int[n];
	    for(int i = 0; i < n; i++){
	       a[i] = Integer.parseInt(br.readLine());
	    }
	    displayArrReverse(a,n-1);
    }

    public static void displayArrReverse(int[] arr, int idx) {
        if(idx == 0)
        {
            System.out.println(arr[idx]);
            return;
        }
        System.out.println(arr[idx]);
        displayArrReverse(arr,idx-1);
    }

}
