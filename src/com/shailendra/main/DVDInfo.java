/**
 * 
 */
package com.shailendra.main;

/**
 * @author Shailendra
 *
 */
public class DVDInfo implements Comparable<DVDInfo> {

	private int isbn;
	private String title;
	
	
	public DVDInfo(int isbn, String title){
		this.isbn = isbn;
		this.title = title;
	}
	
	
	/**
	 * @return the isbn
	 */
	public int getIsbn() {
		return isbn;
	}
	/**
	 * @param isbn the isbn to set
	 */
	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}
	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}
	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}


	/* (non-Javadoc)
	 * @see java.lang.Comparable#compareTo(java.lang.Object)
	 */
	@Override
	public int compareTo(DVDInfo o) {
		return title.compareTo(o.getTitle());
	}
	
}
