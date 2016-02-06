package com.java.lambda.test;

public class NumericClass<T> {

	private T value;

	public NumericClass(T value) {
		this.value = value;
	}

	public T getValue() {
		return value;
	}
}
