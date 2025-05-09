package sorting;

public class SortStrings {

	public static void main(String[] args) {
		String names[] = {"Rama","Mukul","Nitin","Amit","Akhil","Ram" };
		
		int length = names.length;
		for(int i=0;i<length-1;i++) {
			
			for(int j=0;j<length-i-1;j++) {
				
				if(names[j].compareTo(names[j+1])>0) {
					String temp = names[j];
					names[j] = names[j+1];
					names[j+1] = temp;
				}
			}
		}
		
		for(String s:names) {
			System.out.println(s);
		}
	}

}
