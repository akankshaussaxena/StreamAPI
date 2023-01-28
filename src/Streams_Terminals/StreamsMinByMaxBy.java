package Streams_Terminals;

import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Collectors;

import FunctionalInterfaceExamples.Data.Student;
import FunctionalInterfaceExamples.Data.StudentDataBase;

public class StreamsMinByMaxBy {
	
	public static Optional<Student> minBy_student() {
		
		return StudentDataBase.getAllStudents().stream().collect(Collectors.minBy(Comparator.comparing(Student::getGpa)));
		
	}
	
	public static Optional<Student> maxBy_student() {
		
		return StudentDataBase.getAllStudents().stream().collect(Collectors.maxBy(Comparator.comparing(Student::getGpa)));
		
	}

	public static void main(String[] args) {
		System.out.println("minBy_student : "+minBy_student());
		System.out.println("maxBy_student : "+maxBy_student());

	}

}
