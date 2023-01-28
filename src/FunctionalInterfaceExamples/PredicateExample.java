package FunctionalInterfaceExamples;

import java.util.function.Predicate;

public class PredicateExample {
	static Predicate<Integer> test = t -> t % 2 == 0;
	static Predicate<Integer> test1 = t -> t % 5 == 0;
	static void printOr() {
		System.out.println("Predicate or :"+test.or(test1).test(15));
	}
	static void printAnd() {
		System.out.println("Predicate And :"+test.and(test1).test(10));
	}
	
	static void printNegate() {
		System.out.println("Predicate Negate :"+test.or(test1).negate().test(15));
	}
	public static void main(String[] args) {
		
		System.out.println("Even num:"+test.test(3));
		printOr();
		printAnd();
		printNegate();
		
	}

}
