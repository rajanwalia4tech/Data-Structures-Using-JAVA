package Arrays;
import java.util.*;
public class Test {

	public static void main(String[] args) {
		int a[] = {1,2,3,4,5,6};
		int b[] = {9,9,9,9,9,7};
		
		int d = 0;
		int res[] = null;
		if(a.length>=b.length)
		{
			res = new int[a.length+1];
			d = a.length-b.length;
		}
		int carry=0;
		int k=res.length-1;
		for(int i=b.length-1;i>=0;i--) {
			int sum = carry+b[i] +a[i+d];
			res[k] = sum%10;
			carry = sum/10;
			k--;
		}
		for(int i=d-1;i>=0;i--)
		{
			int sum = carry+a[i];
			
			res[k] =sum%10;
			carry=sum/10;
			k--;
		}
		System.out.println(carry+" "+k);
		
			res[k] = carry;
		for(int i:res)
			System.out.print(i+" ");
	}
}
