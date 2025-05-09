package RecursionOnArrays;

/*
 * Return subsets sum to K

Given an array A of size n and an integer K, return all subsets of A which sum to K.
Subsets are of length varying from 0 to n, that contain elements of the array. But the order of elements should remain same as in the input array.
Note : The order of subsets are not important.
Input format :
Line 1 : Integer n, Size of input array
Line 2 : Array elements separated by space
Line 3 : K 
Constraints :
1 <= n <= 20
Sample Input :
9 
5 12 3 17 1 18 15 3 17 
6
Sample Output :
3 3
5 1
Input 2:
6
32 5 1 4 6
8
Output 2:
2 6 
2 5 1 
3 1 4 
3 5 

 */

public class ReturnSubsetsSumToK {

	public static void main(String[] args) {
		int []input = {3,2,5,1,4,6};
		int k=8;
		int ans[][] = returnSubsetsSumToK(input,k);
		for(int i=0;i<ans.length;i++) {
			for(int j=0;j<ans[i].length;j++) {
				System.out.print(ans[i][j]+" ");
			}
			System.out.println();
		}
	}

	private static int[][] returnSubsetsSumToK(int[] input, int k) {
		return returnSubsetsSumToK(input,k,0);
	}

	private static int[][] returnSubsetsSumToK(int[] input, int k, int startIndex) {
		if(startIndex == input.length) {
			if(k == 0) {	// sum is 0
				return new int[1][0];
			}
			return new int[0][0];
		}
		int smallOutput1[][] = returnSubsetsSumToK(input,k,startIndex+1);
		int smallOutput2[][] = returnSubsetsSumToK(input,k-input[startIndex],startIndex+1);
		int output[][] = new int [smallOutput1.length + smallOutput2.length][];
		int index=0;
		for(int i=0;i<smallOutput1.length;i++) {
			output[index++] = smallOutput1[i];	//copy refernces of smallOutput1 array
		}
		
		for(int i=0;i<smallOutput2.length;i++) {
			output[index] = new int[smallOutput2[i].length+1];
			output[index][0] = input[startIndex];	//add the current element
			for(int j=0;j<smallOutput2[i].length;j++) {
				output[index][j+1] = smallOutput2[i][j]; 
			}
			index++;
		}
		return output;
	}

}
