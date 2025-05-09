package Arrays;

import java.util.Scanner;

public class Sort_0_1 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while(t-->0) {
			int m = s.nextInt();
			int a[] = new int[m];
			for(int i=0;i<a.length;i++)	
				a[i]=s.nextInt();
			int high=a.length-1;
			int low = 0;
			while(low<high) {
				if(a[low]==0) {
					low++;
				}
				else if(a[high]==1) {
					high--;
				}
				else {
					int temp = a[low];
					a[low] = a[high];
					a[high] = temp;
				}	
			}
			for(int i=0;i<a.length;i++)
			System.out.print(a[i]+" ");
		}
	}
}