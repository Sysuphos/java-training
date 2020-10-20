package fr.manulep.entrainement;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertIterableEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * Training : condition, loop, array
 * 
 * notes to read assert : - use of JUnit 5 - the first parameter is "what you
 * must have as a result" - the second parameter is the call of the method
 * 
 * @author manulep
 *
 */

@DisplayName("Series 1")
class Series2Test {
	/**
	 * selects elements starting with a
	 */
	@Test
	void selectElementsFromListStartingWithA() {
		List<String> fruits = Arrays.asList("bananas", "apples", "pears", "avocados");
		List<String> fruitsStartWithA = Arrays.asList("apples", "avocados");
		assertIterableEquals(fruitsStartWithA, Series2.selectElementsFromListStartingWithA(fruits));
	}

	/**
	 * sorts by the last letter of each word
	 */
	@Test
	public void sortByLastLetter() {
		List<String> nameList = Arrays.asList("Lannister", "Stark", "Greyjoy", "Targaryen");
		List<String> expectedList = Arrays.asList("Stark", "Targaryen", "Lannister", "Greyjoy");

		assertIterableEquals(expectedList, Series2.sortByLastLetter(nameList));
	}

	/**
	 * get the word without a letter upper and lower (ex:"a" and "A")
	 */
	@Test
	public void exportWordsWithoutALetter() {
		List<String> nameList = Arrays.asList("Lannister", "Stark", "Greyjoy", null, "Targaryen", "Arthur");

		assertEquals("Greyjoy", Series2.exportWordsWithoutALetter(nameList, 'a'));
		assertEquals("Lannister, Stark, Greyjoy, Targaryen, Arthur", Series2.exportWordsWithoutALetter(nameList, 'z'));
	}

	/**
	 * 'gets all letters in an array of words
	 */
	@Test
	public void getAllLetters() {
		List<String> wordList = Arrays.asList("cat", "dog", "fish", "cat");
		assertEquals("acdfghiost", Series2.getAllLetters(wordList));
	}

	/*
	 * gets elements lower than six
	 */
	@Test
	public void getElementsLowerThanSix() {
		List<String> numberList = Arrays.asList("1", "3", "50", "4", "1", "2", "6", "2", "10", "3", "7");
		List<String> expectedList = Arrays.asList("1", "2", "3", "4", "6");

		assertIterableEquals(expectedList, Series2.getElementsLowerThanNumber(numberList, 7));
	}

	/**
	 * get elements is peer duplicate elements
	 */
	@Test
	public void exportAllPeerElements() {

		List<Integer> numberList = Arrays.asList(2, 3, 2, 0, 4, 11, 6, 8);
		List<Integer> expected = Arrays.asList(2, 2, 0, 4, 6, 8);
		assertIterableEquals(expected, Series2.exportPeerElements(numberList));

		numberList = Arrays.asList(9, 3, 11);
		expected = new ArrayList<Integer>();
		assertIterableEquals(expected, Series2.exportPeerElements(numberList));
	}

	/**
	 * get elements is peer sort by ascending
	 */
	@Test
	public void exportPeerElements() {
		List<Integer> numberList = Arrays.asList(2, 3, 2, 0, 4, 11, 6, 8);
		List<Integer> expectedList = Arrays.asList(0, 2, 4, 6, 8);
		assertIterableEquals(expectedList, Series2.exportSortPeerElements(numberList));

		numberList = Arrays.asList(9, 3, 11);
		expectedList = new ArrayList<Integer>();
		assertIterableEquals(expectedList, Series2.exportSortPeerElements(numberList));

		numberList = Arrays.asList(2, 3, 2, 0, 4, 4, 6, 6);
		expectedList = Arrays.asList(0, 2, 4, 6);
		assertIterableEquals(expectedList, Series2.exportSortPeerElements(numberList));
	}

	/**
	 * suppress first and last elements
	 */
	@Test
	public void allElementsExceptFirstAndLast() {

		List<Integer> numberList = Arrays.asList(2, 3, 2, 0, 4, 11, 6, 8);
		List<Integer> expectedList = Arrays.asList(3, 2, 0, 4, 11, 6);
		assertEquals(expectedList, Series2.allElementsExceptFirstAndLast(numberList));

		numberList = Arrays.asList(9, 3, 11);
		expectedList = Arrays.asList(3);
		assertIterableEquals(expectedList, Series2.allElementsExceptFirstAndLast(numberList));

		numberList = Arrays.asList(2, 3);
		expectedList = new ArrayList<Integer>();
		assertIterableEquals(expectedList, Series2.allElementsExceptFirstAndLast(numberList));
	}

