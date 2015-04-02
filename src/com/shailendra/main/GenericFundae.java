/**
 * 
 */
package com.shailendra.main;

/**
 * @author Shailendra
 *
 */
public class GenericFundae {

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		
		System.out.println(compare(new Pair<String, Integer>("Shailendra", 1), new Pair<String, Integer>("Shailendra", 1))); //warning if not used <String,Integer>
	}
	
	public static <K, V> boolean compare(Pair<K, V> p1, Pair<K, V> p2){
		
		return p1.key.equals(p2.key) && p1.value.equals(p2.value);
	
	}
	
	

}

//Generic type class
class Pair<K, V>{
	
	public K key;
	public V value;
	
	public Pair(K key, V value){
		this.key = key;
		this.value = value;
	}
	
}
