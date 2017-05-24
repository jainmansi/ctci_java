package arraysAndStrings;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class CheckPermutation {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first string: ");
		char[] str1 = sc.next().toCharArray();
		System.out.println("Enter second string: ");
		char[] str2 = sc.next().toCharArray();

		String result1 = testPermutation_sort(str1, str2);
		String result2 = testPermutation_hashing(str1, str2);

		System.out.println("Using sorting "+result1);
		System.out.println("Using hashing "+result2);
	}

	// Solving the problem in O(nlogn) complexity

	public static String testPermutation_sort(char[] str1, char[] str2) {
		int len1 = str1.length;
		int len2 = str2.length;

		if (len1 != len2)
			return "Not Permutation";

		Arrays.sort(str1);
		Arrays.sort(str2);
		int i = 0;
		int j = 0;

		while (i < len1 && j < len2) {
			if (str1[i] == str2[j]) {
				i++;
				j++;
			} else {
				return "Not Permutation";
			}
		}

		return "Permutation";
	}

	// Solving the problem in O(n) complexity

	public static String testPermutation_hashing(char[] str1, char[] str2) {
		int len1 = str1.length;
		int len2 = str2.length;
		
		if(len1 == 0 || len2 == 0){
			return "String can't be empty";
		}

		if (len1 != len2)
			return "Not Permutation";

		HashMap<String, Integer> str1count = new HashMap<>();
		HashMap<String, Integer> str2count = new HashMap<>();

		for (int i = 0; i < len1; i++) {
			String key = String.valueOf(str1[i]);

			if (str1count.containsKey(key)) {
				str1count.put(key, str1count.get(key) + 1);
			} else {
				str1count.put(key, 1);
			}
		}
		
		for (int i = 0; i < len2; i++) {
			String key = String.valueOf(str2[i]);

			if (str2count.containsKey(key)) {
				str2count.put(key, str2count.get(key) + 1);
			} else {
				str2count.put(key, 1);
			}
		}
		
		for(String key: str1count.keySet()){
			int count1 = str1count.get(key);
			
			if(!str2count.containsKey(key)){
				return "Not Permutation";
			}
			
			else{
				if(count1 != str2count.get(key)){
					return "Not Permutation";
				}
			}
		}

		return "Permutation";
	}
}
