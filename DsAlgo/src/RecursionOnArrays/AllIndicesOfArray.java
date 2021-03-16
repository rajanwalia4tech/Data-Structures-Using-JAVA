package RecursionOnArrays;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class AllIndicesOfArray {

    public static void main(String[] args) throws Exception {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        int x = Integer.parseInt(br.readLine());
        int[] iarr = allIndices(arr, x, 0, 0);

        if (iarr.length == 0) {
            System.out.println();
            return;
        }

        for (int i = 0; i < iarr.length; i++) {
            System.out.println(iarr[i]);
        }
    }

    public static int[] allIndices(int[] arr, int x, int idx, int countx) {
        if(idx ==arr.length)
        {
        	return new int[countx];	//create size == countx
        }
        if(arr[idx] == x)
        {
        	int []result = allIndices(arr,x,idx+1,countx+1);
        	result[countx] = idx;
        	return result;
        }
        else {
        	int []result = allIndices(arr,x,idx+1,countx);
        	return result;
        }
    }
}
