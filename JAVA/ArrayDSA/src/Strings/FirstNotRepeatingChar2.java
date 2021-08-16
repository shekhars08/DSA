package Strings;

import java.util.Scanner;

public class FirstNotRepeatingChar2 {
	
	static char myfunctionChecker1(String str) {
		
		int char_cnt[] = new int[26];
		for(char c : str.toCharArray()) char_cnt[c - 'a']++;
		
		for(char c : str.toCharArray()) {
			if(char_cnt[c - 'a'] == 1) return c;
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
