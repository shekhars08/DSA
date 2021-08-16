package Strings;

// Optimize solution

import java.util.HashMap;
import java.util.Scanner;

public class FirstNotRepeatingChar1 {
	
	static char myfunctionChecker1(String str) {
		HashMap<Character, Integer> char_cnt = new HashMap<>();
		for(int i=0; i<str.length(); i++) {
			char c = str.charAt(i);
			if(char_cnt.containsKey(c)) {
				char_cnt.put(c, char_cnt.get(c) +1);
			}
			else {
				char_cnt.put(c, 1);
			}
		}
		
		for(int i=0; i<str.length(); i++) {
			char c = str.charAt(i);
			if(char_cnt.get(c) ==1) return c;
		}
		return '_';
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
