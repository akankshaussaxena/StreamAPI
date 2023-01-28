package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import FunctionalInterfaceExamples.Data.Student;
import FunctionalInterfaceExamples.Data.StudentDataBase;

public class StreamReduceExamples {

	public static int getMultiplications(List<Integer> integers) {
		
		return integers.stream()
				.reduce(1, (a,b)->a*b);
		
	}
	
	
	
	@SuppressWarnings("unchecked")
	public static <T> Optional <T> getHighestStudentDetails(){
		return (Optional<T>) StudentDataBase.getAllStudents().stream().reduce((s1,s2)->s1.getGpa()>s2.getGpa()?s1:s2);
	}
	
public static Optional<Integer> getMultiplicationsWithoutIdentity(List<Integer> integers) {
		
		return integers.stream()
				.reduce((a,b)->a*b);
		
	}
	public static void main(String[] args) {
		List<Integer> integrs=Arrays.asList(1,3,4,7);
		System.out.println(getMultiplications(integrs));
		System.out.println(getMultiplicationsWithoutIdentity(integrs).get());
		Optional<Student> students=getHighestStudentDetails();
		if(students.isPresent()) {
			System.out.println(students.get());
		}
	}

}
