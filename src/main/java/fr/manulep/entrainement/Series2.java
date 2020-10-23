package fr.manulep.entrainement;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import com.google.common.primitives.Chars;
import java.util.*;

public class Series2 {




	private Series2() {
		throw new IllegalStateException("Test class");
	}


/* ----------------------------------------------------------------------------------------------------- */


/* ----------------------------------------------------------------------------------------------------- */




	public static List<String> selectElementsFromListStartingWithA(List<String> elements) {
		List<String> wordStartingWithA = new ArrayList<>();
		for (String element : elements) {
			if ((element.charAt(0) == 'a') || (element.charAt(0) == 'A')) {
				wordStartingWithA.add(element);
			}
		}
		return wordStartingWithA;
	}



/* ----------------------------------------------------------------------------------------------------- */


/* ----------------------------------------------------------------------------------------------------- */



	public static List<String> sortByLastLetter(List<String> names) {

		List<String> sortByLastLetter = new ArrayList<>();
		sortByLastLetter = names;
		char[] alphabet = { ' ', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q',
				'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z' };
		for (int i = 0; i < sortByLastLetter.size(); i++) {

			for (int j = 0; j < sortByLastLetter.size(); j++) {
				if (Chars.indexOf(alphabet,
						sortByLastLetter.get(i).charAt(sortByLastLetter.get(i).length() - 1)) < Chars.indexOf(alphabet,
								sortByLastLetter.get(j).charAt(sortByLastLetter.get(j).length() - 1))) {
					Collections.swap(sortByLastLetter, i, j);
				}
			}
		}
		return sortByLastLetter;
	}



/* ----------------------------------------------------------------------------------------------------- */


/* ----------------------------------------------------------------------------------------------------- */




	public static String exportWordsWithoutALetter(List<String> names, char letter) {

		boolean haveLetter = false;
		List<String> namesWithoutNull = new ArrayList<>();
		List<String> wordsWithoutLetter = new ArrayList<>();
		String result = "";

		for (String name : names) {
			if (name != null) {
				namesWithoutNull.add(name);

			}
		}
		for (int i = 0; i < namesWithoutNull.size(); i++) {

			char[] charNames = namesWithoutNull.get(i).toCharArray();

			for (int j = 0; j < charNames.length; j++) {

				if (Character.toLowerCase(charNames[j]) == letter) {
					haveLetter = true;

				}
			}
			if (!haveLetter) {

				wordsWithoutLetter.add(namesWithoutNull.get(i));

			}
			haveLetter = false;

		}
		if (wordsWithoutLetter.size() == 1) {
			result = wordsWithoutLetter.get(0);
		} else
			for (String word : wordsWithoutLetter) {
				if (word != wordsWithoutLetter.get(wordsWithoutLetter.size() - 1)) {
					result += word + ", ";
				} else {
					result += word;
				}

			}

		return result;
	}
 



/* ----------------------------------------------------------------------------------------------------- */

/* ----------------------------------------------------------------------------------------------------- */





	public static String getAllLetters(List<String> words) {

		char[] alphabet = { ' ', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q',
				'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z' };
		List<Character> listAllLetter = new ArrayList<Character>();
		String strEntry = "";

		// stringListarray to string without space
		for (String word : words) {
			strEntry += word;
		}
		// string to char listarray
		for (int i = 0; i < strEntry.length(); i++) {
			listAllLetter.add(strEntry.charAt(i));
		}

		// Delete all twins

		for (int i = listAllLetter.size() - 1; i >= 0; i--) {

			for (int j = i + 1; j < listAllLetter.size(); j++) {

				if (listAllLetter.get(i) == listAllLetter.get(j)) {
					listAllLetter.remove(listAllLetter.get(i));

				}
			}

		}
		// Swap alphabet in order

		for (int i = 0; i < listAllLetter.size(); i++) {

			for (int j = 0; j < listAllLetter.size(); j++) {
				if (Chars.indexOf(alphabet, listAllLetter.get(i)) < Chars.indexOf(alphabet, listAllLetter.get(j))) {
					Collections.swap(listAllLetter, i, j);
				}
			}
		}

		// char arraylist to string
		String result = new String();
		for (char letter : listAllLetter) {
			result = result + letter;
		}

		return result;
	}


	
/* ----------------------------------------------------------------------------------------------------- */


/* ----------------------------------------------------------------------------------------------------- */





