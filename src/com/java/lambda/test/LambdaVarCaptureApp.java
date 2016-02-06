package com.java.lambda.test;

public class LambdaVarCaptureApp {

	public static void main(String[] args) {
		int var = 10;
		FunctionalIfcTest<Integer> lambdaVar = (n) -> {
			n = n + var;
			// ++var;
			return n;
		};
		// var=30;
		System.out.println(lambdaVar.reverse(100));
	}
}