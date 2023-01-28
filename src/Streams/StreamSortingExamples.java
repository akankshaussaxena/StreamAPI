package Streams;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import FunctionalInterfaceExamples.Data.Student;
import FunctionalInterfaceExamples.Data.StudentDataBase;

public class StreamSortingExamples {
	public static List<Student> sortedByName() {
		return StudentDataBase.getAllStudents().stream().sorted(Comparator.comparing(Student::getName))
				.collect(Collectors.toList());
	}
	
	
	public static List<Student> sortedByGPA() {
		return StudentDataBase.getAllStudents().stream().sorted(Comparator.comparing(Student::getGpa))
				.collect(Collectors.toList());
	}
	
	public static List<Student> sortedByGPADesc() {
		return StudentDataBase.getAllStudents().stream().sorted(Comparator.comparing(Student::getGpa).reversed())
				.collect(Collectors.toList());
	}
	

	public static void main(String[] args) {
		System.out.println("sortedByName"+sortedByName());
		System.out.println("sortedByGPA"+sortedByGPA());
		System.out.println("sortedByGPADesc"+sortedByGPADesc());
	}

}
