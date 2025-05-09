package Arrays;

public class RotateArray {
		public static void main(String[] args) {
			int a[] = {1,2,3,4,5,6,7};
			int d =5;
			rotate(a,d);
			for(int i:a)
				System.out.print(i+" ");
		}

		private static void rotate(int[] a,int d) {
			if(a.length ==0)
				return ;
			if(d>=a.length)
				d = d%a.length;
			reverse(a,0,a.length-1);
			reverse(a,0,a.length-d-1);
			reverse(a,a.length-d,a.length-1);
		}

		private static void reverse(int[] a, int start, int end) {
			while(start<end) {
				swap(a,start,end);
				start++;
				end--;
			}
		}

		private static void swap(int[] a, int start, int end) {
			int temp =a[start];
			a[start] = a[end];
			a[end] = temp;
		}
	}
