package backtracking;

import java.util.*;

public class CombinationSum3 {

	public static void main(String[] args) {
		int n=1,k=9;
		List<List<Integer>> ans = new ArrayList<List<Integer>>();
		CombinationSum3(n,k,1,ans,new ArrayList<>());
		System.out.println(ans);
	}

	private static void CombinationSum3(int n, int k, int start, List<List<Integer>> ans, ArrayList<Integer> ds) {
		if(k==0) {
			if(n==0) {
				ans.add(new ArrayList<>(ds));
				return;
			}
		}
		
		for(int i=start;i<=9;i++) {
			ds.add(i);
			CombinationSum3(n-i,k-1,i+1,ans,ds);
			ds.remove(ds.size()-1);
		}
	}

}
