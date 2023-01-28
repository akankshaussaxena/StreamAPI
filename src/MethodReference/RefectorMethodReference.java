package MethodReference;

import java.util.function.Predicate;

import FunctionalInterfaceExamples.Data.Student;
import FunctionalInterfaceExamples.Data.StudentDataBase;

public class RefectorMethodReference {

	static Predicate<Student> p = s -> s.getGradeLevel() >= 3;
	static Predicate<Student> p1=RefectorMethodReference:: greatorThan3;

	// refector method
	public static boolean greatorThan3(Student s) {
		return s.getGradeLevel() >= 3;

	}

	public static void main(String[] args) {
		System.out.println(p.test(StudentDataBase.getAllStudents().get(0)));
		System.out.println(p1.test(StudentDataBase.getAllStudents().get(0)));
	}

}
