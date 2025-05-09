package Arrays;

import java.util.Scanner;

public class TripleSum {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while(t-->0) {
			int m = s.nextInt();
			int a[] = new int[m];
			for(int i=0;i<a.length;i++)	
				a[i]=s.nextInt();
			int x = s.nextInt();
			
			int count=0;
			for(int i=0;i<a.length;i++) {
				for(int j=i+1;j<a.length;j++) {
					for(int k=j+1;k<a.length;k++)
						if(a[i]+a[j]+a[k]==x)
							count++;
				}
			}
			System.out.println(count);
		}
	}
}