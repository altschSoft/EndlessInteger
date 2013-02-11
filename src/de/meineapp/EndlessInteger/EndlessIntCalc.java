package de.meineapp.EndlessInteger;

public class EndlessIntCalc {
	
	
	/**
	 * Constructor
	 * Saves read in String to an Int Array
	 * @param numberString
	 */
	public EndlessIntCalc ( String numberString ) {
		if (numberString != null) {
			saveNumber = this.StringToIntArray(numberString);
		} else {
			saveNumber = this.StringToIntArray("0");
		}
	}
	
	public EndlessIntCalc(int[] number) {
		if (number != null) {
			saveNumber = number;
		} else {
			saveNumber = this.StringToIntArray("0");
		}
	}
	

	private int[] saveNumber;
		
	//Setter
	public void setsaveNumber ( int[] saveNumber ) {
		//think about what happens when the saveNumber is null
			//When savenumber is null, a null pointer exception occurs.
			//to avoid this, savenumber is set to 0 when initially is null.
		if (saveNumber != null) {
			this.saveNumber = saveNumber;
				
		}else {
			return;
			}
	}
	
	//Getter
	public int[] getsaveNumber () {		
		return saveNumber;
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

	

		
	
	public EndlessIntCalc AddInteger ( EndlessIntCalc number ) {
		int number1, number2, rest = 0;
		int[] firstNumber = this.saveNumber;		//Objekt aus dem Konstruktor
		int[] secondNumber = number.getsaveNumber();	//Zweites objekt
		
		int maxLength = GetMaxLengthOfTwoArrays(firstNumber, secondNumber) + 1;
		int[] additionResult = new int[maxLength];
				
		//Add characterwise
		for ( int i = 0; i < maxLength; i++) {
					
			number1 = this.getNumberFromIntArraySavely(firstNumber, i);
			number2 = this.getNumberFromIntArraySavely(secondNumber, i);

			additionResult[i] = (rest + number1 + number2) % 10;
			rest = (rest + number1 + number2) / 10;
		}
		
		//Reread me :)
		EndlessIntCalc result = new EndlessIntCalc(additionResult);			
		return result;	
	}
			
	
	/**
	 * Gets the maximal length of two arrays
	 * @param int array saveNumber
	 * @param int array save2Number
	 * @return
	 */
	private int GetMaxLengthOfTwoArrays (int[] saveNumber, int[] save2Number) {
		
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
	
	/**
	 * Returns the character on position i with leading zeros
	 * @param int array savedNumber
	 * @param int i
	 * @return int saveNumber
	 */
	private int getNumberFromIntArraySavely(int[] savedNumber, int i) {
		int saveNumber;
		if ( i < savedNumber.length ) {
			saveNumber = savedNumber[i];
		}else {
			saveNumber = 0;
		}
		return saveNumber;
	}

}
