package backtracking;

public class PermutationsOfString {

	public static void main(String[] args) {
		String str="abc";
		permute(str.toCharArray(),0);
	}

	private static void permute(char[] str, int currentIndex) {
		if(currentIndex == str.length) {
			System.out.println(String.valueOf(str));
			return;
		}
		for(int i=currentIndex;i<str.length;i++) {
			swap(str,currentIndex,i);
			permute(str,currentIndex+1);
			//Bactracking -- making the string as it was
			swap(str,currentIndex,i);
		}
	}

	private static void swap(char[] str, int i,int j) {
		char temp = str[i];
		str[i] = str[j];
		str[j] = temp;
		
	}

}
