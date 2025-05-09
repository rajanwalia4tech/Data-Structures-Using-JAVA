package recursionOnStrings;

public class printPermutations {

	public static void main(String[] args) {
		String  s = "abcd";
		printPermutations(s);
	}

	private static void printPermutations(String s) {
		printPermutations(s,"");
		
	}

	private static void printPermutations(String input, String output) {
		if(input.length()==0) {
			System.out.println(output);
			return;
		}

		for(int i=0;i<input.length();i++) {
			//skip ith character at each time and add to the output
			// and send rest string as input
			printPermutations(input.substring(0,i)+input.substring(i+1),
					output+input.charAt(i));
		}
	}
}
