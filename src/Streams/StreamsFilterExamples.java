package Streams;

import java.util.stream.Collectors;

import FunctionalInterfaceExamples.Data.StudentDataBase;

public class StreamsFilterExamples {

	public static void main(String[] args) {
		StudentDataBase.getAllStudents().stream().filter(s -> s.getGender().equals("female"))
				.filter(s -> s.getGpa() >= 3.9).collect(Collectors.toList()).forEach(System.out::println);
	}

}
