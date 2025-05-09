package backtracking;

public class permutation {
	public static void main(String[] args) {
		String s = "abc";
		permute(s);
	}
	
	private static void permute(String s) {
		printPermutation(s,0,s.length()-1);
	}
	
	private static void printPermutation(String s, int l, int r) {
		if(l==r) {
			System.out.println(s);
			return ; 
		}
		for(int i = l;i<=r;i++) {
			s = swap(s,l,i);
			printPermutation(s,l+1,r);
			s =swap(s,l,i);	
		}
	}
	private static String swap(String s, int l, int r) {
		char temp;
		char []a = s.toCharArray();
		temp = a[l];
		a[l] = a[r];
		a[r] = temp;
		return String.valueOf(a);
	}
}