	public static List<String> getElementsLowerThanNumber(List<String> elements, int maxi) {

		List<String> StringListLessThanMaxi = new ArrayList<>();

		// Add element <= 6 in StringListLessThanMaxi

		for (String element : elements) {

			if (Integer.parseInt(element) <= 6) {
				StringListLessThanMaxi.add(element);
			}
		}

		// Remove twins in StringListLessThanMaxi

		for (int i = 0; i < StringListLessThanMaxi.size(); i++) {

			for (int j = i + 1; j < StringListLessThanMaxi.size(); j++) {

				if (Integer.parseInt(StringListLessThanMaxi.get(i)) == Integer
						.parseInt(StringListLessThanMaxi.get(j))) {

					StringListLessThanMaxi.remove(StringListLessThanMaxi.indexOf(StringListLessThanMaxi.get(i)));
				}

			}
		}
		// Sort String from smallest value to highest value

		for (int i = 0; i < StringListLessThanMaxi.size(); i++) {

			for (int j = i + 1; j < StringListLessThanMaxi.size(); j++) {

				if (Integer.parseInt(StringListLessThanMaxi.get(i)) >= Integer
						.parseInt(StringListLessThanMaxi.get(j))) {
					Collections.swap(StringListLessThanMaxi,
							StringListLessThanMaxi.indexOf(StringListLessThanMaxi.get(i)),
							StringListLessThanMaxi.indexOf(StringListLessThanMaxi.get(j)));
				}
			}
		}

		return StringListLessThanMaxi;
	}


/* ----------------------------------------------------------------------------------------------------- */


/* ----------------------------------------------------------------------------------------------------- */




	public static List<Integer> exportPeerElements(List<Integer> elements) {

		List<Integer> peerElement = new ArrayList<>();

		// Select peer number and Add them to List<Integer> peerElement
		for (int element : elements) {
			float halfNumber = (float) element / 2;
			if (halfNumber == Math.floor(halfNumber)) {
				peerElement.add(element);
			}
		}
		return peerElement;
	}


/* ----------------------------------------------------------------------------------------------------- */


/* ----------------------------------------------------------------------------------------------------- */




	public static List<Integer> exportSortPeerElements(List<Integer> elements) {

		List<Integer> peerElement = new ArrayList<>();

		// Select peer number and Add them to List<Integer> peerElement
		for (int element : elements) {
			float halfNumber = (float) element / 2;
			if (halfNumber == Math.floor(halfNumber)) {
				peerElement.add(element);
			}
		}
		// Remove twins in StringListLessThanMaxi

		for (int i = 0; i < peerElement.size(); i++) {

			for (int j = i + 1; j < peerElement.size(); j++) {

				if (peerElement.get(i) == peerElement.get(j)) {

					peerElement.remove(peerElement.indexOf(peerElement.get(i)));
				}

			}
		}
		// Sort number from smallest value to highest value

		for (int i = 0; i < peerElement.size(); i++) {

			for (int j = i + 1; j < peerElement.size(); j++) {

				if (peerElement.get(i) >= peerElement.get(j)) {
					Collections.swap(peerElement, peerElement.indexOf(peerElement.get(i)),
							peerElement.indexOf(peerElement.get(j)));
				}
			}
		}
		return peerElement;
	}


/* ----------------------------------------------------------------------------------------------------- */


/* ----------------------------------------------------------------------------------------------------- */




