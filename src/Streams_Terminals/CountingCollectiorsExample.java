package Streams_Terminals;

import static java.util.stream.Collectors.counting;

import FunctionalInterfaceExamples.Data.StudentDataBase;

public class CountingCollectiorsExample {

	public static long getStudentCount() {
		return StudentDataBase.getAllStudents().stream().filter(s -> s.getGpa() >= 3.9).collect(counting());
	}

	public static void main(String[] args) {
		System.out.println("counting is: " + getStudentCount());
	}

}
