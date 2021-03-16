package Recursion;

public class CountZeroes {

	public static void main(String[] args) {
		int n = 5550000;
		System.out.println(countZeros(n));
	}

	private static int countZeros(int input) {
		if(input<10){
			if(input==0)
				return 1;
			else
				return 0;
		}
		if(input%10 == 0)
			return countZeros(input/10)+1;
		else 
			return countZeros(input/10);
	}

}