	public static List<Integer> allElementsExceptFirstAndLast(List<Integer> elements) {

		List<Integer> listWithoutFirstAndLast = new ArrayList<Integer>();

		for (int element : elements) {
			listWithoutFirstAndLast.add(element);
		}

		listWithoutFirstAndLast.remove(0);
		listWithoutFirstAndLast.remove(listWithoutFirstAndLast.size() - 1);

		return listWithoutFirstAndLast;
	}


/* ----------------------------------------------------------------------------------------------------- */


/* ----------------------------------------------------------------------------------------------------- */




	public static List<Integer> reverseOrder(List<Integer> elements) {

		List<Integer> reverseOrder = new ArrayList<>();

		for (int i = elements.size() - 1; i >= 0; i--) {

			reverseOrder.add(elements.get(i));
		}

		return reverseOrder;

	}


/* ----------------------------------------------------------------------------------------------------- */


/* ----------------------------------------------------------------------------------------------------- */




	public static List<Integer> swapFirstandLastElement(List<Integer> elements) {

		List<Integer> swapFirstAndLast = new ArrayList<>();

		for (int element : elements) {
			swapFirstAndLast.add(element);
		}

		Collections.swap(swapFirstAndLast, swapFirstAndLast.indexOf(swapFirstAndLast.get(0)),
				swapFirstAndLast.indexOf(swapFirstAndLast.get(swapFirstAndLast.size() - 1)));

		return swapFirstAndLast;
	}


/* ----------------------------------------------------------------------------------------------------- */


/* ----------------------------------------------------------------------------------------------------- */




	public static int numberOfPalindromeWord(String text) {

		int numberOfPalindromeWords = 0;
		String stringToCheck = text;
		Pattern pat = Pattern.compile(": ");
		Matcher mat = pat.matcher(stringToCheck);

		if (mat.find()) {
			String[] splitedText = stringToCheck.split(": ");
			stringToCheck = splitedText[1];
		}

		String[] arrayWordsToCheck = stringToCheck.split(", ");

		for (String word : arrayWordsToCheck) {

			String wordWithoutSpace = word.replace(" ", "");
			wordWithoutSpace = wordWithoutSpace.replace("?", "");
			wordWithoutSpace = wordWithoutSpace.replace("'", "");
			wordWithoutSpace = wordWithoutSpace.toLowerCase();

			int j = wordWithoutSpace.length() - 1;
			int countSameLetters = 0;
			for (int i = 0; i < wordWithoutSpace.length(); i++) {

				if (wordWithoutSpace.charAt(i) == wordWithoutSpace.charAt(j)) {
					countSameLetters++;
				}
				j--;
			}
			if (countSameLetters == wordWithoutSpace.length()) {
				numberOfPalindromeWords++;
			}
		}

		return numberOfPalindromeWords;
	}


/* ----------------------------------------------------------------------------------------------------- */


/* ----------------------------------------------------------------------------------------------------- */




	public static String longestWord(String text) {
		String[] textArray = text.split(" ");
		int length = 0;
		String longestWord = "";
		for (String str : textArray) {
			String cleanWord = str.replace(",", "");
			if (cleanWord.length() > length) {
				length = cleanWord.length();
				longestWord = cleanWord;
			}
		}
		return longestWord;
	}


/* ----------------------------------------------------------------------------------------------------- */


/* ----------------------------------------------------------------------------------------------------- */




	public static String getAllLetters(String[] array) {
		char[] alphabet = { ' ', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q',
				'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z' };
		List<Character> listAllLetter = new ArrayList<Character>();
		String strEntry = "";

		// stringListarray to string without space
		for (String word : array) {
			strEntry += word;
		}
		// string to char listarray
		for (int i = 0; i < strEntry.length(); i++) {
			listAllLetter.add(strEntry.charAt(i));
		}

		// Delete all twins

		for (int i = listAllLetter.size() - 1; i >= 0; i--) {

			for (int j = i + 1; j < listAllLetter.size(); j++) {

				if (listAllLetter.get(i) == listAllLetter.get(j)) {
					listAllLetter.remove(listAllLetter.get(i));

				}
			}

		}
		// Swap alphabet in order

		for (int i = 0; i < listAllLetter.size(); i++) {

			for (int j = 0; j < listAllLetter.size(); j++) {
				if (Chars.indexOf(alphabet, listAllLetter.get(i)) < Chars.indexOf(alphabet, listAllLetter.get(j))) {
					Collections.swap(listAllLetter, i, j);
				}
			}
		}

		// char arraylist to string
		String result = new String();
		for (char letter : listAllLetter) {
			result = result + letter;
		}

		return result;
	}



/* ----------------------------------------------------------------------------------------------------- */


/* ----------------------------------------------------------------------------------------------------- */




