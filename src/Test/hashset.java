package Test;
import java.util.*;

public class hashset {

	public static void main(String[] args) {
		HashSet<List<Integer>> s = new HashSet<>();
		HashSet<int[]> t = new HashSet<>();
		int r[]= new int[]{1,2,3};
		t.add(r);
		int b[]= new int[]{1,2,3};
		t.add(b);
		System.out.println(t);
		
	}

}

