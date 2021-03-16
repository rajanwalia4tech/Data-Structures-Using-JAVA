package RecursionOnArrays;
/*
 * Return subset of an array

Given an integer array (of length n), find and return all the subsets of input array.
Subsets are of length varying from 0 to n, that contain elements of the array. But the order of elements should remain same as in the input array.
Note : The order of subsets are not important.
Input format :

Line 1 : Size of array

Line 2 : Array elements (separated by space)

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
 
public class ReturnSubsets {

	public static void main(String[] args) {
		int a[] = {1,2,3,4};
		int subsets[][] = returnSubsets(a,0);
		for(int i=0;i<subsets.length;i++) {
			for(int j=0;j<subsets[i].length;j++)
				System.out.print(subsets[i][j]);
			System.out.println();
		}
	}

	private static int[][] returnSubsets(int[] input,int startIndex) {
		 if(input.length ==startIndex) {
			 return new int [1][0];
		 }
		 int smallAns[][] =returnSubsets(input,startIndex+1);
		 int total[][] = new int[2*smallAns.length][];
		 int k=0;
		 for(int i=0;i<smallAns.length;i++) {
			 //create the size corresponding to the small ans
			 total[k] = new int[smallAns[i].length]; 
			 for(int j=0;j<smallAns[i].length;j++) {
				 total[k][j] = smallAns[i][j];
			 }
			 k++;
		 }
		 for(int i=0;i<smallAns.length;i++) {
			 // create size to also store the startIndex element
			 total[k] = new int[smallAns[i].length+1];
			 total[k][0] = input[startIndex];
			 for(int j=0;j<smallAns[i].length;j++) {
			// store the next element at 1th index and so on in Ans
				 total[k][j+1] = smallAns[i][j];
			 }
			 k++;
		 }
		return total;
	}
}
