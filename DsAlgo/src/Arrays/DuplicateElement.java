package Arrays;

public class DuplicateElement {

	public static void main(String[] args) {
		int a[] = {0,7,2,5,4,7,1,3,6};
		System.out.println(findDuplicate(a));
	}

	private static int findDuplicate(int[] a) {
		
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
					return a[i];
			}
		}
		return -1;
	}
}
