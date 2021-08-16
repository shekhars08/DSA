package Strings;

import java.util.Scanner;

public class FirstNotRepeatingChar3 {
	
	static char myfunctionChecker1(String str) {
		
		for(int i=0; i<str.length(); i++) {
			char c = str.charAt(i);
			if(str.indexOf(c) == str.lastIndexOf(c)) {
				return c;
			}
		}
		return '$';
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string :");
		String str = sc.next();
		
		System.out.println("String is : " +str);
		
		char x = myfunctionChecker1(str);
		System.out.println(x);
		sc.close();

	}

}
