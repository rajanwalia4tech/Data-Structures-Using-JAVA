package Arrays;

import java.util.Scanner;

public class ArrayIntersection {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while(t-->0) {
			int m = s.nextInt();
			int a[] = new int[m];
			for(int i=0;i<a.length;i++)	
				a[i]=s.nextInt();
			
			int n = s.nextInt();
			int b[] = new int[n];
			for(int i=0;i<b.length;i++)
				b[i]=s.nextInt();
			
			for(int i=0;i<a.length;i++)
			{
				for(int j=0;j<b.length;j++)
				{
					if(a[i]==b[j])
					{
						System.out.print(b[j]+" ");
						b[j] = Integer.MIN_VALUE;
						break;
					}
				}
			}
		}
	}
}
