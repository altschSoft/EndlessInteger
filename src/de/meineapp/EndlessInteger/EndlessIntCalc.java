package de.meineapp.EndlessInteger;
import java.util.Arrays;

public class EndlessIntCalc {
	
	private int[] saveNumber;
	
	
	//Setter
	public void setsaveNumber ( int[] saveNumber ) {
		this.saveNumber = saveNumber;		
	}
	
	
	/**
	 * Saves read in String to an Int Array
	 * @param numberString
	 */
	public EndlessIntCalc ( String numberString ) {
		
		saveNumber = this.StringToIntArray(numberString);
	}
	
	/**
	 * Overwrites toString (which is always accessible, but does not work in most cases...)
	 */
	@Override public String toString(){
		String result = "";
		for ( int i = 0; i < saveNumber.length; i++){
			result = "" + saveNumber[i] + result;		
		}
		return result;			
	}
	
	
	
	
	/**
	 * Adds 2 Integers of random length
	 * @param String endlessInteger1 -> Input Value
	 * @param String endlessInteger2 -> Input Value
	 * @return Calculated Integer
	 */
	
	/**
	 * Getter--> LESEN!!!!
	 * 
	 * @return
	 */
	public int[] getsaveNumber () {
	return saveNumber;
	}
		
	
	public EndlessIntCalc AddInteger ( EndlessIntCalc number ) {
		int[] savedNumber = this.saveNumber;			//Objekt aus dem Konstruktor
		int[] saved2Number = number.getsaveNumber();	//Zweites Objekt
		
		int maxLength = GetMaxArrayLength(savedNumber, saved2Number) + 1;
		int[] additionResult = new int[maxLength];
	
			int rest = 0;
			
			int number1 = 0;
			int number2 = 0;
			
			
			for ( int i = 0; i < maxLength; i++) {
				
					
					if ( i < savedNumber.length ) {
						number1 = savedNumber[i];
					}else {
						number1 = 0;
					}
					if ( i < saved2Number.length ) {
						number2 = saved2Number[i];
					}else {
						number2 = 0;
					}
					
					additionResult[i] = (rest + number1 + number2) % 10;
					rest = (rest + number1 + number2) / 10;
					
				
			}
			EndlessIntCalc result = new EndlessIntCalc("0");
			result.setsaveNumber(additionResult);		
			return result;	
			}
			
			
			

	private int GetMaxArrayLength (int[] saveNumber, int[] save2Number) {
		
		int maxArrayLength = saveNumber.length;
			if ( save2Number.length > saveNumber.length ) {
				maxArrayLength = save2Number.length;
			}
		return maxArrayLength;
	}
	
	
	
	/**
	 * Converts a String to an IntArray
	 * @param toConvert String Entered to be converted to an IntArray
	 * @param return value
	 * @return intArray INT Array holding all numbers of entered String
	 */
	private int[]  StringToIntArray(String toConvert) {
		int[] intArray = new int[toConvert.length()];
		 
		for (int i = toConvert.length() - 1; i >= 0; i--) {
			intArray[toConvert.length() - i - 1] = Character.digit(toConvert.charAt(i), 10);
		}
		return intArray;

		
		
	}

}
