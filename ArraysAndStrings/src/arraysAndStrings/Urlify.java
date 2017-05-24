package arraysAndStrings;

import java.util.Scanner;

public class Urlify {

	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter string to test: ");
		String original = sc.nextLine();
		System.out.println("Enter total number of characters: ");
		
		int actualLen = sc.nextInt();
		
		char[] toUrl = original.toCharArray();
		convertURL(toUrl, actualLen);
		
	}
	
	private static void convertURL(char[] toURL, int actualLen) {
		
		//finding total spaces
		
		int spaceCount = 0;
		
		for(int i = 0; i < actualLen-1; i++){
			if(toURL[i] == ' '){
				spaceCount ++;
			}
		}
		
		// length of the new string
		int index = actualLen + (2 * spaceCount);
		
		int actual = actualLen - 1;
		int newlen = index - 1;
		
		// replacing spaces with "%20"
		while(actual >= 0 && newlen >= 0){
			if(toURL[actual] == ' '){
				toURL[newlen] = '0';
				toURL[newlen - 1] = '2';
				toURL[newlen - 2] = '%';
				newlen -= 3;
			}
			else {
				toURL[newlen] = toURL[actual];
				newlen--;
			}
			actual--;
		}
		
		
		System.out.println(String.valueOf(toURL));
	}
}
