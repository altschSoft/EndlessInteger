package de.meineapp.EndlessInteger;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*System.out.println("Bitte geben sie eine Beliebig lange Zahl1 ein: ");
		String endlessInteger1 = SavitchIn.readLine();
		
		System.out.println("Bitte geben sie eine Beliebig lange Zahl2 ein: ");
		String endlessInteger2 = SavitchIn.readLine();
		

		String result = EndlessIntCalc.AddInteger(endlessInteger1, endlessInteger2);
		System.out.println("Die Summe der beiden Zahlen ist: " + result);
		*/
		
		EndlessIntCalc test = new EndlessIntCalc("1234");//put it up afterwards!!
		System.out.println(test.toString());
		
		EndlessIntCalc test2 = new EndlessIntCalc("456");
		System.out.println(test2.toString());
		
		
		EndlessIntCalc actualResult = test.MulitplyInteger(test2);
		System.out.println(actualResult);
		
		
		
		
		
		
	}

}
