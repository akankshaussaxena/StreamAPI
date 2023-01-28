package Streams_Terminals;

import java.util.Comparator;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import FunctionalInterfaceExamples.Data.Student;
import FunctionalInterfaceExamples.Data.StudentDataBase;

public class GroupingMaxAndMinByExamples {
	
	public static void maxstudentGPAByTheirGradeLevel() {
		Map<Integer,Optional<Student>> studentOptional=StudentDataBase.getAllStudents().stream()
		.collect(Collectors.groupingBy(Student::getGradeLevel,Collectors.maxBy(Comparator.comparing(Student::getGpa))));
	System.out.println(studentOptional);
	
	
	Map<Integer,Student> studentOptional1=StudentDataBase.getAllStudents().stream()
			.collect(Collectors.groupingBy(Student::getGradeLevel,Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparing(Student::getGpa)),Optional::get)));
		System.out.println(studentOptional1);
	
	}
	
	public static void minstudentGPAByTheirGradeLevel() {
		Map<Integer,Optional<Student>> studentOptional=StudentDataBase.getAllStudents().stream()
		.collect(Collectors.groupingBy(Student::getGradeLevel,Collectors.minBy(Comparator.comparing(Student::getGpa))));
	System.out.println(studentOptional);
	
	
	Map<Integer,Student> studentOptional1=StudentDataBase.getAllStudents().stream()
			.collect(Collectors.groupingBy(Student::getGradeLevel,Collectors.collectingAndThen(Collectors.minBy(Comparator.comparing(Student::getGpa)),Optional::get)));
		System.out.println(studentOptional1);
	
	}

	public static void main(String[] args) {
		maxstudentGPAByTheirGradeLevel();
		minstudentGPAByTheirGradeLevel();
	}

}
