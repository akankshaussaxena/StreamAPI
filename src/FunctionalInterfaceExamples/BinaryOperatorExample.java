package FunctionalInterfaceExamples;

import java.util.Comparator;
import java.util.function.BinaryOperator;

public class BinaryOperatorExample {

	static Comparator<Integer> comp = (a, b) -> a.compareTo(b);

	public static void main(String[] args) {
		BinaryOperator<Integer> bi = (a, b) -> a * b;
		BinaryOperator<Integer> minBy =BinaryOperator.minBy(comp);
		BinaryOperator<Integer> maxBy =BinaryOperator.maxBy(comp);
		System.out.println("BinaryOperator: " + bi.apply(2, 3));
		System.out.println("BinaryOperator minBy: " + minBy.apply(1, 2));
		System.out.println("BinaryOperator maxBy: " + maxBy.apply(1, 2));
		
	}

}
