package arraysAndStrings;

import java.util.Scanner;

public class OneAway {
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter first string: ");
		char[] str1 = sc.next().toCharArray();
		System.out.println("Enter first string: ");
		char[] str2 = sc.next().toCharArray();
		
		String result = checkOneAway(str1, str2);
		
		System.out.println(result);
		
	}
	
	public static String checkOneAway(char[] str1, char[] str2){
		
		int len1 = str1.length;
		int len2 = str2.length;
		
		if((len1 - len2 > 1) || (len2 - len1 > 1)){
			return "Not one away";
		}
		
		
		else{
			int difference = 0;
			
			int i = 0;
			int j = 0;
			while(i < len1 - 1 && j < len2 - 1){
				if(str1[i] != str2[j]){
					if(str1[i+1] == str2[j]){
						i++;
						i++;
						j++;
					}
					else if(str1[i] == str2[j+1]){
						i++;
						j++;
						j++;
					}
					difference++;
				}
				
				i++;
				j++;
				
				if(difference > 1){
					return "Not one away";
				}
			}
		}
		return "One away";
	}
}
