package recursionOnStrings;

public class returnPermutation {

	public static void main(String[] args) {
		String s = "abcd";
		String permutation[] = returnPermutation(s);
		for(String i: permutation)
			System.out.println(i);
	}

	private static String[] returnPermutation(String s) {
		if(s.length() == 0)
			return new String[] {""};
		String smallOutput[] =returnPermutation(s.substring(1));
		String output[] = new String[smallOutput.length*s.length()];
		int k=0;
		for(int i=0;i<smallOutput.length;i++) {
			String  currentString = smallOutput[i];
			for(int j=0;j<=currentString.length();j++) {
				output[k++] = smallOutput[i].substring(0,j) + 
						s.charAt(0) + smallOutput[i].substring(j);
			}
		}
		return output;
	}

}
