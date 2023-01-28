package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamsLimitSkipExamplesLimitAsShortCircuit {
	
	public static Optional<Integer> getLimit(List<Integer> integers) {
		return integers.stream()
		.limit(3)//1,3,4
		.reduce(Integer::sum);
		
	}
	
	public static Optional<Integer> getSkip(List<Integer> integers) {
		return integers.stream()
		.skip(3)//6,7,8
		.reduce(Integer::sum);
		
	}

	public static void main(String[] args) {
		List<Integer> integers = Arrays.asList(1, 3, 4, 6, 7, 8);
		Optional<Integer> limitNum=getLimit(integers);
		if(limitNum.isPresent()) {
			System.out.println("limit result is:"+limitNum.get());
		}else {
			System.out.println("empty list");
		}
		
		Optional<Integer> skipNum=getSkip(integers);
		if(limitNum.isPresent()) {
			System.out.println("skipNum result is:"+skipNum.get());
		}else {
			System.out.println("empty list");
		}

	}

}
