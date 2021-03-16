package Arrays;
import java.util.*;
public class FirstIndexAndLastIndex {

	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
	    int n = sc.nextInt();
	    int []a = new int[n];
	    for(int i=0;i<n;i++)
	        a[i] = sc.nextInt();
		int d = sc.nextInt();
		int low =  0;
		int high = a.length-1;
		while(low<=high){
		   int mid = (low+high)/2;
		   if(d<a[mid])
		   {
		       high=mid-1;
		   }
		   else if(d>a[mid])
		   {
		       low = mid+1;
		   }
		   else{
		       high = low = mid;
		       while(a[low]==a[high]){
		           if(a[low] ==a[low-1])
		                low--;
		           if(a[high] == a[high+1])
		                high++;
		           if(a[low-1]!=a[low] && a[high]!=a[high+1])
		        	   break;
		       }
		       break;
		   }
		}
		if(low> high)
		{
			low = high = -1;
		}
		System.out.println(low);
		System.out.println(high);
	}

}
