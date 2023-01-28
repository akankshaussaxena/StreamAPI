package NumericStream;

import java.util.List;
import java.util.function.ToIntFunction;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class BoxingAndUnBoxingExamples {
	
	static ToIntFunction<Integer> fn=Integer::intValue;

	public static List<Integer> Boxing(){
		return IntStream.rangeClosed(1, 20).//Strean of int
		boxed()//Stream of Integer
		.collect(Collectors.toList());//List of Integer
	}
	
	public static int UnBoxing(List<Integer> integers) {
		return integers.stream().//stream of Integer wrapper
		mapToInt(fn).//stream of int 
		sum();
	}
	public static void main(String[] args) {
System.out.println("Boxing is: "+Boxing());
System.out.println("UnBoxing is: "+UnBoxing(Boxing()));
	}

}
