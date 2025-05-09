package Arrays;

public class PrintStarsAsArrayElements {

	static int min(int[] a) {
		 int min = Integer.MAX_VALUE;
		 for(int i=0;i<a.length;i++) {
			 if(a[i]<min)
				 min = a[i];
		 }
		 return min;
	}
	
	static int max(int[] a) {
		 int max = Integer.MIN_VALUE;
		 for(int i=0;i<a.length;i++) {
			 if(a[i]>max)
				 max = a[i];
		 }
		 return max;
	}
	
	public static void main(String[] args) {
		int []a = {-9,1,-5,6,-3,4,-5,5,-6,9,7,0,3,-7};
		int max= max(a);
		int min = min(a);
		for(int i=max;i>=min;i--) {
			for(int j=0;j<a.length;j++) {
				if(i<0 && i>=a[j])
					System.out.print("*");
				else if(i<=a[j] && i>0 )
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
			
		}
	}


}
