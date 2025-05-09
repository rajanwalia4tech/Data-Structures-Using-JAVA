package stack;
import java.util.Stack;
public class JavaCollectionsStack {

	public static void main(String[] args) {
		Stack <Integer> s = new Stack(); //Stack class 
		s.push(12); // push an item into stack
		s.push(13);
		s.push(14);
		s.isEmpty();
		s.empty();
		System.out.println(s.empty()); //return true if stack contains items else false
		System.out.println(s.toString()); //print the stack from top to bottom
		System.out.println(s.search(14));  //return 1 based index of an item from stack
		System.out.println(s.size());  // return size of stack
		System.out.println(s.pop());  // remove and return the top element from the stack
		System.out.println(s.peek()); // return top element from the stack
	} 
}
