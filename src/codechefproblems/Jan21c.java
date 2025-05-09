package codechefproblems;
import java.util.*;
public class Jan21c {

	public static void main(String[] args) {
		
		Scanner sc =  new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0)
		{
			int setters = sc.nextInt();
			long  k = sc.nextLong();
			long  days = sc.nextLong();
			long problems[] = new long[setters];
			for(int i=0;i<setters;i++)
				problems[i] = sc.nextLong();
			int totalProblems =0;
			for(int i=0;i<setters;i++)
				totalProblems+=problems[i];
			
			if(totalProblems<k)
				System.out.println(0);
			else if(k*days>=totalProblems) 
				System.out.println(totalProblems/k);
			else if(k*days<=totalProblems) 
				System.out.println(days);
			
			}
		}
}
