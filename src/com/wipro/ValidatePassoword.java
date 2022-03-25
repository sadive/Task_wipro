package com.wipro;

import java.util.stream.IntStream;

public class ValidatePassoword {

	public static void main(String[] args) {
		
		System.out.println(isvalidPassword("42BCCB28"));

	}

	public static boolean isPalindrome(String input) {

		return IntStream.range(0, input.length() / 2)
				.noneMatch(index -> input.charAt(index) != input.charAt(input.length() - index - 1));

	}

	public static int sumOfDigits(String password) {
		int sum = 0;
		for (int i = 0; i < password.length()-1; i++) {

			char c = password.charAt(i);
			if (Character.isDigit(c)) {
				int a = Integer.parseInt(String.valueOf(c));
				sum += a;

			}
		}
		return sum;

	}

	public static int uppercaseCount(String password) {
		int uppercaseCount = 0;
		for (int i = 0; i < password.length()-1; i++) {

			char c = password.charAt(i);
			if (Character.isUpperCase(c)) {
				uppercaseCount++;

			}
		}
		return uppercaseCount;
	}

	public static boolean isvalidPassword(String password) {
		boolean isvalid = true;
		int length = password.length();
		int upperCasecount = uppercaseCount(password);
		int sum = sumOfDigits(password);
		isPalindrome(password.substring(1, password.length() - 1));
		int firstletter = Integer.parseInt(password.substring(0, 1));
		int lastletter = Integer.parseInt(password.substring(length - 1, length));
		if (length == 8) {

			if (firstletter == upperCasecount && isPalindrome(password.substring(1, password.length() - 1)) == true && lastletter == sum) {
				isvalid = true;
			}else {
				isvalid=false;
			}
		} else {
			isvalid = false;
		}
		return isvalid;
	}
}
