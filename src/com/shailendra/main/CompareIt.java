/**
 * 
 */
package com.shailendra.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.PriorityQueue;

/**
 * @author Shailendra
 *
 */
public class CompareIt {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int []a = {1,5,6,7,8,23,4,3,52,34};
		// TODO Auto-generated method stub
		DVDInfo d1 = new DVDInfo(23423, "Returns of the Aps");
		DVDInfo d2= new DVDInfo(52343, "Gone Girl");
		DVDInfo d3 = new DVDInfo(74534, "The Intersteller");
		DVDInfo d4 = new DVDInfo(3434, "Boyhood");
		DVDInfo d5 = new DVDInfo(546546, "Fury");
		ArrayList<DVDInfo> array = new ArrayList<>();
		array.add(d1);
		array.add(d2);
		array.add(d3);
		array.add(d4);
		array.add(d5);
		Iterator<DVDInfo> iter = array.iterator();
		while(iter.hasNext()){
			System.out.println(iter.next().getTitle());
			
		}
		
		Collections.sort(array, new CompareByISBN());
		System.out.println("Another sorting-----");
		for(DVDInfo dvd : array){
			System.out.println(dvd.getTitle());
		}
		
		
		//testing treeSet
		PriorityQueue p = new PriorityQueue<>();
		for(int x : a){
			p.offer(x);
		}
		System.out.println("size of queue "+p.size());
		for(int x : a){
			System.out.println(" in p "+p.poll());
		}
		
	}

}
