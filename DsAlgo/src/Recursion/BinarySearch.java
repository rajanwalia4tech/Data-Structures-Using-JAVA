package Recursion;

public class BinarySearch {
	public static int binarySearch(int a[],int x,int low, int high) {
		if(low<=high) {
			int mid = (low+high)/2;
			if(x ==a[mid])
				return mid+1;
			else if(x >a[mid]) {
				return binarySearch(a,x,mid+1,high);
			}
				return binarySearch(a,x,low,mid-1);
		}
		return -1;
	}
	
	
	public static void main(String[] args) {
		int a[] = {1,3,8,14,18,23,28};
		int x = 14;	//Item to be find
		System.out.print(binarySearch(a,x,0,a.length-1));
	}

}
