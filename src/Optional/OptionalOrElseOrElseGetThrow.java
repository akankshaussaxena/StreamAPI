package Optional;

import java.util.Optional;

import FunctionalInterfaceExamples.Data.Student;
import FunctionalInterfaceExamples.Data.StudentDataBase;

public class OptionalOrElseOrElseGetThrow {

	// orElse
	public static String OptionalOrElse() {
		Optional<Student> student = Optional.ofNullable(StudentDataBase.studentSupplier.get());

		String name = student.map(Student::getName).orElse("default");// this will take actual object
		return name;
	}

	// orElseGet
	public static String OptionalOrElseGet() {
		Optional<Student> student = Optional.ofNullable(StudentDataBase.studentSupplier.get());

		String name = student.map(Student::getName).orElseGet(() -> "default"); // this will take supplier
		return name;
	}

	// orElseThrow
	public static String OptionalOrElseThrow() {
		//Optional<Student> student = Optional.ofNullable(StudentDataBase.studentSupplier.get());
		Optional<Student> student = Optional.ofNullable(null);//Optional.emtpy

		String name = student.map(Student::getName).orElseThrow(() -> new RuntimeException("no data found!!")); // this
																												// will
																												// return
																												// excpetion
		return name;
	}

	public static void main(String[] args) {
		System.out.println("OptionalOrElse: " + OptionalOrElse());
		System.out.println("OptionalOrElseGet: " + OptionalOrElseGet());
		System.out.println("OptionalOrElseThrow: " + OptionalOrElseThrow());
	}

}
