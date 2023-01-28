package MethodReference;

import java.util.function.Function;
import java.util.function.Supplier;

import FunctionalInterfaceExamples.Data.Student;

public class ConstructorReference {

	public static void main(String[] args) {
		Supplier<Student> studentSupplier = Student::new;

		Function<String,Student> student = Student::new;
		System.out.println(studentSupplier.get());
		System.out.println(student.apply("Akku"));
	}

}
