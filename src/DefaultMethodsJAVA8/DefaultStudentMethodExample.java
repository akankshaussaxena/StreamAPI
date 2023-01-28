package DefaultMethodsJAVA8;

import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

import FunctionalInterfaceExamples.Data.Student;
import FunctionalInterfaceExamples.Data.StudentDataBase;

public class DefaultStudentMethodExample {

	static Consumer<Student> studentList = student -> System.out.println(student);
	static Comparator<Student> studentByName = Comparator.comparing(Student::getName);
	static Comparator<Student> studentByGrade = Comparator.comparing(Student::getGradeLevel);

	public static void sortByName(List<Student> students) {
		System.out.println("after sortByName: ");

		StudentDataBase.getAllStudents().sort(studentByName);
		StudentDataBase.getAllStudents().forEach(studentList);

	}

	public static void sortByGPA(List<Student> students) {
		System.out.println("after sortByGPA: ");
		Comparator<Student> studentByGPA = Comparator.comparing(Student::getGpa);
		StudentDataBase.getAllStudents().sort(studentByGPA);
		StudentDataBase.getAllStudents().forEach(studentList);

	}

	public static void comparatorChaining(List<Student> students) {
		System.out.println("after comparatorChaining: ");

		StudentDataBase.getAllStudents().sort(studentByName.thenComparing(studentByGrade));
		StudentDataBase.getAllStudents().forEach(studentList);

	}

	public static void nullchaining(List<Student> students) {
		System.out.println("after nullchaining: ");

		StudentDataBase.getAllStudents().sort(Comparator.nullsLast(studentByName));
		StudentDataBase.getAllStudents().forEach(studentList);

	}

	public static void main(String[] args) {
		System.out.println("before sorting: ");
		StudentDataBase.getAllStudents().forEach(studentList);
		nullchaining(StudentDataBase.getAllStudents());
		sortByName(StudentDataBase.getAllStudents());
		sortByGPA(StudentDataBase.getAllStudents());
		comparatorChaining(StudentDataBase.getAllStudents());
		
	}

}
