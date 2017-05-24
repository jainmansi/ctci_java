package arraysAndStrings;

import java.util.HashMap;
import java.util.Scanner;

public class IsUnique {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string to test: ");
		String toTest = sc.next();
		System.out.println(checkUnique(toTest));
	}

	//using hashmap to solve the question in O(n) time
	
	public static String checkUnique(String testStr) {
		HashMap<String, Integer> counterMap = new HashMap<>();
		int length = testStr.length();

		for (int i = 0; i < length; i++) {
			String c = String.valueOf(testStr.charAt(i));
			if (!counterMap.containsKey(c)) {
				counterMap.put(c, 1);
			} else {
				return "Not Unique";
			}
		}
		return "Unique";
	}
}
