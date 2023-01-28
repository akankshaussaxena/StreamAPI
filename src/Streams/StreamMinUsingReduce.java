package Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamMinUsingReduce {
	public static int getMinValue(List<Integer> integers) {
		return integers.stream().reduce(0,(a,b)->a<b?a:b);

	}
	
	public static Optional<Integer> getMinValueWithOptional(List<Integer> integers) {
		return integers.stream().
				//1->Y
				//2->Y
				//4->Y
				//56->Y
				//43->Y
				//result will be getting stored in X
				
				reduce((a,b)->a<b?a:b);

	}

	public static void main(String[] args) {
		List<Integer> integers = Arrays.asList(1, 2, 4, 56, 43);
		List<Integer> integers1 = new ArrayList<>();
		//never ever use reduce with identity for min as it will show default value than
		//System.out.println(getMinValue(integers));
		//System.out.println(getMinValue(integers1));
		
		System.out.println(getMinValueWithOptional(integers));
		System.out.println(getMinValueWithOptional(integers).get());
		System.out.println(getMinValueWithOptional(integers1));
		

	}

}
