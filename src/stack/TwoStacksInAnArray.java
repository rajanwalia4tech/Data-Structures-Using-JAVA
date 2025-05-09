package stack;

// Java program to implement two stacks in a
// single array
class TwoStacksInAnArray {
	int size;
	int top1, top2;
	int arr[];

	// Constructor
	TwoStacksInAnArray(int n)
	{
		arr = new int[n];
		size = n;
		top1 = -1;
		top2 = size;
	}

	// Method to push an element x to stack1
	void push1(int x)
	{
		// There is at least one empty space for
		// new element
		if (top1 < top2 - 1) {
			top1++;
			arr[top1] = x;
		}
		else {
			System.out.println("Stack1 Overflow");
			System.exit(1);
		}
	}

	// Method to push an element x to stack2
	void push2(int x)
	{
		// There is at least one empty space for
		// new element
		if (top1 < top2 - 1) {
			top2--;
			arr[top2] = x;
		}
		else {
			System.out.println("Stack2 Overflow");
			System.exit(1);
		}
	}

	// Method to pop an element from first stack
	int pop1()
	{
		if (top1 >= 0) {
			int x = arr[top1];
			top1--;
			return x;
		}
		else {
			System.out.println("Stack1 Underflow");
			System.exit(1);
		}
		return 0;
	}

	// Method to pop an element from second stack
	int pop2()
	{
		if (top2 < size) {
			int x = arr[top2];
			top2++;
			return x;
		}
		else {
			System.out.println("Stack2 Underflow");
			System.exit(1);
		}
		return 0;
	}
	
	public void displayStacks() {
		for(int i=0;i<size;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}

	// Driver program to test twoStack class
	public static void main(String args[])
	{
		TwoStacksInAnArray ts = new TwoStacksInAnArray(5);
		ts.push1(5);
		ts.push2(10);
		ts.push2(15);
		ts.push1(11);
		ts.push2(7);
		//ts.push1(11);
		ts.displayStacks();
		System.out.println("Popped element from"
						+ " stack1 is " + ts.pop1());
		ts.push2(40);
		System.out.println("Popped element from"
						+ " stack2 is " + ts.pop2());
	}
}
// This code has been contributed by
// Amit Khandelwal(Amit Khandelwal 1).
