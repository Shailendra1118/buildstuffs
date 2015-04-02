/**
 * 
 */
package com.shailendra.utils;

/**
 * @author Shailendra
 *
 */
public class QuickSort {

	/**
	 * @param args
	 */
	public static int[] numbers = {12,34,4,75,23,65,86};
	
	public static void main(String[] args) {
		
		//int[] sortedNumbers = null;
		if(numbers.length > 0){
			quicksort(0, numbers.length-1);
		}
		System.out.println("Sorted:");
		for(int i : numbers)
			System.out.print(i+" ");
	}

	/**
	 * @param i
	 * @param j
	 */
	private static void quicksort( int low, int high) {
		
		int pivot = low+(high-low)/2;
		int i = low;
		int j = high;
		System.out.println("Pivot "+numbers[pivot]+" low:"+low+" high:"+high);
		
		while(i<j){
			while(numbers[i] < numbers[pivot]){
				i++;
				//System.out.println("i-"+i);
			}
			while(numbers[j] > numbers[pivot]){
				j--;
				//System.out.println("j-"+j);
			}
			if(i<=j){
				//exchange number
				System.out.println("exchange: "+numbers[i]+" "+numbers[j]);
				int temp = numbers[i];
				numbers[i] = numbers[j];
				numbers[j] = temp;
				i++;
				j--;
			}	
			System.out.println("After this iteration: ");
			for(int k=0; k<numbers.length; k++){
				System.out.print(numbers[k]+" ");
			}
			System.out.println();
		}
		
		if(j > low){
			System.out.println("calling with j-"+j+"and low-"+low);
			quicksort(low, j);
			System.out.println("returning from low and j");
		}
		if(i < high){
			System.out.println("calling with i- "+i+"and high-"+high);
			quicksort(i, high);
			System.out.println("returning from i and high");
		}
		
		
	}

}
