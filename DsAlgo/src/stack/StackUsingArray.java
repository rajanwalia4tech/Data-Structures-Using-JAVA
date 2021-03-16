package stack;
public class StackUsingArray {
	int stack[];
	int top;
	
	StackUsingArray(){
		stack = new int[5];
		top = -1;
	}
	
	StackUsingArray(int capacity){
		stack = new int[capacity];
		top = -1;
	}
	
	public boolean  isEmpty() {
		return size()==0;
	}
	
	int size() {
		return top+1;
	}
	// return top element of stack
	int peek() throws StackEmptyException {
		if(size() == 0)
		{
			//StackEmptyException
			StackEmptyException  e= new StackEmptyException();
			throw e;
		}
		
		return stack[top];
	}
	
	void push(int item) throws StackFullException {

		if(size() ==stack.length)
		{
			StackFullException e = new StackFullException();
			throw e;
		}
		stack[++top] = item;
	}
	
	int pop() throws StackEmptyException
	{	
		if(size() == 0)
		{
			//StackEmptyException
			StackEmptyException  e= new StackEmptyException();
			throw e;
		}
		return stack[top--];
	}
	
	public static void main(String[] args) throws StackFullException, StackEmptyException {
		StackUsingArray s = new StackUsingArray(10);
		for(int i=1;i<=10;i++)
			s.push(i);

		while(!s.isEmpty()) {
			try {
				System.out.println(s.pop());
			}
			catch(StackEmptyException e)
			{
				//never reach here
			}
		}
	}
}
