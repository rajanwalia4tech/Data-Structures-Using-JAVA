package stack;
//Java program previous greater element
//An efficient solution to
//print previous greater
//element for every element
//in an array.
import java.io.*;
import java.util.*;
import java.lang.*;

public class PreviousGreater
{
	//Driver Code
	public static void main(String[] args)
	{
		int arr[] = { 10, 4, 2, 20, 40, 12, 30 };
		int n = arr.length;
		prevGreater(arr, n);
	}
		
	static void prevGreater(int arr[],int n)
	{
		// Create a stack and push
		// index of first element
		// to it
		Stack<Integer> s = new Stack<Integer>();
//		s.push(arr[0]);
//		
//		// Previous greater for
//		// first element is always -1.
//		System.out.print("-1, ");
//	
		// Traverse remaining elements
		for (int i = 0; i < n; i++)
		{
	
			// Pop elements from stack
			// while stack is not empty
			// and top of stack is smaller
			// than arr[i]. We always have
			// elements in decreasing order
			// in a stack.
			while (s.empty() == false && s.peek() < arr[i])
				s.pop();
	
			// If stack becomes empty, then
			// no element is greater on left
			// side. Else top of stack is
			// previous greater.
			if (s.empty() == true)
				System.out.print("-1, ");
			else
				System.out.print(s.peek() + ", ");
	
			s.push(arr[i]); // Push the element
		}
	}
}

