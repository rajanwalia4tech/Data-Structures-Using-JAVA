package codeforces;

import java.util.Scanner;

public class TEAM {

	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		int n = sc.nextInt();
		int res=0;
		while(n-->0)
		{
			int count = 0;
			long  p = sc.nextByte();
			long  v = sc.nextByte();
			long  t = sc.nextByte();
			if(p==1)
				count++;
			if(v==1)
				count++;
			if(t==1)
				count++;
			if(count>=2)
				res++;
		}
		System.out.println(res);
			
	}
}
