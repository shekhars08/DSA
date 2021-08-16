package Strings;

import java.util.Scanner;

public class AddTwoStr {
	
	public static String addStrings(String str1, String str2) {
		String res = "";
		
		int i = str1.length() - 1;
		int j = str2.length() - 1;
		int carry = 0;
		
		while(i>=0 || j>=0 || carry!=0) {
			int ival = i>=0 ? str1.charAt(i) - '0' : 0;
			int jval = j>=0 ? str2.charAt(j) - '0' : 0;
			i--;j--;
			
			int sum = ival + jval + carry;
			res = (sum % 10) + res;
			carry = sum/10;
		}
		return res;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first Strings :");
		String str1 = sc.next();
		System.out.println("Enter second Strings :");
		String str2 = sc.next();
		System.out.println();
		System.out.println("Addition of two strings are : ");
		System.out.println(addStrings(str1, str2));
		sc.close();
		

	}

}
