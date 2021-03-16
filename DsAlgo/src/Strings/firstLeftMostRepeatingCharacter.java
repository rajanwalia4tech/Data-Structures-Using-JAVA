package Strings;

public class firstLeftMostRepeatingCharacter {
	
	static int firstRepeating(String s)
	{
		int res=Integer.MAX_VALUE;
		int visited[] = new int[256];
		for(int i=0;i<256;i++)
			visited[i] = -1;
		for(int i=s.length()-1;i>=0;i--)
		{
			if(visited[s.charAt(i)] == -1)
				visited[s.charAt(i)]  = i;
			else
				res = i;
		}
		return (res == Integer.MAX_VALUE)?-1:res;
	}
	
	public static void main(String[] args) {
		
		System.out.println(firstRepeating("gadfl"));
		
	}

}