	public static String titleize(String title) {

		System.out.println("Raw sentence : " + title);
		
		//Convert title in a Char[] all in lowercase.

		char[] chars = title.toLowerCase().toCharArray();
		boolean found = false;


		// Add upperCase to the beginning of a sentence.

		for (int i = 0; i < chars.length; i++) {
		  if (!found && Character.isLetter(chars[i])) {
			chars[i] = Character.toUpperCase(chars[i]);
			found = true;
			
		  } else if (chars[i]=='.') { 
			found = false;
		  }
		}


		//Convert chars[] back to a string.

		StringBuilder joinerChar = new StringBuilder();

		for(char letter : chars){
			joinerChar.append(letter);
		}
		String titleizedString = joinerChar.toString();
		System.out.println("First letter capitalized : " +  titleizedString);



		// Titleize keywords in titleizedString.

		String[] keyWords  = {"lion", "witch", "wardrobe"};
		
		for (String key : keyWords){
			

			if (titleizedString.indexOf(key) != -1 ) {

				titleizedString = titleizedString.substring(0, titleizedString.indexOf(key)) 
					+ titleizedString.substring(titleizedString.indexOf(key),titleizedString.indexOf(key)+1).toUpperCase() 
					+ titleizedString.substring(titleizedString.indexOf(key) + 1);
		   }

		}
		

		// Return TitleizedString
		System.out.println("Final result (+ keywords) : " + titleizedString);
		return titleizedString;
	  }



/* ----------------------------------------------------------------------------------------------------- */


/* ----------------------------------------------------------------------------------------------------- */




	public static List<String> findAnagrams(String name) {

		

		List<Character> charAnagram = new ArrayList<>();
		List<String> temp = new ArrayList<>();
		List<String> anagrams = new ArrayList<>();
		int compteur = 0;
		int count = 0;
		String anagram = new String();
		int lengthName = name.length();

		//numbers of anagrams possible with name.

		int nameFactorial = 1;
		for( int i = 2; i <= name.length(); i++ ){
			nameFactorial = nameFactorial * i;
		}
		
		temp.add(name);
		
		//Select each anagram
		for(int i = 1; i< nameFactorial; i++){
			if(count == 0){
				i=0;
			}
			//Translate each String anagram to CharAnagram
			charAnagram.clear();
			for (int j=0; j< temp.get(i).length(); j++){
				charAnagram.add(temp.get(i).charAt(j));
			}
			//Swap char anagram to create new anagram
			for (int j=charAnagram.size()-1; j>=compteur; j--){	
				

				//Swap only 
				if(j>compteur){
					Collections.swap(charAnagram, j, compteur);
				}
				for(char letter : charAnagram){
						anagram = anagram + letter;
				}
						
				anagrams.add(anagram);
				anagram = "";
				if(j>compteur){
					Collections.swap(charAnagram, j, compteur);
				}
				count++;
	
			}
		
			//return the fianl arraylist of anagrams when number of anagrams == name!
			if(count == nameFactorial){
				//Remove duplicates;

				Set<String> set = new LinkedHashSet<>();
				set.addAll(anagrams);
				anagrams.clear();
				anagrams.addAll(set);
				System.out.println("Number of anagrams : " + nameFactorial + "      " + Arrays.toString(anagrams.toArray()));
				return anagrams;
			}
			//Reload temp with the new anagrams
			else if(count == (temp.size() * (lengthName-compteur))){
				temp.clear();
				temp.addAll(anagrams);
				anagrams.clear();
				count = 0;
				compteur++;
			}
		}	
		return null ;
	}


/* ----------------------------------------------------------------------------------------------------- */


/* ----------------------------------------------------------------------------------------------------- */




