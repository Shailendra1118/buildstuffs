/**
 * 
 */
package com.shailendra.main;

/**
 * @author Shailendra
 *
 */
public class Stocks {

	public static void main(String args[]){
		
		int price[] = {100,113,110,85,105,102,86,63,81,101,94,106,101,79,94,90,97};
		int change[] = {13, -3, -25, 20, -3, -16, -23, 18, 20, -7, 12, -5, -22, 15, -4, 7};
		int min = 0, max = 0, diff = 0, cdiff = 0, sum = 0,current_sum = 0;
		int left = 0, right = 0,i,j;
		
		for(i=0; i<change.length; i++){
			current_sum = 0;
			for(j=i; j<change.length;j++){
				current_sum = current_sum + change[j];
				//min = price[i];
				//max = price[j];
				//cdiff = Math.abs(max-min);
				//if(cdiff > diff)
				//{
				//	diff = cdiff;
				//}
				if(sum < current_sum){
					sum = current_sum;
					System.out.println("Sum "+sum+" Current sum "+current_sum);
				}
				
				
			}
			left = i;
			right = j;
		}
		
		//System.out.println(diff+" max:"+max+" min:"+min);
		System.out.println(left+" "+right+" sum "+sum);
		
		
	}
}
