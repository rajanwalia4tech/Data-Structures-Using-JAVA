package codechefproblems;

import java.util.Scanner;

public class Billrd {
	public static void main(String[] args) throws java.lang.Exception{
		try{
			Scanner sc =  new Scanner(System.in);
			int t = sc.nextInt();
			while(t-->0)
			{
				int n = sc.nextInt();
				int k = sc.nextInt();
				int x = sc.nextInt();
				int y = sc.nextInt();
				int count = 1;
				int rot = k%4;
				if(rot == 0)
					rot = 4;
				if(x>y)
				{
					while(count<=rot)
					{
						if(count==1)
						{
							y+=(n-x);
							x = n;
						}
						else if(count==2)
						{
							x = y;
							y=n;
						}
						else if(count==3)
						{
							y = n-x;
							x = 0;
						}
						else if(count==4)
						{
							x = y;
							y = 0;
						}
						count++;
					}
					System.out.print(x+" "+y);
				}
				else if(x<y) {
					while(count<=rot)
					{
						if(count==1)
						{
							x += (n-y);
							y= n;
						}
						if(count==2)
						{
							y=x;
							x=n;
						}
						if(count==3)
						{
							x = n-y;
							y = 0;
						}
						if(count==4)
						{
							y = x;
							x = 0;
						}
						count++;
					}
					System.out.print(x+" "+y);
				}
				else 
					System.out.print(n+" "+n);

			}
		}catch(Exception e){
			return;
		}
		
	}

}
