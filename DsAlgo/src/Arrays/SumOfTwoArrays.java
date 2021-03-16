package Arrays;
import java.lang.*;
import java.util.*;
public class SumOfTwoArrays {
	
	static int[] sumOfTwoArray(int a[],int b[]) {
		int i=a.length-1;
		int j=b.length-1;
		int carry=0;
		int k=Math.max(a.length, b.length);
		int output[] = new int[k+1];
		while(i>=0 &&j>=0)
		{
			int sum=a[i]+b[j]+carry;
			output[k] = sum%10;
			carry = sum/10;
			i--;
			j--;
			k--;
		}
		while(i>=0) {
			int sum = a[i]+carry;
			output[k] = sum%10;
			carry = sum/10;
			i--;
			k--;
		}
		while(j>=0) {
			int sum = b[j]+carry;
			output[k] = sum%10;
			carry = sum/10;
			j--;
			k--;
		}
		output[0]=carry;
		return output;
	}
	
	public static void main(String[] args) {
		int a[] = 		  {};
		int b[] =   {9,9,9,9,9,3,2,8};		
		int res[] = sumOfTwoArray(a, b);
		for(int i:res)
			System.out.print(i+" ");
//		Scanner sc = new Scanner(System.in);
//		int n1 = sc.nextInt();
//		int []a = new int[n1];
//		for(int i=0;i<n1;i++)
//			a[i] = sc.nextInt();
//		
//		int n2 = sc.nextInt();
//		int []b = new int[n2];
//		for(int i=0;i<n2;i++)
//			b[i] = sc.nextInt();
//		
//		int []sum = new int[n1>n2?n1:n2];	// summation array
//		int carry=0;
//		int i = a.length-1;
//		int j = b.length-1;
//		int s=0; // sum of ith bit 
//		int k = sum.length-1;
//		while(i>=0 || j>=0) {
//			s = carry;
//			if(i>=0)
//				s+=a[i];
//			if(j>=0)
//				s+=b[j];
//			sum[k] = s%10;	// sum at kth bit
//			carry = s/10;	// carry for next bit
//			i--;
//			j--;
//			k--;
//		}
//		if(carry!=0)
//			System.out.print(carry);
//		for(int val:sum)
//			System.out.print(val);
	}
}
