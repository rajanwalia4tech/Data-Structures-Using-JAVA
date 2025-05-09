package RecursionOnArrays;

public class CheckNumberInArray {

	static boolean isPresent(int a[],int x,int startIndex){
		if(a.length == startIndex)
			return false;
		else if(a[startIndex] == x)
				return true;
		else
			return isPresent(a,x,startIndex+1);
		
	}
	
	public static void main(String[] args) {
		int a[] = {1,2,3,4,5};
		System.out.println(isPresent(a,45,0));
	}

}
