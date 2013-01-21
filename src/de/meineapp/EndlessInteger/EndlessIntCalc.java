package de.meineapp.EndlessInteger;
import java.util.Arrays;

public class EndlessIntCalc {
	
	/**
	 * Adds 2 Integers of random length
	 * @param String endlessInteger1 -> Input Value
	 * @param String endlessInteger2 -> Input Value
	 * @return Calculated Integer
	 */

	public static String AddInteger ( String endlessInteger1, String endlessInteger2) {
		//Get Length of longest String
		int minStringLength = EndlessIntCalc.GetMinStringLength(endlessInteger1, endlessInteger2);
		int maxArrayLength = EndlessIntCalc.GetMaxArrayLength(endlessInteger1, endlessInteger2);
		
		//Convert Strings to integer arrays
		int[] integerArray1 = EndlessIntCalc.StringToIntArray(endlessInteger1);
		int[] integerArray2 = EndlessIntCalc.StringToIntArray(endlessInteger2);
		int resultArray[];
		resultArray = new int [ maxArrayLength ];
		
		//Add element-wise
		int override = 0;
		for ( int i = 0; i < minStringLength; i++) {
			if ([integerArray1[ maxArrayLength - i - 1 ] != null) & (integerArray2[ maxArrayLength - i - 1 ] != null) {
				
				
				
				
				
				
				
				
				
				
			}
			
			
			
			
			//int sum = integerArray1[ maxArrayLength - i - 1 ]+ override + integerArray2[ maxArrayLength - i - 1 ];
			if ( sum >= 10 ) {
				override = 1;
				resultArray[ (maxArrayLength - i -1) ] = sum-10;
			}else {
				resultArray[ (maxArrayLength - i -1) ] = sum;
				override = 0;
			}
		
			
		}
		String temp = Arrays.toString(resultArray).replace(", ", "");
		String encoded = temp.substring(1, temp.length()-1);
		return encoded;
		
		
		
		
		}

	
	/**
	 * Checks the minimum length of 2 entered Strings
	 * @param String endlessInteger1 as Input Value 1
	 * @param String endlessInteger2 as Input Value 2
	 * @return Integer maximumStringLength
	 */
	private static int GetMinStringLength (String endlessInteger1, String endlessInteger2) {
		
		int minStringLength = endlessInteger1.length();
			if ( endlessInteger2.length() < minStringLength ) {
				minStringLength = endlessInteger2.length();
			}
		return minStringLength;
	}
	
	private static int GetMaxArrayLength (String endlessInteger1, String endlessInteger2) {
		
		int maxArrayLength = endlessInteger1.length();
			if ( endlessInteger2.length() > maxArrayLength ) {
				maxArrayLength = endlessInteger2.length();
				//In case of override when both numbers are of same length
				maxArrayLength = (maxArrayLength * 2) ;
			}
		return maxArrayLength;
	}
	
	
	
	/**
	 * Converts a String to an IntArray
	 * @param toConvert String Entered to be converted to an IntArray
	 * @param return value
	 * @return intArray INT Array holding all numbers of entered String
	 */
	private static int[]  StringToIntArray(String toConvert) {
		int[] intArray = new int[toConvert.length()];
		 
		for (int i = 0; i < toConvert.length(); i++) {
			intArray[i] = Character.digit(toConvert.charAt(i), 10);
		}
		return intArray;

		
		
	}

}
