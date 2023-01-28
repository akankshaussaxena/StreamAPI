package NumericStream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class IntStreamExamples {
	public static int sumOfNum(List<Integer> integers) {
		return integers.stream().
				reduce(0, Integer::sum);//need to unboxing (Integer to int for sum)
	}
	
	public static int sumOfNumUsingIntStream() {
		return IntStream.rangeClosed(1, 6).sum();//.//no need to unboxing (Integer to int for sum)
	}

	public static void main(String[] args) {
	List<Integer> integers=Arrays.asList(1,2,3,4,5,6);
         System.out.println("Result using regular stream: "+sumOfNum(integers));
         System.out.println("Result using Numeric stream: "+sumOfNumUsingIntStream());
	}

}
