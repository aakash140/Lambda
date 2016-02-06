package com.java.lambda.test;

public class LambdaTestApp {

	public static String reverseString(FunctionalIfcTest<String> funcTestString, String inputString) {
		return funcTestString.reverse(inputString);
	}

	public static int reverseNumber(FunctionalIfcTest<Integer> funcTestInteger, int inputNumber) {
		return funcTestInteger.reverse(inputNumber);
	}

	public static void main(String[] args) {
		String inputString = "NITIN";
		int inputNumber = 1234;
		String reversed = reverseString((name) -> {
			String reverse = "";
			for (int i = name.length() - 1; i >= 0; i--) {
				reverse = reverse + name.charAt(i);
			}
			return reverse;
		} , inputString);

		FunctionalIfcTest<Integer> funcTestInt = (number) -> {
			Integer reverse = 0;
			while (number > 0) {
				reverse = reverse * 10 + number % 10;
				number = number / 10;
			}
			return reverse;
		};

		System.out.println("Reversed " + inputString + " is: " + reversed);
		System.out.println("Reversed " + inputNumber + " is: " + reverseNumber(funcTestInt, inputNumber));
	}
}
