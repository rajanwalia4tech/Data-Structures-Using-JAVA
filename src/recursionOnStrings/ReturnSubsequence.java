package recursionOnStrings;

public class ReturnSubsequence {

	public static void main(String[] args) {
		String str = "ABC";
		String subsequences[] = findSubsequence(str);
		
		for(String s: subsequences)
			System.out.println(s);
	}

	private static String[] findSubsequence(String str) {
		if(str.length()==0)
		{
			String ans[] = {""};
			return ans;
		}
		String smallAns[] = findSubsequence(str.substring(1));
		String ans[] = new String[2*smallAns.length];
		
		for(int i=0;i<smallAns.length;i++)
		{
			ans[i] =smallAns[i];
		}
		
		for(int i=0;i<smallAns.length;i++)
		{
			ans[i+smallAns.length]= str.charAt(0)+smallAns[i];
		}
		return ans;
	}
}
