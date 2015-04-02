/**
 * 
 */
package com.shailendra.main;

/**
 * @author Shailendra
 *
 */
public class WorkLoad {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int folders[] = {10,20,30,40,50,60,70,80,90};
		System.out.println(getMostWork(folders, 3));
	}

	/**
	 * @param folders
	 * @param i
	 * @return
	 */
	private static int getMostWork(int[] folders, int workers) {
		
		 int n = folders.length;
		   int lo = 90; //*max_element( folders.begin(), folders.end() );
		   int hi = 450; //accumulate( folders.begin(), folders.end(), 0 );
		   int iter = 1;
		   while ( lo < hi ) {
		      int x = lo + (hi-lo)/2;

		      int required = 1, current_load = 0;
		      for ( int i=0; i<n; ++i ) {
		         if ( current_load + folders[i] <= x ) {
		            // the current worker can handle it
		            current_load += folders[i];
		         }
		         else {
		            // assign next worker
		            ++required;
		            current_load = folders[i];               
		         }
		         
		         System.out.println("After "+i+"th iteration of for loop: x-"+x+" lo-"+lo+", hi-"+hi+
		        		 " currentload-"+current_load+" required-"+required);
		      }

		      if ( required <= workers )
		         hi = x;
		      else
		         lo = x+1;
		      
		      System.out.println("After "+iter+" While loop: workers-"+workers+" hi-"+hi+" lo-"+lo);
		      iter++;
		   }

		   return lo;
		
	}

}
