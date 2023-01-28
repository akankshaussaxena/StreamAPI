package MethodReference;

import java.util.function.Consumer;

import FunctionalInterfaceExamples.Data.Student;
import FunctionalInterfaceExamples.Data.StudentDataBase;

public class ConsumerMethodReference {

	public static void main(String[] args) {
		Consumer<Student> c = s -> System.out.println(s);
		Consumer<Student> c1 = System.out::println;
		Consumer<Student> c2 = Student::printActivities;
		StudentDataBase.getAllStudents().forEach(c);
		StudentDataBase.getAllStudents().forEach(c1);
		StudentDataBase.getAllStudents().forEach(c2);

	}

}