	/**
	 * reverse order list
	 */
	@Test
	public void reverseOrder() {

		List<Integer> numberList = Arrays.asList(2, 3, 2, 0, 4, 11, 6, 8);
		List<Integer> expectedList = Arrays.asList(8, 6, 11, 4, 0, 2, 3, 2);
		assertIterableEquals(expectedList, Series2.reverseOrder(numberList));

		numberList = Arrays.asList(9, 3, 11);
		expectedList = Arrays.asList(11, 3, 9);
		assertIterableEquals(expectedList, Series2.reverseOrder(numberList));

		numberList = Arrays.asList(2, 3);
		expectedList = Arrays.asList(3, 2);
		assertIterableEquals(expectedList, Series2.reverseOrder(numberList));
	}

	/**
	 * swap first and last element
	 */
	@Test
	public void swapFirstandLastElement() {

		List<Integer> numbersList = Arrays.asList(2, 3, 2, 0, 4, 11, 6, 8);
		List<Integer> expectedList = Arrays.asList(8, 3, 2, 0, 4, 11, 6, 2);
		assertIterableEquals(expectedList, Series2.swapFirstandLastElement(numbersList));

		numbersList = Arrays.asList(2, 3, 2, 0, 4, 11, 6, 2);
		expectedList = Arrays.asList(2, 3, 2, 0, 4, 11, 6, 2);
		assertIterableEquals(expectedList, Series2.swapFirstandLastElement(numbersList));

		numbersList = Arrays.asList(2);
		expectedList = Arrays.asList(2);
		assertIterableEquals(expectedList, Series2.swapFirstandLastElement(numbersList));
	}

	/**
	 * returns the shortest word
	 */
	/**
	 * returns the first longest word
	 */
	@Test
	public void longestWord() {
		String text = "Hey birds, winter is coming with snow.";
		assertEquals("winter", Series2.longestWord(text));
	}

	/**
	 * counts elements in an text that are palindrome word
	 */
	@Test
	public void numberOfPalindromeWords() {
		String text = "search palindromes in this text : 'kayak', 'noon', 'khaleesi', 'hodor', 'racecar', 'a', 'tattarrattat', ";
		assertEquals(5, Series2.numberOfPalindromeWord(text));

		text = "'All the world's a stage', 'rail at a liar', 'Tis the time's plague when madmen lead the blind', 'Did Hannah see bees ? Hannah did', 'Sums are not set as a test on Erasmus' ";
		assertEquals(3, Series2.numberOfPalindromeWord(text));
	}

	/**
	 * titleizes a string
	 */
	@Test
	public void titleize() {
		assertEquals("The Lion the Witch and the Wardrobe", Series2.titleize("the lion the witch and the wardrobe"));
		assertEquals("The Lion the Witch. And the Wardrobe", Series2.titleize("the lion the witch. and the wardrobe"));
	}

	/**
	 * finds all possible anagrams of a word
	 */
	@Test
	public void findAnagrams() {
		List<String> actual = Series2.findAnagrams("madl");
		assertAll("find anagrams of madl", () -> assertEquals(24, actual.size()),
				() -> assertTrue(actual.contains("adlm")), () -> assertTrue(actual.contains("adml")),
				() -> assertTrue(actual.contains("aldm")), () -> assertTrue(actual.contains("almd")),
				() -> assertTrue(actual.contains("amdl")), () -> assertTrue(actual.contains("amld")),
				() -> assertTrue(actual.contains("dalm")), () -> assertTrue(actual.contains("daml")),
				() -> assertTrue(actual.contains("dlam")), () -> assertTrue(actual.contains("dlma")),
				() -> assertTrue(actual.contains("dmal")), () -> assertTrue(actual.contains("dmla")),
				() -> assertTrue(actual.contains("ladm")), () -> assertTrue(actual.contains("lamd")),
				() -> assertTrue(actual.contains("ldam")), () -> assertTrue(actual.contains("ldma")),
				() -> assertTrue(actual.contains("lmad")), () -> assertTrue(actual.contains("lmda")),
				() -> assertTrue(actual.contains("madl")), () -> assertTrue(actual.contains("mald")),
				() -> assertTrue(actual.contains("mdal")), () -> assertTrue(actual.contains("mdla")),
				() -> assertTrue(actual.contains("mlad")), () -> assertTrue(actual.contains("mlda")));

		List<String> actual2 = Series2.findAnagrams("mad");
		assertAll("find anagrams of mad", () -> assertEquals(6, actual2.size()),
				() -> assertTrue(actual2.contains("dma")), () -> assertTrue(actual2.contains("dam")),
				() -> assertTrue(actual2.contains("adm")), () -> assertTrue(actual2.contains("amd")),
				() -> assertTrue(actual2.contains("mda")), () -> assertTrue(actual2.contains("mad")));

		List<String> actual4 = Series2.findAnagrams("ma");
		assertAll("find anagrams of ma", () -> assertEquals(2, actual4.size()),
				() -> assertTrue(actual4.contains("am")), () -> assertTrue(actual4.contains("ma")));

				List<String> actual3 = Series2.findAnagrams("mll");
		assertAll("find anagrams of mall", () -> assertEquals(3, actual3.size()),
				() -> assertTrue(actual3.contains("llm")), () -> assertTrue(actual3.contains("lml")),
				() -> assertTrue(actual3.contains("mll"))); 

	}

