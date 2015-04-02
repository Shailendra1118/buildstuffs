/**
 * 
 */
package com.shailendra.utils;

import java.util.LinkedList;

/**
 * @author Shailendra
 *
 */
public class MyList {

	public static void main(String args[]){
		int n = 3;
		LinkedList list = new LinkedList<>();
		list.add(123);
		list.add(34);
		list.add(323);
		list.add(5);
		list.add(344);
		list.add(63); // ??
		list.add(343);
		list.add(311);
		
		for(int i = 0;i< list.size(); i++){
			System.out.println(list.get(i));
		}
		
		//find nth from last
		for(int j = 0; j < list.size(); j++){
			if(j+1 < n-1){
				continue;
			}
			else{
				System.out.println(n+"th element from end is "+list.get(j));
				break;
			}
		}
	}
}
