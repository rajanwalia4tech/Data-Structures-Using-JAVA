package heaps;

public class HeapSort { 

	public static void main(String[] args) {
		int arr[] = {5,1,9,2,0,6,3,8};
		for(int i=0;i<arr.length;i++) {
			insert(arr,i);
		}
		System.out.println("Array converted into heap : ");
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
		
		for(int i=0;i<arr.length;i++) {
			arr[arr.length - i - 1] = removeMin(arr,arr.length-i);
		}
		
		System.out.println("\nsorted Array : ");
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
		
	}

	private static int removeMin(int[] arr, int heapSize) {
		int temp = arr[0];
		arr[0] = arr[heapSize -1];
		heapSize--;
		int index = 0;
		int leftChildIndex = 2*index  + 1;
		int rightChildIndex = 2*index + 2;
		while(leftChildIndex < heapSize) {
			int minIndex = index;
			if(arr[leftChildIndex] < arr[minIndex]) {
				minIndex = leftChildIndex;
			}
			if(rightChildIndex < heapSize && arr[rightChildIndex] < arr[minIndex]) {
				minIndex = rightChildIndex;
			}
			if(minIndex != index) {
				int temp1 = arr[index];
				arr[index] = arr[minIndex];
				arr[minIndex] = temp1;
				index = minIndex;
				leftChildIndex = 2*index  + 1;
				rightChildIndex = 2*index + 2;
			}else {
				break;
			}
		}
		return temp;
	}

	private static void insert(int[] arr, int i) {
		int childIndex = i;
		int parentIndex = (childIndex - 1)/2;
		while( childIndex > 0 ) {
			if(arr[childIndex] < arr[parentIndex]) {
				int temp = arr[childIndex];
				arr[childIndex] = arr[parentIndex];
				arr[parentIndex] = temp;
				childIndex = parentIndex;
				parentIndex = (childIndex - 1)/2;
			}else {
				return;
			}
		}
	}

}
