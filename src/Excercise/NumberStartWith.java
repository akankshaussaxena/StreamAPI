package Excercise;

import java.util.List;

public class NumberStartWith {

	public static void main(String[] args) {
		List<Integer> list = List.of(2, 222, 34, 564, 34, 354);
		list.stream().map(String::valueOf).filter(e -> e.startsWith("3")).forEach(System.out::println);
	}

}
