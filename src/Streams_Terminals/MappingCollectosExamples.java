package Streams_Terminals;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import FunctionalInterfaceExamples.Data.Student;
import FunctionalInterfaceExamples.Data.StudentDataBase;

public class MappingCollectosExamples {

	public static List<String> getStudentListMapping() {
		return StudentDataBase.getAllStudents().stream()
				.collect(Collectors.mapping(Student::getName, Collectors.toList()));
	}
	
	public static Set<String> getStudentSetMapping() {
		return StudentDataBase.getAllStudents().stream()
				.collect(Collectors.mapping(Student::getName, Collectors.toSet()));
	}

	public static void main(String[] args) {
		System.out.println("Mapping list is :" + getStudentListMapping());
		System.out.println("Mapping set is :" + getStudentSetMapping());
	}

}
