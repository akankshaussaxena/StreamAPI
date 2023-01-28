package Excercise;

import java.util.List;

public class NumberSquareAvg {

	public static void main(String[] args) {
		List<Integer> list = List.of(1, 2, 3);
		double d = list.stream().mapToInt(e -> e * e).average().getAsDouble();
		System.out.println(d);
	}

}
