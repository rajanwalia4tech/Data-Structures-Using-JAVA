package bitwiseoperator;

public class kthsetbit {
	 static String usingLeftShift(int n,int k) {
		boolean flag = false;
		if((n&1<<(k-1))!=0 )
			return "Yes";
		else
			return "No";
	}

	 static String usingRightShift(int n, int k)
	 {
		 if((n>>(k-1)&1)==1)
			 return "Yes";
		 else
			 return "N0";
	 }
	public static void main(String[] args) {
		int x=42;
		int kthbit = 1;
		System.out.println(usingLeftShift(x,kthbit));
		System.out.println(usingRightShift(x,kthbit));
 
	}

}
