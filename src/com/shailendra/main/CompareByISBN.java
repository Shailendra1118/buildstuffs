/**
 * 
 */
package com.shailendra.main;

import java.util.Comparator;

/**
 * @author Shailendra
 *
 */
public class CompareByISBN implements Comparator<DVDInfo> {

	/* (non-Javadoc)
	 * @see java.util.Comparator#compare(java.lang.Object, java.lang.Object)
	 */
	@Override
	public int compare(DVDInfo o1, DVDInfo o2) {
		if(o1.getIsbn() < o2.getIsbn())
			return -1;
		else if(o1.getIsbn() > o2.getIsbn())
			return 1;
		else
		return 0;
	}

	
}
