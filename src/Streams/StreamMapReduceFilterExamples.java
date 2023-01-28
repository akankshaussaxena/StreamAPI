package Streams;

import FunctionalInterfaceExamples.Data.Student;
import FunctionalInterfaceExamples.Data.StudentDataBase;

public class StreamMapReduceFilterExamples {
	
	public static int noOfNotebooks() {
		return StudentDataBase.getAllStudents().stream().filter(student->student.getGradeLevel()>=3)
				.filter(student->student.getGender().equalsIgnoreCase("female"))
				.map(Student::getNoteooks)
				.reduce(0,Integer::sum);
	}

	public static void main(String[] args) {
		System.out.println("noOfNotebooks: "+noOfNotebooks());

	}

}
