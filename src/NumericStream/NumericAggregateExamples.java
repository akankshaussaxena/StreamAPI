package NumericStream;

import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.OptionalLong;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class NumericAggregateExamples {

	public static void main(String[] args) {
		System.out.println(IntStream.rangeClosed(1, 50).sum());
		System.out.println(LongStream.rangeClosed(1, 50).sum());
		System.out.println(LongStream.rangeClosed(1, 50).asDoubleStream().sum());

		OptionalInt maxInt = IntStream.rangeClosed(1, 50).max();
		System.out.println(maxInt.isPresent() ? maxInt.getAsInt() : 0);
		OptionalLong maxLong = LongStream.rangeClosed(1, 50).max();
		System.out.println(maxLong.isPresent() ? maxLong.getAsLong() : 0);

		OptionalDouble maxDouble = LongStream.rangeClosed(1, 50).asDoubleStream().max();
		System.out.println(maxDouble.isPresent() ? maxDouble.getAsDouble() : 0);

		OptionalInt minInt = IntStream.rangeClosed(1, 50).max();
		System.out.println(minInt.isPresent() ? minInt.getAsInt() : 0);
		OptionalLong minLong = LongStream.rangeClosed(1, 50).max();
		System.out.println(minLong.isPresent() ? minLong.getAsLong() : 0);

		OptionalDouble minDouble = LongStream.rangeClosed(1, 50).asDoubleStream().max();
		System.out.println(minDouble.isPresent() ? minDouble.getAsDouble() : 0);

		OptionalDouble avg = IntStream.rangeClosed(1, 50).average();
		System.out.println(avg.isPresent() ? avg.getAsDouble() : 0);

	}

}
