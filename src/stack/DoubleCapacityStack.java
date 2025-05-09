package stack;

public class DoubleCapacityStack {
	int stack[];
	int top;

	DoubleCapacityStack(){
		stack = new int[5];
		top = -1;
	}
	
	DoubleCapacityStack(int capacity){
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
	
	void push(int item) {

		if(size() ==stack.length)
		{
			doubleCapacity();
		}
		stack[++top] = item;
	}
	
	private void doubleCapacity() {
		int temp[] = new int [2*stack.length];
		for(int i=0;i<size();i++)
			temp[i] = stack[i];
		stack = temp;
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
	
		DoubleCapacityStack s = new DoubleCapacityStack(3);
		for(int i=1;i<=5;i++)
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
