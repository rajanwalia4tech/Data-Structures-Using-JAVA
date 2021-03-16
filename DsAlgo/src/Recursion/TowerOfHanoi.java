package Recursion;
import java.util.*;
public class TowerOfHanoi {

	public static void toh(int n, String source, 
			String dest,String aux)
	{
		if(n == 1)
		{
			System.out.println("Move disk "+n+" from "
					+ source +" to " +dest);
			return;
		}
		toh(n-1,source,aux,dest);
		System.out.println("Move disk "+n+" from "
				+ source +" to " +dest);
		toh(n-1,aux,dest,source);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no. of disks : ");
		int n = sc.nextInt();
		toh(n,"Tower1","Tower2","Tower3");
	}

}
