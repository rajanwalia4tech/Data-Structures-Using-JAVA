package Implmentation_of_map;

// Node that will be used in the Array for seperate chaining
public class MapNode<K,V> {
	K key;
	V value;
	MapNode next; // pointer to next node
	
	public MapNode(K key,V value){
		this.key = key;
		this.value = value;
	}
}
