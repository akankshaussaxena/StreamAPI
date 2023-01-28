package Streams;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import FunctionalInterfaceExamples.Data.Student;
import FunctionalInterfaceExamples.Data.StudentDataBase;

public class StreamsExample {

	public static void main(String[] args) {
		
		Predicate<Student> studentgradep=s->s.getGradeLevel()>=3;
		Predicate<Student> studentgpap=s->s.getGpa()>=3.9;
		Function<? super Student, ? extends String> keyMapper = Student::getName;
		Function<? super Student, ? extends List<String>> valueMapper = Student::getActivities;
		Map<String, List<String>> studentMaping = StudentDataBase.getAllStudents().stream()
				.peek(s->System.out.println(s))
				.filter(studentgradep)
				.peek(s->System.out.println("after 1st filter "+s))
				.filter(studentgpap)
				.peek(s->System.out.println("after 2nd filter "+s))
				.collect(Collectors.toMap(keyMapper, valueMapper));

		System.out.println(studentMaping);
		//peek will use as debug the value in each stream stage
		//parallel stream
		
		Map<String, List<String>> studentMapingParllel = StudentDataBase.getAllStudents().parallelStream()
				.collect(Collectors.toMap(keyMapper, valueMapper));

		System.out.println(studentMapingParllel);
	}

}
