/**
 * 
 */
package com.shailendra.main;

/**
 * @author Shailendra
 *
 */
public class CheckInnerStatic {

    private static class Test {
         static {
           System.out.println("Static block initialized");
        }
        public Test () {
           System.out.println("Constructor called");
        }
    }

    public static void main (String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        System.out.println("Inside main");
      //Class.forName("com.shailendra.main.CheckInnerStatic$Test");    // Doesn't work, gives ClassNotFoundException
       //Test test = new Test();   // Works fine
    }
}