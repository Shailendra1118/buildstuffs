/**
 * 
 */
package com.shailendra.main;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

/**
 * @author Shailendra
 *
 */
public class SetSubset {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "Shailendra");
		map.put(2, "Singh");
		map.put(3, "Yadav");
		
		Iterator<Entry<Integer, String>> iter = map.entrySet().iterator();
		while(iter.hasNext()){
			System.out.println(iter.next());
		}
		
		
		System.out.println(map.put(3, "Shivesh"));
		
		System.out.println("After first iteration");
		Iterator<Entry<Integer, String>> iter2 = map.entrySet().iterator();
		while(iter2.hasNext()){
			System.out.println(iter2.next().getValue());
		}
		

	}

}
