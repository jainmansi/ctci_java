package arraysAndStrings;

import java.util.Scanner;

public class StringCompression {

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter string: ");
		char[] str = sc.next().toCharArray();

		String result = compress(str);

		System.out.println(result);
	}

	//method to compress the string
	public static String compress(char[] str) {

		//is compression needed?
		if (str.length <= compressedLength(str)) {
			return String.valueOf(str);
		}

		//logic for string compression
		int i = 0;
		int count = 1;
		StringBuilder result = new StringBuilder();

		while (i < str.length - 1) {
			if (str[i] != str[i + 1]) {
				result = result.append(String.valueOf(str[i])).append(String.valueOf(count));
				count = 1;
			} else {
				count++;
			}

			i++;

		}
		result = result.append(String.valueOf(str[i])).append(String.valueOf(count));

		return result.toString();
	}

	// check if the string needs compression
	public static int compressedLength(char[] str) {

		int count = 1;
		int total = 0;
		for (int i = 0; i < str.length - 1; i++) {
			if (str[i] != str[i + 1]) {
				total += 1 + count;
				count = 1;
			}
		}
		total += 1 + count;
		return total;

	}
}
