/**
 * 
 */
package com.shailendra.main;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Shailendra
 *
 */
public class Braille2DReader {

	public static int row = 3;
	public static int col = 2;
	public static int counter = 1;
	
	char [][] H = {{'O','.'},{'O','O'},{'.','.'}};
	char [][] E = {{'O','.'},{'.','O'},{'.','.'}};
	char [][] L = {{'O','.'},{'O','.'},{'O','.'}};
	char [][] L1 = {{'O','.'},{'O','.'},{'O','.'}};
	char [][] O = {{'O','.'},{'.','O'},{'O','.'}};
	
	public static void main(String[] args) {
	
		char [][] array = new char[row][col];
		try {
			array = populateArray(array);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		for(int i=0; i<row; i++){	
			for(int j=0; j<col; j++){
					//System.out.print(array[i][j]);
				}
				System.out.println();
			}
		
		//System.out.println(getEqChar(array));
		
		}


	/**
	 * @param array
	 * @return
	 */
	private static char getEqChar(char[][] array) {
		char [][] H = {{'O','.'},{'O','O'},{'.','.'}};
		char [][] E = {{'O','.'},{'.','O'},{'.','.'}};
		char [][] L = {{'O','.'},{'O','.'},{'O','.'}};
		char [][] O = {{'O','.'},{'.','O'},{'O','.'}};
		if(checkEquality(E, array))
			return 'E';
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
	 * @throws FileNotFoundException 
	 */
	private static void populateArray(char[][] array) throws FileNotFoundException {
//		array[0][0] = 'O';
//		array[0][1] = '.';
//		array[1][0] = 'O';
//		array[1][1] = 'O';
//		array[2][0] = '.';
//		array[2][1] = '.';
		
//		char [][] H = {{'O','.'},{'O','O'},{'.','.'}};
//		char [][] E = {{'O','.'},{'.','O'},{'.','.'}};
//		char [][] L = {{'O','.'},{'O','.'},{'O','.'}};
//		char [][] L1 = {{'O','.'},{'O','.'},{'O','.'}};
//		char [][] O = {{'O','.'},{'.','O'},{'O','.'}};
		

        Scanner salesDataFile = new Scanner(new File("input.txt"));
        ArrayList<String> salesData = new ArrayList<String>();

        while(salesDataFile.hasNextLine()){
            String line = salesDataFile.nextLine();
            Scanner scanner = new Scanner(line);
            scanner.useDelimiter(" ");
            while(scanner.hasNext()){
                salesData.add(scanner.next());
                putCharsInArray(salesData,counter);
                
            }
           
           
           
//            char a = salesData.get(0).charAt(0);
//            char b = salesData.get(0).charAt(1);
//            H[0][0] = a;
//            H[0][1] = b;
            scanner.close();
        }

        salesDataFile.close();
        
       
	}


	/**
	 * @param salesData
	 * @param counter2 
	 */
	private static void putCharsInArray(ArrayList<String> salesData, int counter2) {
		
		if(counter == 0){
			E
		}
	}



}
