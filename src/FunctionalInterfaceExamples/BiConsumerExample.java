package FunctionalInterfaceExamples;

import java.util.List;
import java.util.function.BiConsumer;

import FunctionalInterfaceExamples.Data.Student;
import FunctionalInterfaceExamples.Data.StudentDataBase;

public class BiConsumerExample {

	static List<Student> students = StudentDataBase.getAllStudents();

	public static void printNameAndActivities() {
		BiConsumer<String, List<String>> data = (name, act) -> System.out.println(name + ":" + act);
		students.forEach(student -> data.accept(student.getName(), student.getActivities()));
	}

	public static void main(String[] args) {
		BiConsumer<String, String> data = (a, b) -> System.out.println(a + " " + b);
		data.accept("Akanksha", "Saxena");

		BiConsumer<Integer, Integer> multiplier = (a, b) -> System.out.println("Multiplication is:" + a * b);
		multiplier.accept(1, 2);

		BiConsumer<Integer, Integer> devision = (a, b) -> System.out.println("devision is:" + a / b);
		devision.accept(20, 10);
		
		printNameAndActivities();
	}

}
