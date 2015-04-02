/**
 * 
 */
package com.shailendra.main;

/**
 * @author Shailendra
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int m = 7, n = 6;
		char [][] array = new char[m][n];		
		char x = 'X';
		

	    /*  k - starting row index
	        m - ending row index
	        l - starting column index
	        n - ending column index
	        i - iterator    */
	    int i, k = 0, l = 0;
	    // Store given number of rows and columns for later use
	    int r = m, c = n;
		
	    while (k < m && l < n)
	    {
	        /* Fill the first row from the remaining rows */
	        for (i = l; i < n; ++i)
	        	array[k][i] = x;
	        k++;
	 
	        /* Fill the last column from the remaining columns */
	        for (i = k; i < m; ++i)
	        	array[i][n-1] = x;
	        n--;
	 
	        /* Fill the last row from the remaining rows */
	        if (k < m)
	        {
	            for (i = n-1; i >= l; --i)
	            	array[m-1][i] = x;
	            m--;
	        }
	 
	        /* Print the first column from the remaining columns */
	        if (l < n)
	        {
	            for (i = m-1; i >= k; --i)
	            	array[i][l] = x;
	            l++;
	        }
	 
	        // Flip character for next iteration
	        x = (x == '0')? 'X': '0';
	    }
		
		for(int y=0; y<r; y++){
			for(int z=0; z<c; z++){
				//array[i][j] = 9;
				System.out.print(array[y][z]);
			}
			System.out.println();
		}
		
		

	}

}
