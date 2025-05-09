package slidingwindow;

/*
 * Given an array and a positive integer k, find the first
 * negative integer for each window(contiguous subarray) of size k.
 * If a window does not contain a negative integer, 
 * then print 0 for that window.
 * 
Input : arr[] = {-8, 2, 3, -6, 10}, k = 2
Output : -8 0 -6 -6
First negative integer for each window of size k
{-8, 2} = -8
{2, 3} = 0 (does not contain a negative integer)
{3, -6} = -6
{-6, 10} = -6

Input : arr[] = {12, -1, -7, 8, -15, 30, 16, 28} , k = 3
Output : -1 -1 -7 -15 -15 0
 *   
 */

public class FirstNegativeNumber {

	public static void main(String[] args) {
		int arr[] = {12, -1, -7, 8, -15, 30, 16, 28} , k = 3;
		naiveSolution(arr,k);
		usingSlidingWindow(arr,k);
	}

	
	private static void usingSlidingWindow(int[] arr, int k) {
		
		
	}


	//time complexity = O((n-k+1)*k)~ O(nk)
	private static void naiveSolution(int[] arr, int k) {
	    // flag to check whether window contains
	    // a negative integer or not
	    boolean flag;
	    int n = arr.length;
	    // Loop for each subarray(window) of size k
	    for (int i = 0; i<(n-k+1); i++)        
	    {
	        flag = false;
	 
	        // traverse through the current window
	        for (int j = 0; j<k; j++)
	        {
	            // if a negative integer is found, then
	            // it is the first negative integer for
	            // current window. Print it, set the flag
	            // and break
	            if (arr[i+j] < 0)
	            {
	                System.out.print((arr[i+j])+" ");
	                flag = true;
	                break;
	            }
	        }
	         
	        // if the current window does not
	        // contain a negative integer
	        if (!flag)
	            System.out.print("0"+" ");
	    }	}
		
}

	
