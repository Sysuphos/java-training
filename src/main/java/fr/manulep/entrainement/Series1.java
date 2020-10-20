package fr.manulep.entrainement;

import java.util.ArrayList;
import java.util.Arrays;

public class Series1 {
	
	private Series1() {
		 throw new IllegalStateException("Test class");
	}


	public static String helloWorld(String name) {
		//1
		String message;
		if ((name != null) && (name != ""))
			message = "Hello " + name;
		else
			message = "Hello World";
		return message;
	}
	

	public static String[] removeNullElements(String[] array) {
		//2
		return null;
	}

	public static int[] addElementToBeginning(int[] array, int element) {
		//3
		return null;
	}
	
	public static int[] allElementsExceptFirstThree(int[] array) {
		//4
		return null;
	}
	
	public static String getFirstHalf(String word) {
		//5
		return null;
	}
	
	public static String[] selectElementsStartingWithA2(String[] array) {
		//6
		String[] mots;

		//compter le nombre de mots commencant par a
		int nb = 0;
		for (String elem : array) {
			//System.out.println(elem);
			if (elem.charAt(0) == 'a') {
				nb = nb + 1;  //nb++
				//System.out.println("oui");
			}
		}
		mots = new String[nb];

		// remplir le tableau
		int x = 0;
		for (int i = 0; i < array.length; i++) {
			String elem = array[i];
			System.out.println(elem);
			System.out.println("i="+i);
			System.out.println("x="+x);
			if (elem.charAt(0) == 'a') {
				mots[x] = elem;
				x++;
			}
			
		}

		return mots;
	}
	
	public static String[] selectElementsStartingWithA(String[] array) {
		String[] retour;
		System.out.println(Arrays.toString(retour));
		ArrayList<String> stock = new ArrayList<String>();

		for (String mot : array) {
			if (mot.charAt(0) == 'a') {
				stock.add(mot);
			}
		}

		// int x = 0;
		// retour = new String[stock.size()];
		// for (String mot : stock) {
		// 	retour[x] = mot;
		// 	x++;
		// }

		retour = stock.toArray(new String[stock.size()]);

		System.out.println(Arrays.toString(retour));
		return retour;
	}

	public static String[] selectElementsStartingWithVowel(String[]array) {
		//7
		return null;
	}
	
	public static String[] reverseOrderInArray(String[]array) {
		//8
		return null;
	}

	public static int[] insertElementInTheMiddleOfAnArray(int[] array, int element) {
		//9
		return null;
	}

	public static String shortestWord(String text) {
		//10
		return null;
	}

	public static String removeCapitals(String text) {
		//11
		return null;
	}
	
	public static long addingTwoNumbers(long number1, long number2) {
		//12
		return -1;
	}

	public static long addingThreeNumbers(long number1, long number2, long number3) {
		//13
		return -2;
	}

	public static long addingSeveralNumbers(final Integer... numbers) {
		//14
		return -1;
	}

	public static float makeNegative(float number) {
		//15
		return 0;
	}

	public static boolean checkForSpecialCharacters(String string) {
		//16
		return false;
	}

	public static boolean checkIfStringStartsWithConsonant( String word ) {
		//17
		return false;
	}

	public static String getDomainName(String email) {
		//18
		return null;
	}

	public static int[] letterPosition(String name) {
		//19
		return null;
	}

	public static boolean isPeer(int number) {
		//20
		return false;
	}


}
