package Excercise;

import java.util.List;

public class SumOfNum {

	public static void main(String[] args) {
		List<Integer> list = List.of(1, 2, 45, 32, 67, 87, 54, 3456, 5);
		int sum = list.stream().reduce(0, Integer::sum);
		System.out.println(sum);
	}

}
