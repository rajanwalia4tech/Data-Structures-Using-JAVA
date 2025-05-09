package Recursion;

public class Test {
	
	static String getColumn(int n) {
		if(n<=26) {
			return (char)(64+n) +""; 
		}
		
		String ans = getColumn(n/26);
		ans += (char)(64+n%26);
		return ans;
	}
	
	public static void main(String[] args) {
		
		System.out.println(getColumn(705));
	}
}
