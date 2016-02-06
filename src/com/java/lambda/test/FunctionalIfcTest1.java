package com.java.lambda.test;

@FunctionalInterface
public interface FunctionalIfcTest1<T, V> {

	public Integer meth(T caller, V argument);

	@Override
	boolean equals(Object o);

	public static String meth1() {
		return "AAKASH";
	}
}