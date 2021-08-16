package Strings;

import java.util.Scanner;

// Brute Algorithm

public class FirstNotRepeatingChar {
	
	static char myfunctionChecker(String str) {
		for(int i=0; i<str.length(); i++) {
			boolean seenDuplicate = false;
			for(int j=0; j<str.length(); j++) {
				if(str.charAt(i) == str.charAt(j) && i !=j) {
					seenDuplicate = true;
					break;
				}
			}
			if(!seenDuplicate) return str.charAt(i);
		}
		return '_';
	}
	
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string :");
		String str = sc.next();
		
		System.out.println("String is : " +str);
		
		char x = myfunctionChecker(str);
		System.out.println(x);
		sc.close();
		
	}

}
