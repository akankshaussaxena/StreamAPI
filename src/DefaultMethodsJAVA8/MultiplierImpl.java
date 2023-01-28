package DefaultMethodsJAVA8;

import java.util.List;

public class MultiplierImpl implements Multiplier {

	@Override
	public int multiply(List<Integer> studentList) {
		return studentList.stream().reduce((a,b)->a*b).get();
	}

	@Override
	public boolean size(List<Integer> studentList) {
		System.out.println("Inside MultiplierImpl class ");
		return studentList!=null && studentList.size()>0;
	}
}
