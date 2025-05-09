package Arrays;
import java.util.*;
	public class MoveAllTheZeroesToTheEnd {
	int arr[] = {9,0,0,8,2};
	
	int nonZero=0;
	for(int curr=0;curr<arr.length;curr++)
	{
		if(arr[curr]!=0) {
			
			int temp = arr[nonZero];
			arr[nonZero] = arr[curr];
			arr[curr] = temp;
			nonZero++;
		}
	}
	for(int i:arr)
		System.out.print(" "+i);
	}

}
