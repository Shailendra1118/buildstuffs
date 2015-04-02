/**
 * 
 */
package com.shailendra.main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/**
 * @author Shailendra
 *
 */
public class Collect {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int a =10;
		ArrayList<Integer> array = new ArrayList();
		array.add(a);
		
		Object array1[] = new String[5];//{12,24,45,4,63,343,34,5};
		//array1[0] = new String("Shailendra"); 
		//array1[2] = new DVDInfo(12, "Halo");
		//Integer result = array1.get(0);
		//System.out.println(result.toString());

		//array1[0] = new Integer(23);
		ArrayList<? super AbsClass> array2 = new ArrayList(); // ArrayList<? extends Abstract> wont compile
		array2.add(new ConClass());
		array2.add(new ConClass());
		testIt(array2);
		
		List<Integer> list = new ArrayList();
		list.add(12);
		list.add(343);
		list.add(342);
		for(int i=0; i <3; i++)
			list.set(i, 123); //throws IOBException bcoz size is 0
		
		Iterator<Integer> iter = list.iterator();
		while (iter.hasNext()) {
			Integer type = (Integer) iter.next();
			System.out.println(type);
		}
				
		//ArrayList<Number> lst = new ArrayList<Integer>(); compilation error 
		List<? extends Number> listExtendsNumber_ListNumber  = new ArrayList<Number>();
		List<? extends Number> listExtendsNumber_ListInteger = new ArrayList<Integer>();
		List<? extends Number> listExtendsNumber_ListDouble  = new ArrayList<Double>();
		
		 List<? super Number> listSuperNumber_ListNumber  = new ArrayList<Number>();
		//List<? super Number> listSuperNumber_ListInteger = new ArrayList<Integer>();      // error - Integer is not superclass of Number
		//List<? super Number> listSuperNumber_ListDouble  = new ArrayList<Double>();       // error - Double is not superclass of Number
		 
		//List<Integer> listInteger_ListNumber  = new ArrayList<Number>();                  // error - can assign only exactly <Integer>
		  List<Integer> listInteger_ListInteger = new ArrayList<Integer>();
		//List<Integer> listInteger_ListDouble  = new ArrayList<Double>();                  // error - can assign only exactly <Integer>
		
	}

	/**
	 * @param conClass
	 */
	private static void testIt(ArrayList<? super AbsClass> array2) {
		System.out.println("In testIt method");
		array2.add(new ConClass());
		for(Object o : array2){
			System.out.println(o.toString());
		}
	}

}