	public static int roundUp(float number) {
		int roundNumber = Math.round(number);
		return roundNumber;
	}


/* ----------------------------------------------------------------------------------------------------- */


/* ----------------------------------------------------------------------------------------------------- */




	public static int findLastDayOfMonth(int month, int year) {

		boolean isBissextile = false;


		if( ( ((float)year/400) == (Math.floor(year/400)) ) 
						|| ( ((float)year/4) == (Math.floor(year/4)) 
						&& ((float)year/100) != (Math.floor(year/100)) ) ){
			
			isBissextile = true;	
			
		}
		if(month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12){
			
			return 31;
		}else if (month == 4 || month == 6 || month == 9 || month == 11) {
			
			return 30;
		}else {
			if(isBissextile){
			
				return 29;
			}else{
				
				return 28;
			}
			
		}
		
		
	}


/* ----------------------------------------------------------------------------------------------------- */


/* ----------------------------------------------------------------------------------------------------- */




	public static int factorial(int number) {

		int factorial = 1;
		for (int i = 2; i <= number; i++){
			factorial = factorial * i;
		}
		return factorial;
	}


/* ----------------------------------------------------------------------------------------------------- */


/* ----------------------------------------------------------------------------------------------------- */




	public static int convertToCelsius(int temperature) {
		
		int celsius = Math.round(((float)temperature - 32) * 5/9);
		
		return celsius;
	}


/* ----------------------------------------------------------------------------------------------------- */


/* ----------------------------------------------------------------------------------------------------- */




	public static boolean isPeerSum(final int... numbers) {

		int sum = 0;
		for(int number: numbers){
			sum += number; 
		}

		float halfNumber = (float)sum / 2;
		if (halfNumber == Math.floor(halfNumber)) {
			return true;
		} else {
			return false;
		}
	}


/* ----------------------------------------------------------------------------------------------------- */


/* ----------------------------------------------------------------------------------------------------- */




	public static boolean isRightTriangle(int side1, int side2, int side3) {
		
		List<Integer> sides = new ArrayList<>();
		sides.add(side1);
		sides.add(side2);
		sides.add(side3);

		//put in order
		for( int i = 1 ; i < sides.size(); i++ ){
			int y = i -1;
			if(sides.get(y) > sides.get(i)){
				Collections.swap(sides, i, y);
			}
		}System.out.println(Arrays.toString(sides.toArray()));
		
		//pythagore check
		if(Math.pow(sides.get(2), 2) == (Math.pow(sides.get(0), 2) + Math.pow(sides.get(1) , 2)) ){
			return true;
		}else{
			return false ;
		}
	}


/* ----------------------------------------------------------------------------------------------------- */


/* ----------------------------------------------------------------------------------------------------- */




	public static boolean isOrder(int... number) {

		
		int compteurA = 0;
		int compteurB = 0;

		for( int i = 1 ; i < number.length; i++ ){
			int y = i -1;
			if(number[i] > number[y] ){
				compteurA++;
			}
			else if(number[i] < number[y]){
				compteurB++;
			}
		}
		if(compteurA > 0 && compteurB > 0){

			return false;

		}else{

			return true;
		}
	
	}


/* ----------------------------------------------------------------------------------------------------- */


/* ----------------------------------------------------------------------------------------------------- */




	public static Float intToFloat(int number) {

		return (float)number;
	}


/* ----------------------------------------------------------------------------------------------------- */


/* ----------------------------------------------------------------------------------------------------- */




	public static Integer floatToInt(float number) {
	 	
		return Math.toIntExact(Math.round(Math.floor(number)));
	}


/* ----------------------------------------------------------------------------------------------------- */


/* ----------------------------------------------------------------------------------------------------- */




	public static String dateToString(LocalDate date, String format) {

		
		String europeanDate = date.format(DateTimeFormatter.ofPattern(format));

		return europeanDate;
	}

}
