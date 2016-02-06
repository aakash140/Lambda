package com.java.lambda.test;

public class MethodRefTestApp<T> {

	public static String reverseString(String origString) {
		String reverse = "";
		for (int i = origString.length() - 1; i >= 0; i--)
			reverse = reverse + origString.charAt(i);
		return reverse;
	}

	public Integer reverseNumber(Integer origNum) {
		int reversedNum = 0;
		while (origNum > 0) {
			reversedNum = reversedNum * 10 + origNum % 10;
			origNum = origNum / 10;
		}
		return reversedNum;
	}

	public T reverse(FunctionalIfcTest<T> funcRef, T input) {
		return funcRef.reverse(input);
	}

	public static void main(String[] args) {
		MethodRefTestApp<Integer> methRef1 = new MethodRefTestApp<>();
		int outputNum = methRef1.reverse(methRef1::reverseNumber, 12345);
		MethodRefTestApp<String> methRef2 = new MethodRefTestApp<>();
		String outputString = methRef2.reverse(MethodRefTestApp::reverseString, "AAKASH");
		System.out.println("Output Integer: " + outputNum);
		System.out.println("Output String: " + outputString);
	}
}