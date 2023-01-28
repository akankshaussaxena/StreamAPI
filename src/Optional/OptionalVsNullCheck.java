package Optional;

import java.util.Arrays;
import java.util.Optional;
import java.util.function.Supplier;

import FunctionalInterfaceExamples.Data.Student;

public class OptionalVsNullCheck {

	public static Supplier<Student> studentData = () -> {
		return new Student("Jenny", 2, 3.8, "female", Arrays.asList("swimming", "gymnastics", "soccer"), 11);
	};

	public static String getStudentName() {
		Student student = studentData.get();
		//Student student = null;
		if (student != null) {
			return student.getName();
		}

		return null;
	}
	
	public static Optional<String> getStudentNameOptional() {
		//Student student = studentData.get();
		//Optional<Student> student = Optional.ofNullable(studentData.get());
		Optional<Student> student = Optional.empty();
		if (student.isPresent()) {
			return student.map(Student::getName);
		}

		return Optional.empty();
	}

	public static void main(String[] args) {
		System.out.println("student name length : "+getStudentName().length());
	
		Optional<String> name = getStudentNameOptional();
		if(name.isPresent())
		System.out.println("student name length by optional: "+name.get().length());
		else
			System.out.println("student name not found");
	}

}
