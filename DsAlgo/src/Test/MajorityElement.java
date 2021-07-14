package Test;

import java.util.Arrays;

public class MajorityElement {

	public static void main(String[] args) {
		int a[] = {1,1,1,1,1,1,1,1};
		Arrays.sort(a);
		int mid = a.length/2;
		int firstIndex = firstIndex(a,a[mid]);
		int lastIndex  =lastIndex(a,a[mid]);

		if((lastIndex - firstIndex+1)>a.length/2) {
			System.out.println(a[mid]);
		}else {
			System.out.println("-1");
		}
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
