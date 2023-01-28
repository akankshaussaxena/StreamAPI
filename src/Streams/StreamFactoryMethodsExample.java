package Streams;


import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class StreamFactoryMethodsExample {

	public static void main(String[] args) {
		Stream<String> streamString = Stream.of("Akku", "Basu", "Babu");
		streamString.forEach(System.out::println);
		
		Stream.iterate(1, a->a*2).limit(10).
		forEach(System.out::println);
		
		Supplier<Integer> supplierInt=new Random()::nextInt;
		Stream.generate(supplierInt).limit(3).forEach(System.out::println);

	}

}
