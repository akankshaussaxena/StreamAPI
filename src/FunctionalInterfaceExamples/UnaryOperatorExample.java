package FunctionalInterfaceExamples;

import java.util.function.UnaryOperator;

public class UnaryOperatorExample {

	public static void main(String[] args) {
		UnaryOperator<String> uOperator = s -> s.concat("Akku"); //if in and out is same type in function than we can use unary
		
		System.out.println(uOperator.apply("Akanksha"));
	}

}
