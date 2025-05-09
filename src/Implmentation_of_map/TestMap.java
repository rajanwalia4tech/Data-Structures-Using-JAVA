package Implmentation_of_map;

public class TestMap {

	public static void main(String[] args) {
		Map<String,Integer> map = new Map<>();
		
		// inserting in Map
		for(int i=0;i<20;i++) {
			map.insert("abc"+i,1+i);
			System.out.println("Load Factor "+ map.loadFactor());
		}

		// delete given key in  Map
		map.removeKey("abc3");
		map.removeKey("abc7");
		
		// getValue in Map
		for(int i=0;i<20;i++) {
			System.out.println("abc"+i+" : "+map.getValue("abc"+i));
		}
	}

}
