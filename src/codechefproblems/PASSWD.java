package codechefproblems;
import java.util.Scanner;
import java.io.*;
public class PASSWD {

	 public static boolean isvalid(int start,int end,String s,int first,int last)
	{
		for(int i=start;i<=end;i++)
		{
			if(!(s.charAt(start)>=first && s.charAt(last)<=last))
				return false;
		}
		return true;
	}
	
	public static void main(String[] args) throws java.lang.Exception {
		try{
			Scanner sc =  new Scanner(System.in);
			int t = sc.nextInt();
			sc.next();
			while(t-->0)
			{
				String s = sc.nextLine();
				boolean isLower =false;
				boolean isUpper = false;
				boolean isSpecialChar = false;
				boolean isDigit = false;
				boolean flag = false;
				if(s.length()<10) {
					flag = false;
				}
				else 
				{
					if((s.charAt(0)>='a' && s.charAt(0)<'z') ||
						(s.charAt(s.length()-1)>='a' && s.charAt(s.length()-1)<='z')) 
						isLower = true;
					for(int i=1;i<s.length()-1;i++)
					{
						if(s.charAt(i)>='a' && s.charAt(i)<='z')
							isLower =true;
						else if(s.charAt(i)>='A' && s.charAt(i)<='Z')
							isUpper = true;
						else if(s.charAt(i)>='0' && s.charAt(i)<='9')
							isDigit = true;
						else if(s.charAt(i)=='@' ||s.charAt(i)=='&' ||
								s.charAt(i)=='#' ||s.charAt(i)=='%' ||s.charAt(i)=='?')
							isSpecialChar = true;
						else {
							flag = false;
							isLower = false;
							break;
						}
					}
					if(isLower && isUpper && isDigit && isSpecialChar)
						flag = true;
				}
				if(flag)
					System.out.println("YES");
				else
					System.out.println("NO");

			}
		}catch(Exception e){
			return;
		}
	}
}