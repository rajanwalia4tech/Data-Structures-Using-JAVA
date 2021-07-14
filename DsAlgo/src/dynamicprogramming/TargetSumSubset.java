package dynamicprogramming;

import java.util.Scanner;

public class TargetSumSubset {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		
		for(int i=0;i<n;i++) {
				arr[i]= sc.nextInt();
		}
		
		int target = 4;
		
		System.out.println(isTargetSum(arr,0,0,target));
	}

	private static boolean isTargetSum(int[] arr,int idx,int curSum, int target) {
		
		if(idx==arr.length) {
			if(curSum == target)
				return true;
			return false;
		}
		
		if(isTargetSum(arr,idx+1,curSum,target))
			return true;
		if(isTargetSum(arr,idx+1,arr[idx]+curSum,target))
			return true;
		return false;
	}

}
