package stack;
import java.util.ArrayList;
import java.util.Collections;
// A Stack based Java program to find next
// greater element for all array elements
// in same order as input.
import java.util.Stack;

public class NextGreaterElement {

	
		/* prints element and NGE pair for all
	elements of arr[] of size n */
	public static void printNGE(int []arr)
	{
		Stack<Integer> s = new Stack<>();
		int nge[] = new int[arr.length];
		ArrayList<Integer> res = new ArrayList<>();
	
		// iterate for rest of the elements
		for (int i = arr.length -1 ; i >= 0; i--)
		{
			/* if stack is not empty, then
			pop an element from stack.
			If the popped element is smaller
			than next, then
			a) print the pair
			b) keep popping while elements are
			smaller and stack is not empty */
			while (!s.empty() && s.peek() <= arr[i]){
					s.pop();
			}
			//nge[i] = s.empty() ? -1 : s.peek();
			int nextGreater =s.empty() ? -1 : s.peek();
			res.add(nextGreater);
			s.push(arr[i]);
		}
		Collections.reverse(res);
		for(int i=0;i<res.size();i++)
			System.out.print(res.get(i)+" ");
	}
	
	/* Driver Code */
	public static void main(String[] args)
	{
		// NextGreaterElement nge = new
		// NextGreaterElement();
		int arr[] = { 11, 13, 21, 3,6,12,9,18 };
		
			printNGE(arr);
	}
}
