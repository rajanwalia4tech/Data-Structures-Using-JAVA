package recursionOnStrings;

/* given a no. n find the corressponding column ID
   in Excel and return it
   for eg :
   I/P : n=27
   O/P : AA
   
   I/P : n=705
   O/P : AAC
   
 */


public class ExcelColumn {

	public static void main(String[] args) {
		int n=705;
		String columnId = getColumnId(n);
		System.out.println(columnId);
	}

	private static String getColumnId(int n) {
		if(n<=26) {
			return singleDigitcolumn(n)+"";
		}
		String ans = getColumnId(n/26);
		String smallAns = singleDigitcolumn(n%26)+"";
		return ans+smallAns;
	}

	private static char singleDigitcolumn(int n) {
		String s = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		
		return s.charAt(n-1);
	}
}
