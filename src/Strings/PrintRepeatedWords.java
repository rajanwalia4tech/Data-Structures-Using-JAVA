package Strings;

import java.util.HashMap;
import java.util.Map;

/*
 * String s = "Java is not just a Language Java is a emotion";
 * 
 * print the repeated words only
 * 
 *  output of the above string is
 *  Java
 *	a
 *	is
 */

public class PrintRepeatedWords {

	public static void main(String[] args) {
		String s = "Java is not just a Language Java is a emotion";
		String words[] = s.split(" ");
		boolean flag = false;
		
		HashMap<String,Integer> map = new HashMap<>();
		for(int i=0;i<words.length;i++) {
			if(map.containsKey(words[i])) {
				map.put(words[i],map.get(words[i])+1);
				continue;
			}
			map.put(words[i],1);
		}
		
		for(Map.Entry<String, Integer> m : map.entrySet()) {
			if(m.getValue()>1)
				System.out.println(m.getKey());
		}
		
		System.out.println("Done!");
	}

}