	/**
	 * rounds up a number
	 */
	@Test
	public void roundUp() {
		assertEquals(3, Series2.roundUp(3.10f));
		assertEquals(24, Series2.roundUp(23.76f));
		assertEquals(10, Series2.roundUp(9.5f));
	}

	/**
	 * converts Fahrenheit to Celsius rounding to the nearest integer
	 */
	@Test
	public void convertToCelsius() {
		assertEquals(0, Series2.convertToCelsius(32));
		assertEquals(13, Series2.convertToCelsius(55));
	}

	/**
	 * converts int to float
	 */
	@Test
	public void intToFloat() {
		assertEquals(32.000f, Series2.intToFloat(32));
	}

	/**
	 * converts float to int
	 */
	@Test
	public void floatToInt() {
		assertEquals(32, Series2.floatToInt(32.54f));
	}

	/**
	 * formats a date nicely
	 */
	@Test
	public void formatDateNicely() {
		LocalDate date = LocalDate.of(2019, 11, 26);
		assertEquals("26/11/2019", Series2.dateToString(date, "dd/MM/yyyy"));
	}

	/**
	 * sum of number is peer
	 */
	@Test
	public void checkIfSumIsPeer() {
		assertEquals(true, Series2.isPeerSum(10, 20, 10));
		assertEquals(false, Series2.isPeerSum(10, 21, 10));
		assertEquals(true, Series2.isPeerSum(11, 21));
		assertEquals(false, Series2.isPeerSum(11, 51, 11, 19, 15));
		assertEquals(false, Series2.isPeerSum(13));
	}

	/**
	 * donner le dernier jour du mois
	 */
	@Test
	public void findAllLastDayMonth() {
		assertEquals(31, Series2.findLastDayOfMonth(07, 2017));
		assertEquals(30, Series2.findLastDayOfMonth(11, 2017));
		assertEquals(28, Series2.findLastDayOfMonth(02, 2017));
		assertEquals(29, Series2.findLastDayOfMonth(02, 2016));
		assertEquals(29, Series2.findLastDayOfMonth(02, 2000));
		assertEquals(28, Series2.findLastDayOfMonth(02, 2100));
	}

	/**
	 * finds the factorial of a number
	 */
	@Test
	public void factorial() {
		assertEquals(120, Series2.factorial(5)); // = 5 * 4 * 3 * 2 * 1
	}

	@Test
	public void checkIfRightTriangle() {
		assertEquals(true, Series2.isRightTriangle(3, 4, 5));
		assertEquals(true, Series2.isRightTriangle(5, 4, 3));
		assertEquals(true, Series2.isRightTriangle(5, 3, 4));
		assertEquals(false, Series2.isRightTriangle(5, 3, 3));

	}

	/**
	 * is numbers a orderly continuation
	 */
	@Test
	public void checkIsOrder() {
		assertEquals(true, Series2.isOrder(13, 14, 17));
		assertEquals(false, Series2.isOrder(5, 8, 21, 14, 15));
		assertEquals(true, Series2.isOrder(14, 13, 10, 8));
		assertEquals(false, Series2.isOrder(5, 13, 8));
		assertEquals(true, Series2.isOrder(5));
	}

}
