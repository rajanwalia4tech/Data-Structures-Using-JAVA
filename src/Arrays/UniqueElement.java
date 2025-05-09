package Arrays;

public class UniqueElement {

	public static void main(String[] args) {
		int []a = {1,3,1,3,6,6,7,10,7};
		System.out.println(findUnique(a));
	}

	private static int findUnique(int[] a) {
		for(int i=0;i<a.length;i++)
		{
			boolean flag =true;
			for(int j=0;j<a.length;j++)
			{
				if(a[j]==a[i] && i!=j) {
					flag = false;
					break;
				}
					
			}
			if(flag)
				return a[i];
		}
		return -1;
	}

}
