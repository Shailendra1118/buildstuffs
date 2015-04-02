/**
 * 
 */
package com.shailendra.main;

/**
 * @author Shailendra
 *
 */
public class ConClass extends AbsClass{

	public static void main(String args[]){
		
		System.out.println("hello from main "+new ConClass());
		System.out.println(1.0/0.0);
		
		ConClass a = new ConClass();
		a.dotheMath();
	}
	public ConClass(){
		super();
		//System.out.println(this.a);
	}
	
	public void dotheMath(){
		System.out.println("in do the math");
	}
	
	public void testMethod(){
		System.out.println("in conclass testMethod ");
		//throw new Exception();
	}
}
