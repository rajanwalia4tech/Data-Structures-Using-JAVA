package codechefproblems;
import java.io.*;
import java.util.Scanner;

public class Decodeit {

	public static void main(String[] args) throws java.lang.Exception{
		try{
			Scanner sc =  new Scanner(System.in);
			int t = sc.nextInt();
			while(t-->0)
			{
				int n = sc.nextInt();
				String f = sc.nextLine();
				String s = sc.nextLine();
				int bits =0;
				int i=0;
				while(bits!=s.length()/4) {
					int sum=0;
					int count=4;
					while(count>0)
					{
						sum+= Integer.parseInt(s.charAt(i)+"")*Math.pow(2,count-1);
						count--;
						i++;
					}
					int c = 'a'+sum;
					System.out.print((char)c);
					bits++;
				}
				System.out.println();			
			}
		}catch(Exception e){
			return;
		}
		
	}
}
