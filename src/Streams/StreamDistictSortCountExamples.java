package Streams;

import java.util.List;
import java.util.stream.Collectors;

import FunctionalInterfaceExamples.Data.Student;
import FunctionalInterfaceExamples.Data.StudentDataBase;

public class StreamDistictSortCountExamples {
	
	public static List<String> printAllStudentActivities(){
		return StudentDataBase.getAllStudents().stream()//stream<Student>
		.map(Student::getActivities)//stream<List<String>> stateless
		.flatMap(List::stream)//stream<String> stateless
		.distinct()//stream<String> with unique activities stateful
		.collect(Collectors.toList());//stateful
	}

	public static long coutOfStudentActivities(){
		return StudentDataBase.getAllStudents().stream()//stream<Student>
		.map(Student::getActivities)//stream<List<String>>
		.flatMap(List::stream)//stream<String>
		.distinct().
		count();
	}
	public static List<String> sortedStudentActivitiesparllel(){
		long startTime=System.currentTimeMillis();
		List<String> stuentAct= StudentDataBase.getAllStudents().stream()
				.parallel()//stream<Student>
		.map(Student::getActivities)//stream<List<String>>
		.flatMap(List::stream)//stream<String>
		.distinct()//stream<String>
		.sorted()//stream<String>
		.collect(Collectors.toList());
		long endTime=System.currentTimeMillis();
		System.out.println("paralle time: "+(endTime-startTime));
		 
		 return stuentAct;
	
	}
	
	public static List<String> sortedStudentActivitiesSequntial(){
		long startTime=System.currentTimeMillis();
		List<String> stuentAct= StudentDataBase.getAllStudents().stream()//stream<Student>
		.map(Student::getActivities)//stream<List<String>>
		.flatMap(List::stream)//stream<String>
		.distinct()//stream<String>
		.sorted()//stream<String>
		.collect(Collectors.toList());
		
		long endTime=System.currentTimeMillis();
		System.out.println("Seq time: "+(endTime-startTime));
		
		 return stuentAct;
	
	}
	public static void main(String[] args) {
		System.out.println("printAllStudentActivities: "+printAllStudentActivities());
		System.out.println("coutOfStudentActivities: "+coutOfStudentActivities());
		System.out.println("sortedStudentActivities: "+sortedStudentActivitiesparllel());
		System.out.println("sortedStudentActivities: "+sortedStudentActivitiesSequntial());
		
	}

}
