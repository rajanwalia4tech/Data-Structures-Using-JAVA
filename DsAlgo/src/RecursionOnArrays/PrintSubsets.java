package RecursionOnArrays;
/*
 * Print Subsets of Array

Given an integer array (of length n), find and print all the subsets of input array.
Subsets are of length varying from 0 to n, that contain elements of the array. But the order of elements should remain same as in the input array.
Note : The order of subsets are not important. Just print the subsets in different lines.
Input format :
Line 1 : Integer n, Size of array
Line 2 : Array elements (separated by space)
Constraints :
1 <= n <= 15
Sample Input:
3
15 20 12
Sample Output:
[] (this just represents an empty array, don't worry about the square brackets)
12 
20 
20 12 
15 
15 12 
15 20 
15 20 12 
 */
public class PrintSubsets {

	public static void main(String[] args) {
		int a[] = {1,2,3};
		printSubsets(a);

	}

	private static void printSubsets(int[] a) {
		int []output = new int[0];
		printSubsets(a,output,0);
		
	}

	private static void printSubsets(int[] a, int []output,int startIndex) {
		if(startIndex == a.length) {
			for(int i=0;i<output.length;i++)
				System.out.print(output[i]);
			System.out.println();
			return ;
		}
		printSubsets(a,output,startIndex+1);
		int newoutput[] = new int[output.length+1];
		int i=0;
		for(;i<output.length;i++) {
			newoutput[i] = output[i];
		}
		newoutput[i] = a[startIndex];
		//pass new output
		printSubsets(a,newoutput,startIndex+1);
		
	}

}
