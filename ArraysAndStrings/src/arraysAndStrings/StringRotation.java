package arraysAndStrings;

import java.util.Scanner;

public class StringRotation {

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter first string: ");
		String str1 = sc.next();

		System.out.println("Enter second string: ");
		String str2 = sc.next();

		boolean result = isRotation(str1, str2);

		if (result)
			System.out.println("Rotation");
		else
			System.out.println("Not a rotation");
	}

	public static boolean isRotation(String str1, String str2) {

		if (str1.length() != str2.length())
			return false;

		else
			return isSubstring(str1, str2);

	}

	public static boolean isSubstring(String str1, String str2) {
		str2 = str2.concat(str2);

		if (str2.contains(str1)) {
			return true;
		}
		return false;
	}
}
