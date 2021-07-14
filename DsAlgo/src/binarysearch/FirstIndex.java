package binarysearch;

public class FirstIndex {

	public static void main(String[] args) {
		int a[] = {1,2,3,4,5,5,5,5,5,5,6,7,8,9,10};
		int item = 5;
		int firstIndex = firstIndex(a,item);
		System.out.println(firstIndex);
		int lastIndex = lastIndex(a,item);
		System.out.println(lastIndex);

	}

	private static int lastIndex(int[] a, int item) {
		int low = 0;
		int high = a.length - 1;
		int res = -1 ;
		while(low<=high) {
			int mid = (low + high)/2;
			if(a[mid]>item)
				high = mid - 1;
			else if(a[mid]<item)
				low = mid+1;
			else {
				res= mid;
				low = mid + 1;
			}
		}
		return res;
	}

	private static int firstIndex(int[] a, int item) {
		int low = 0;
		int high = a.length - 1;
		int res = -1 ;
		while(low<=high) {
			int mid = (low + high)/2;
			if(a[mid]>item)
				high = mid - 1;
			else if(a[mid]<item)
				low = mid+1;
			else {
				res= mid;
				high = mid -1;
			}
		}
		return res;
	}
}
