package com.java.lambda.test;

public class Shifter {

	public int num;

	public Integer shift(String shiftType) {
		Integer shifted = 0;
		if (shiftType.equals("+"))
			shifted = this.num >> 1;
		else if (shiftType.equals("-"))
			shifted = this.num << 1;
		return shifted;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}
}