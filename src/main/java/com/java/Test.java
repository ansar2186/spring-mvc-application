package com.java;

import java.util.Scanner;

public class Test {

	static boolean checkPalindrome(String s) {
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) != s.charAt(s.length() - i - 1))
				return false;
		}
		return true;
	}

	// Function that checks whether
	// all the palindromic
	// sub-strings are of odd length.
	static boolean CheckOdd(String s) {
		int n = s.length();
		for (int i = 0; i < n; i++) {

			// Creating each substring
			String x = "";
			for (int j = i; j < n; j++) {
				x += s.charAt(j);

				if (x.length() % 2 == 0 && checkPalindrome(x) == true)
					return false;
			}
		}

		return true;
	}

	
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		System.out.println(" Please enter a string ");
		String str = scanner.next();
		
		if (CheckOdd(str))
			System.out.print("Odd");
		else
			System.out.print("Not Odd");
	}

}
