package FunctionalInterfaceExamples;

import java.util.List;
import java.util.function.Consumer;

import FunctionalInterfaceExamples.Data.Student;
import FunctionalInterfaceExamples.Data.StudentDataBase;

public class ConsumerExample {
	static List<Student> student = StudentDataBase.getAllStudents();
	static Consumer<Student> name = s -> System.out.print(s.getName());
	static Consumer<Student> studentAct = s -> System.out.println(s.getActivities());
	static Consumer<Student> s = s -> System.out.println(s);

	public static void printStudentList() {

		student.forEach(s);
	}

	public static void studentNameAndActivities() {

		student.forEach(name.andThen(studentAct));// consumer chaining

	}

	public static void studentGradeGretorThan3() {
		System.out.println("studentGradeGretorThan3");
		student.forEach(student -> {
			if (student.getGradeLevel() >= 3)
				name.andThen(studentAct).accept(student);
		});
	}

	public static void main(String args[]) {

		Consumer<String> c = s -> System.out.println(s.toLowerCase());
		c.accept("AKKU");
		printStudentList();
		studentNameAndActivities();
		studentGradeGretorThan3();
	}

}
