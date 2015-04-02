/**
 * 
 */
package com.shailendra.main;

/**
 * @author Shailendra
 *
 */
public abstract class AbsClass {

	public AbsClass(){
		System.out.println("HELLO from Absclass");
	}
	
	int a;
	
	public void testMethod() throws RuntimeException{
		System.out.println("in testMethod");
	}
}
