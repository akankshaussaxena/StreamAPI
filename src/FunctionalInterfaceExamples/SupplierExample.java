package FunctionalInterfaceExamples;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

import FunctionalInterfaceExamples.Data.Student;
import FunctionalInterfaceExamples.Data.StudentDataBase;

public class SupplierExample {

	public static void main(String[] args) {
		Supplier<Student> student = () -> new Student("Adam", 2, 3.6, "male",
				Arrays.asList("swimming", "basketball", "volleyball"));
		Supplier<List<Student>> listStudent = () -> StudentDataBase.getAllStudents();
		System.out.println("Supplier:" + student.get());
		System.out.println("Supplier list:" + listStudent.get());

	}

}
