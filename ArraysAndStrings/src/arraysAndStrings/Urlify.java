package arraysAndStrings;

import java.util.Scanner;

public class Urlify {

	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter total number of characters: ");
		int total = sc.nextInt();
		System.out.println("Enter string to test: ");
		String original = sc.next();
		original = original.trim();
		
		char[] toUrl = original.toCharArray();
		
		convertURL(toUrl, total);
		
	}
	
	private static String convertURL(char[] toURL, int total) {
		int i = 0;
		int j = 0;
		
		while(i > toURL.length && j > total){
			
		}
		return null;
	}
}
