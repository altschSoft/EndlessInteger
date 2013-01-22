package de.meineapp.EndlessInteger;
import java.util.Arrays;

public class EndlessIntCalc {
	
	//think more about your VariableNames --- too much saveNumbers and Numbers :)
	
	//Why is it better to have setter and getters and not a public int[]
	private int[] saveNumber;
		
	//Setter
	public void setsaveNumber ( int[] saveNumber ) {
		//think about what happens when the saveNumber is null
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
	@Override 
	public String toString(){
		String result = "";
		for ( int i = 0; i < saveNumber.length; i++){
			result = "" + saveNumber[i] + result;		
		}
		return result;			
	}	

	
	/**
	 * Getter--> LESEN!!!!
	 * 
	 * @return
	 */
	public int[] getsaveNumber () {		
		return saveNumber;
	}
		
	
	public EndlessIntCalc AddInteger ( EndlessIntCalc number ) {
		//refactor not over 20 Lines in one methode		
		int[] savedNumber = this.saveNumber;		//Objekt aus dem Konstruktor
		int[] saved2Number = number.getsaveNumber();	//Zweites Objekt
		
		//GetMaxArrayLength is not the right name -- a name like GetMaxLengthOfTwoArrays would be better
		int maxLength = GetMaxArrayLength(savedNumber, saved2Number) + 1;
		int[] additionResult = new int[maxLength];
	
		int rest = 0;
		
		int number1 = 0;
		int number2 = 0;		
		
		for ( int i = 0; i < maxLength; i++) {
					
			//codeduplication :( make a function getNumberFromIntArraySavely
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
		
		//create a second construct that takes an int array
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
	 * 
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
