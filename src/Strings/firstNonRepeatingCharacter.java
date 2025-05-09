package Strings;

public class firstNonRepeatingCharacter {

	static  int firstNonRepeat(String s)
	{
		int res = Integer.MAX_VALUE;
		int frequency[] = new int[256];
		for(int i=0;i<256;i++)
			frequency[i] = -1;
		
		for(int i=0;i<s.length();i++)
		{
			char curChar= s.charAt(i);
			if(frequency[curChar] == -1)
				frequency[curChar] = i;
			else
				frequency[curChar] = -2;
		}
		for(int i=0;i<256;++i)
		{
			if(frequency[i]>=0)
			{
				res = Math.min(res,frequency[i]);
			}
				
		}
			return (res==Integer.MAX_VALUE)?-1:res;
	}
	
	
	public static void main(String[] args) {
		String s = "geeksgeeks";
		System.out.println(firstNonRepeat(s));
		
	}

}
