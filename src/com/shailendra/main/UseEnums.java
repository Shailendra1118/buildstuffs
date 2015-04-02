/**
 * 
 */
package com.shailendra.main;

/**
 * @author Shailendra
 *
 */
public class UseEnums {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		System.out.println(NodeTypes.FACILITY.value);
		
		NodeTypes str = NodeTypes.CUSTOMER;
		System.out.println(str.value);

		
	}

}
