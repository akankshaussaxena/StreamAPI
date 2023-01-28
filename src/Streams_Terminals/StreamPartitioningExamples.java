package Streams_Terminals;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import FunctionalInterfaceExamples.Data.Student;
import FunctionalInterfaceExamples.Data.StudentDataBase;

public class StreamPartitioningExamples {
	
	public static void partitioning_1() {
		Map<Boolean,List<Student>> studentdata=StudentDataBase.getAllStudents().stream().collect(Collectors.partitioningBy(p->p.getGpa()>=3.8));
		
		System.out.println(studentdata);
	}
	
	public static void partitioning_2() {
		Map<Boolean,Set<Student>> studentdata=StudentDataBase.getAllStudents().stream().collect(Collectors.partitioningBy(p->p.getGpa()>=3.8,Collectors.toSet()));
		
		System.out.println(studentdata);
	}

	public static void main(String[] args) {
		partitioning_1();
		partitioning_2();
	}

}
