package arraysAndStrings;

import java.util.HashMap;
import java.util.Scanner;

public class PalindromePermutation {
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string to test: ");
		char[] teststr = sc.nextLine().toCharArray();

		checkPalindromePerm(teststr);
	}

	public static void checkPalindromePerm(char[] str) {
		int len = str.length;

		HashMap<String, Integer> countermap = new HashMap<>();

		// inserting value in hashmap
		for (int i = 0; i < len; i++) {
			String key = String.valueOf(str[i]);
			if (!countermap.containsKey(key)) {
				if (!key.equals(" ")) {
					countermap.put(key, 1);
				}
			} else {
				countermap.put(key, countermap.get(key) + 1);
			}
		}

		// only 0 or 1 letter can appear odd times
		int oddCount = checkTotalOdds(countermap);

		if (oddCount == 0 || oddCount == 1) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}
	}

	// counting number of odd letters
	public static int checkTotalOdds(HashMap<String, Integer> countermap) {

		int counter = 0;

		for (String key : countermap.keySet()) {
			if (countermap.get(key) % 2 == 1) {
				counter++;
			}
		}
		return counter;
	}
}
