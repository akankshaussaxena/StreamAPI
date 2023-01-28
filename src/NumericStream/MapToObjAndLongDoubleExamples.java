package NumericStream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import FunctionalInterfaceExamples.Data.Student;

public class MapToObjAndLongDoubleExamples {

	public static long mapToLong() {
		return IntStream.rangeClosed(1, 20)// intStream
				.mapToLong(i -> i)// LongStream
				.sum();// long
	}

	public static double mapToDouble() {
		return IntStream.rangeClosed(1, 20)// intStream
				.mapToDouble(i -> i)// DoubleStream
				.sum();// double
	}

	public static List<Student> mapToObjStudentNoteBooks() {
		return IntStream.rangeClosed(1, 20)// intStream
				.mapToObj(i -> {
					return new Student(i);// Integer
				}).collect(Collectors.toList());// DoubleStream
		// double
	}

	public static void main(String[] args) {
		System.out.println("mapToLong: " + mapToLong());
		System.out.println("mapToDouble: " + mapToDouble());
		System.out.println("mapToObjStudentNoteBooks: " + mapToObjStudentNoteBooks());
	}

}
