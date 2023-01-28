package Optional;

import java.util.Optional;

import FunctionalInterfaceExamples.Data.Bike;
import FunctionalInterfaceExamples.Data.Student;
import FunctionalInterfaceExamples.Data.StudentDataBase;

public class OptionalFilterMapFlatMap {
	// filter
	public static void optionalFilter() {
		Optional<Student> optionalStudent=Optional.ofNullable(StudentDataBase.studentSupplier.get());
		optionalStudent.filter(s->s.getGradeLevel()>=2).ifPresent(s->System.out.println(s));
		
	}

	// map
	public static void optionalMap() {
		Optional<Student> optionalStudent=Optional.ofNullable(StudentDataBase.studentSupplier.get());
		optionalStudent.filter(s->s.getGpa()>3.5).map(Student::getName).ifPresent(s->System.out.println(s));
	}

	//flapMap
	public static void optionalFlatMapBike() {
		Optional<Student> optionalStudent=Optional.ofNullable(StudentDataBase.studentSupplier.get());
		optionalStudent.filter(s->s.getGpa()>3.5).//Optional<Optional<Bike>>
		flatMap(Student::getBike).//Optional<BIKE>
		map(Bike::getName).
		ifPresent(s->System.out.println(s));
	}

	public static void main(String[] args) {
		optionalFilter();
		optionalMap();
		optionalFlatMapBike();
		
	}

}
