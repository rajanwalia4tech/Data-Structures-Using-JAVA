package Recursion;
import java.util.*;
/*
 Print a sequence of numbers starting with N where A[0] = N, 
 without using loop, in which  A[i+1] = A[i] - 5,  until A[i] > 0.
  After that A[i+1] = A[i] + 5  repeat it until A[i] = N.
  
Example 1:

Input: N = 16
Output: 16 11 6 1 -4 1 6 11 16
Explanation: The value decreases until it 
is greater than 0. After that it increases 
and stops when it becomes 16 again.

Example 2:

Input: N = 10
Output: 10 5 0 5 10
Explaination: It follows the same logic as 
per the above example.
  
 */


public class PrintPattern {
	
	static List<Integer> pattern(int N){
		
        List<Integer> res = new ArrayList<Integer>();
        res.add(N);
        if(N<=0)
        {
            return res;
        }
        List<Integer> li = pattern(N-5);
        for(Integer i : li)
            res.add(i);
        res.add(N);
        return res;
    }
	public static void main(String[] args) {
		System.out.println(pattern(63));
	}

}
