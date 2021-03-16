package recursionOnStrings;

public class ReturnAllCodes {

	public static void main(String[] args) {
		String s = "123";
		String ans[] = returnAllCodes(s);
		for(String i : ans) {
			System.out.println(i);
		}
	}

	public static char getChar(int n) {
		return (char)(96 + n);
	}
	
	private static String[] returnAllCodes(String input) {
		if(input.length()==0) {
			String output[] = {""};
			return output;
		}
		int firstDigit = (input.charAt(0) -'0');
		String smallOutput1[] = returnAllCodes(input.substring(1));
		String smallOutput2[] = new String[0];
		int firstTwoDigit = 0;
		if(input.length()>=2) {
			firstTwoDigit = (input.charAt(0)-'0')*10 + (input.charAt(1)-'0');
			if(firstTwoDigit>=10 && firstTwoDigit<=26) {
				smallOutput2 = returnAllCodes(input.substring(2));
			}
		}
		String []output = new String[smallOutput1.length + smallOutput2.length];
		int k =0;
		for(String s : smallOutput1) {
			char firstDigitChar = getChar(firstDigit);
			output[k++] = firstDigitChar + s;
		}
		for(String s : smallOutput2) {
			char firstTwoDigitChar = getChar(firstTwoDigit);
			output[k++] = firstTwoDigitChar + s;
		}
		return output;
	}

}
