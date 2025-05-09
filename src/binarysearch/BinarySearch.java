package binarysearch;

public class BinarySearch {

	public static void main(String[] args) {
		int a[] = {1,2,3,4,5,6,7,8,9,10};
		int item = 10;
		int ans = binarySearch(a,item);
		System.out.println(ans);

	}

	private static int binarySearch(int[] a, int item) {
		int low = 0;
		int high = a.length - 1;
		while(low<=high) {
			int mid = (low + high)/2;
			if(a[mid]>item)
				high = mid - 1;
			else if(a[mid]<item)
				low = mid+1;
			else {
				return mid;
			}
		}
		return -1;
	}
	
}
