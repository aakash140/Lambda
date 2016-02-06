package com.java.lambda.test;

public class MethRefTest1App {

	public static <T, V> Integer reversedOutput(FunctionalIfcTest1<T, V> funcRef, T caller, V input) {
		return funcRef.meth(caller, input);
	}

	public static void main(String[] args) {
		Shifter flip = new Shifter();
		flip.setNum(1234);
		Integer shiftedVal = reversedOutput(Shifter::shift, flip, "-");
		System.out.println(shiftedVal);
	}
}