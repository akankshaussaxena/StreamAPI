package FunctionalInterfaceExamples;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Predicate;

import FunctionalInterfaceExamples.Data.Student;
import FunctionalInterfaceExamples.Data.StudentDataBase;

public class BiFunctionalInterfaceExample {
	static BiFunction<List<Student>, Predicate<Student>, Map<String, Double>> biFunction = (students, cond) -> {
		Map<String, Double> studentGpaMap = new HashMap<>();
		students.forEach(s -> {
			if (cond.test(s)) {
				studentGpaMap.put(s.getName(), s.getGpa());
			}
		});
		return studentGpaMap;
	};

	public static void main(String[] args) {
		System.out.println(
				"BiFunction:" + biFunction.apply(StudentDataBase.getAllStudents(), PredicateStudentExample.s2));

	}

}
