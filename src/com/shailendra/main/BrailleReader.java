/**
 * 
 */
package com.shailendra.main;

/**
 * @author Shailendra
 *
 */
public class BrailleReader {

	/**
	 * @param args
	 */
	
	public static int row = 5;
	public static int col = 3;
	public static int len = 2;
	
	public static void main(String[] args) {
	
		char[][][] array = new char[row][col][len];
		char [][] twodarray = new char[col][len];
		array = populateArray(array);
		
		for(int x=0; x<row; x++){	
			for(int i=0; i<col; i++){
				for(int j=0; j<len; j++){
					//array[i][j] = 'a';
					System.out.print(array[x][i][j]);
					
				}
				System.out.println();
			}
			System.out.println();
			
			//System.out.println(reachEqChar(array));
		}
		
		

	}

	/**
	 * @param array
	 * @return
	 */
	private static char reachEqChar(char[][] array) {
		char [][] H = {{'O','.'},{'O','O'},{'.','.'}};
		if(checkEquality(H, array))
			return 'H';
		
		return 'X';
	}
	
	private static boolean checkEquality(char [][] H, char[][] array){
		boolean equal = true;
		for(int i=0; i<row; i++){
			for(int j=0; j>col; j++){
				if(H[i][j] != array[i][j]){
					equal = false;
					break;
				}
			}
			if(!equal)
				break;
		}
		return equal;
	}

	/**
	 * @param array
	 * @return
	 */
	private static char[][][] populateArray(char[][][] array) {
//		array[0][0] = 'O';
//		array[0][1] = '.';
//		
//		array[1][0] = 'O';
//		array[1][1] = 'O';
//		
//		array[2][0] = '.';
//		array[2][1] = '.';
		
		char [][] H = {{'O','.'},{'O','O'},{'.','.'}};
		char [][] E = {{'O','.'},{'.','O'},{'.','.'}};
		char [][] L = {{'O','.'},{'O','.'},{'O','.'}};
		char [][] L1 = {{'O','.'},{'O','.'},{'O','.'}};
		char [][] O = {{'O','.'},{'.','O'},{'O','.'}};
		
		char lipi[][][] = {
				{{'O','.'},{'O','O'},{'.','.'}},
				{{'O','.'},{'.','O'},{'.','.'}},
				{{'O','.'},{'O','.'},{'O','.'}},
				{{'O','.'},{'O','.'},{'O','.'}},
				{{'O','.'},{'.','O'},{'O','.'}}
		};
		return lipi;
	}

}
