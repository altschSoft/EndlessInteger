package de.meineapp.EndlessInteger;

import EndlessIntCalc.SavitchIn;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Bitte geben sie eine Beliebig lange Zahl1 ein: ");
		String endlessInteger1 = SavitchIn.readLine();
		
		System.out.println("Bitte geben sie eine Beliebig lange Zahl2 ein: ");
		String endlessInteger2 = SavitchIn.readLine();
		
String result = EndlessIntCalc.AddInteger(endlessInteger1, endlessInteger2);
		System.out.println("Die Summe der beiden Zahlen ist: " + result);
		
	}

}
