package Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamMaxUsingReduce {
	public static int getMaxValue(List<Integer> integers) {
		return integers.stream().reduce(0,(a,b)->a>b?a:b);

	}
	
	public static Optional<Integer> getMaxValueWithOptional(List<Integer> integers) {
		return integers.stream().reduce((a,b)->a>b?a:b);

	}

	public static void main(String[] args) {
		List<Integer> integers = Arrays.asList(1, 2, 4, 56, 43);
		List<Integer> integers1 = new ArrayList<>();
		System.out.println(getMaxValue(integers));
		System.out.println(getMaxValue(integers1));
		
		System.out.println(getMaxValueWithOptional(integers));
		System.out.println(getMaxValueWithOptional(integers).get());
		System.out.println(getMaxValueWithOptional(integers1));
		

	}

}
