package RecursionOnArrays;

public class SortTheArray {

	public static void main(String[] args) {
		int []a = {5,4,6,1,3,7,2};
		sortArray(a,a.length);
		for(int i=0;i<a.length;i++)
			System.out.print(a[i]+" ");
	}

	private static void sortArray(int[] a, int n) {
		if(n==1) {
			return;
		}
		
		for(int i=0;i<n-1;i++) {
			if(a[i]>a[i+1]) { // swapping adjacent elements
				int temp = a[i];
				a[i] = a[i+1];
				a[i+1] = temp;
			}
		}
		sortArray(a,n-1);
	}

}
