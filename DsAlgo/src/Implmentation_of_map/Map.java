package Implmentation_of_map;

import java.util.ArrayList;

public class Map<K,V> {
	// we can't create generic type array in java
	// So we are using ArrayList here for buckets
	
	ArrayList<MapNode<K,V>> buckets;
	int size;	// No. of elements in the Map
	int numBuckets; // No. of buckets in the Map
	
	public Map() {
		buckets = new ArrayList<>();
		numBuckets = 5; 
		
		// Initialize the buckets as null
		for(int i=0;i<numBuckets;i++)
			buckets.add(null);
	}
	
	// hash function that will return the bucket index
	private int getBucketIndex(K key) {
		int hashCode = key.hashCode();
		return hashCode % numBuckets;
	}
	

	// size of the elements in map
	public int size() {
		return size;
	}
	
	// insert function that will insert items in Map
	public void insert(K key, V value) {
		int bucketIndex = getBucketIndex(key);
		MapNode<K, V> head = buckets.get(bucketIndex);
		while(head!=null) { // if key already present 
			if(buckets.contains(key)) {
				head.value = value;
				return ;
			}
			head = head.next;
		}
		// if key not present add it to the front of the linked list
		 head = buckets.get(bucketIndex);
		MapNode<K,V> newNode = new MapNode<K,V>(key,value);
		size++; // increase the size
		newNode.next = head;
		buckets.set(bucketIndex, newNode);
		double loadFactor = (1.0*size)/numBuckets;
		if(loadFactor>0.7) {
			rehash();
		}
	}
	
	private void rehash() {
		System.out.println("--- Rehashing --- Buckets "+numBuckets+" Size "+size);
		ArrayList<MapNode<K,V>> temp = buckets;
		buckets  = new ArrayList<>();
		for(int i=0;i<numBuckets*2;i++) {
			buckets.add(null);
		}
		
		size = 0;
		numBuckets*=2;
		for(int i=0;i<temp.size();i++) {
			MapNode<K,V> head = temp.get(i);
			while(head!=null) {
				K key = head.key;
				V value = head.value;
				insert(key,value);
				head = head.next;
			}
		}
	}

	// load factor is totalElements/numberOfBuckets
	public double loadFactor() {
		return (1.0*size)/numBuckets;
	}
	
	// return value of the corresponding key
	public V getValue(K key) {
		int bucketIndex = getBucketIndex(key);
		MapNode<K, V> head = buckets.get(bucketIndex);
		while(head!=null) { // if key already present 
			if(head.key.equals(key)) { // comapairing the given key with linkedlist elements
				return head.value;
			}
			head = head.next;
		}
		return null;
	}
	
	
	// remove Key in Map
	public V removeKey(K key) {
		int bucketIndex = getBucketIndex(key);
		MapNode<K, V> head = buckets.get(bucketIndex);
		MapNode<K,V>  prev = null;
		while(head!=null) { // if key already present 
			if(head.key.equals(key)) {
				size--; // decrease the size
				if(prev == null) { // if key is first node of the given bucketIndex 
					buckets.set(bucketIndex, head.next); 
				}
				else
					prev.next = head.next;
				return head.value;
			}
			prev = head;
			head = head.next;
		}
		return null;
	}
	
}
