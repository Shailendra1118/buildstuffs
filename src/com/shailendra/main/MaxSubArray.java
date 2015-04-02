/**
 * 
 */
package com.shailendra.main;


/**
 * @author Shailendra
 *
 */
public class MaxSubArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int price[] = {100,113,110,85,105,102,86,63,81,101,94,106,101,79,94,90,97};
		int change[] = {-13, -3, -25, -20, -3, -16, -23, -18, -20, -7, -12, -5, -22, -15, -4, -7};
		
		ArrayAttributes attribute = findMaxSubArray(change, 0, 15);
		
		System.out.println("Answer : "+attribute.getLow()+" "+attribute.getHigh()+" "+attribute.getSum());
	}

	public static ArrayAttributes findMaxSubArray(int price[], int low, int high){
		
		int mid = 0;
		
		if(low == high){
			ArrayAttributes attr = new ArrayAttributes();
			attr.setLow(low);
			attr.setHigh(high);
			attr.setSum(price[low]);
			return attr;
		}else{
			mid = (low+high)/2;
			ArrayAttributes left = findMaxSubArray(price, low, mid);
			
			ArrayAttributes right = findMaxSubArray(price, mid+1, high);
			
			ArrayAttributes cross = findMaxCrossSubArray(price, low, mid, high);
			
			if(left.getSum() >= right.getSum() && left.getSum() >= cross.getSum()){
				return left;
			}
			else if(right.getSum() >= left.getSum() && right.getSum() >= cross.getSum()){
				return right;
			}
			else
				return cross;
		}
		
	
		//return attribute;
	}
	
	public static ArrayAttributes findMaxCrossSubArray(int price[], int low, int mid, int high){
		
		int leftSum = 0, rightSum = 0, sum = 0, maxLeft = 0, maxRigh=0;
		ArrayAttributes arrayAttributes = new ArrayAttributes();
		for(int i = mid; i >= low; i-- ){
			sum = price[i] + sum;
			if(sum > leftSum){
				leftSum = sum;
			}
			maxLeft = i;
				
		}
		sum = 0;
		for(int j = mid+1; j <= high; j++ ){
			sum = price[j]+sum;
			if(sum > rightSum){
				rightSum = sum;
			}
			maxRigh = j;
		}
		
		arrayAttributes.setLow(maxLeft);
		arrayAttributes.setHigh(maxRigh);
		arrayAttributes.setSum(leftSum+rightSum);
		
		return arrayAttributes;
	}
	
	
}
