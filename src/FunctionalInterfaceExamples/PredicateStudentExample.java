package FunctionalInterfaceExamples;

import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Predicate;

import FunctionalInterfaceExamples.Data.Student;
import FunctionalInterfaceExamples.Data.StudentDataBase;

public class PredicateStudentExample {

	static List<Student> student = StudentDataBase.getAllStudents();
	static Predicate<Student> s = (student) -> student.getGradeLevel() >= 3;
	static Predicate<Student> s2 = (student) -> student.getGpa() >= 3.9;
	static BiPredicate<Integer,Double> p=(grade,gpa)->grade>=3&&gpa>=3.9;
	
	public static void filterStudent() {
		System.out.println("filterStudent BiPredicate ");
		Consumer<Student> c = s -> System.out.println(s);
		student.forEach(st -> {
			if (p.test(st.getGradeLevel(),st.getGpa())) {
				c.accept(st);
			}

		});
	}
	

	public static void filterStudentByGrade() {
		System.out.println("filterStudentByGrade");
		Consumer<Student> c = s -> System.out.println(s);
		student.forEach(st -> {
			if (s.test(st)) {
				c.accept(st);
			}

		});
	}
	
	public static void filterStudentByGPA() {
		System.out.println("filterStudentByGPA");
		Consumer<Student> c = s -> System.out.println(s);
		student.forEach(st -> {
			if (s.and(s2).test(st)) {
				c.accept(st);
			}

		});
	}

	public static void main(String[] args) {
		filterStudentByGrade();
		filterStudentByGPA();
		filterStudent();
	}

}
