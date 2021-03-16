package sorting;

public class MergeTwoSortedArrays {

	public static void main(String[] args) {
		int a[] = {10,13,16,35,37};
		int b[] = {6,10,23,30,35,39};
		int ans[] = merge(a,b);
		for(int i:ans)
			System.out.print(i+" ");
	}

	private static int[] merge(int[] a, int[] b) {
		int c[] = new int[a.length + b.length];
		int i=0,j=0,k=0;
		
		while(i<a.length && j<b.length) {
			if(a[i]<b[j])
				c[k++] = a[i++];
			else
				c[k++] = b[j++];
		}
		
		while(i<a.length)
			c[k++] = a[i++];
		
		while(j<b.length)
			c[k++] = b[j++];
		
		return c;
	}
}
