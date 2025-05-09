package Arrays;
import java.util.*;

public class BarChartsOfArrayElements {
public static void main(String []args) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	     int []a =  new int[n];
	     for(int i=0;i<a.length;i++)
	        a[i] = sc.nextInt();
	    
	int min,max;
	min = max = a[0];
	for(int i=0;i<n;i++) {
		if(max<a[i])
			max=a[i];
		if(min>a[i])
			min = a[i];
	}
	for(int i=0;i<max;i++)
	{
		for(int j=0;j<a.length;j++) {
		
			if(a[j]>=max-i)
				System.out.print("*");
			else
				System.out.print(" ");
		}
		System.out.println();			
	}

	}
}
