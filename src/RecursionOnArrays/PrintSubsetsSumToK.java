package RecursionOnArrays;
/*
 * Print Subset Sum to K

Given an array A and an integer K, print all subsets of A which sum to K.
Subsets are of length varying from 0 to n, that contain elements of the array. But the order of elements should remain same as in the input array.
Note : The order of subsets are not important. Just print them in different lines.
Input format :
Line 1 : Size of input array
Line 2 : Array elements separated by space
Line 3 : K 
Sample Input:
9 
5 12 3 17 1 18 15 3 17 
6
Sample Output:
3 3
5 1

Input 2:
6
3 2 5 1 4 6
8
Output 2:
2 6 
2 5 1 
3 1 4 
3 5 

 */

public class PrintSubsetsSumToK {
	public static void main(String[] args) {
		int []input = {3,2,5,1,4,6};
		int k=8;
		printSubsetsSumToK(input,k);
	}

	private static void printSubsetsSumToK(int[] input, int k) {
		int []output = new int[0];
		printSubsetsSumToK(input,k,0,output);
	}

	private static void printSubsetsSumToK(int[] input, int k,int startIndex,int[] output) {
		if(input.length == startIndex) {
			if(k==0) {	// sum is found for this output subset
				for(int i:output)
					System.out.print(i+" ");
			System.out.println();
			}
			return;
		}
		printSubsetsSumToK(input,k,startIndex+1,output);
		int newOutput[] = new int[output.length+1];
		int i=0;
		for(;i<output.length;i++) {
			newOutput[i] = output[i];
		}
		//copy the last element to inlclude in output array
		newOutput[i] = input[startIndex];	
		printSubsetsSumToK(input,k - input[startIndex],startIndex+1,newOutput);
	}
}
