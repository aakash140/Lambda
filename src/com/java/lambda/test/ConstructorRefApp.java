package com.java.lambda.test;

public class ConstructorRefApp {

	public static <T, V> T getObject(FunctionalIfcTest2<T, V> funcRef, V value) {
		return funcRef.cons(value);
	}

	public static void main(String[] args) {
		FunctionalIfcTest2<NumericClass<Integer>, Integer> funcRef = NumericClass<Integer>::new;
		NumericClass<Integer> number = getObject(funcRef, 500);
		System.out.println(number.getValue());

		FunctionalIfcTest2<NumericClass<Double>, Double> funcRef1 = NumericClass<Double>::new;
		NumericClass<Double> number1 = getObject(funcRef1, 800.98);
		System.out.println(number1.getValue());

		FunctionalIfcTest2<StringClass, String> funcRefString = StringClass::new;
		StringClass text = getObject(funcRefString, "Hello World");
		System.out.println(text.getValue());

		FunctionalIfcTest3<NumericClass<Character>[]> funcRef2 = NumericClass[]::new;
		NumericClass<Character>[] character = funcRef2.cons(2);
		character[0] = new NumericClass<Character>('H');
		character[1] = new NumericClass<Character>('I');
		// character[2] = new NumericClass<Character>('A');
		for (NumericClass<Character> ch : character)
			System.out.print(ch.getValue());
	}
}