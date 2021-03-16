package Recursion;
/*
 Staircase

A child is running up a staircase with N steps,
 and can hop either 1 step, 2 steps or 3 steps at a time. 
 Implement a method to count how many possible ways the child can run up to the stairs. You need to return number of possible ways W.
Input format :
Integer N
Output Format :
Integer W
Constraints :
1 <= N <= 30
Sample Input 1 :
4
Sample Output 1 :
7
Sample Input 2 :
5
Sample Output 2 :
13
 */

public class StairCase {

	public static void main(String[] args) {
		int totalWays = StairCase(5);
		System.out.println(totalWays);
	}

	private static int StairCase(int stairNo) {
		if(stairNo<0)
			return 0;
		if(stairNo == 0)
			return 1;
		return StairCase(stairNo-1) + StairCase(stairNo-2)
		+ StairCase(stairNo-3);
	}
}
