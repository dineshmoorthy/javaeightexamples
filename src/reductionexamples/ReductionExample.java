package reductionexamples;

import java.util.ArrayList;
import java.util.stream.IntStream;

import pojoclass.Employee;

public class ReductionExample {

	public static void main(String[] args) {

		// 0+1+2+3+4+5 = 15
		
		int result = IntStream.rangeClosed(1, 5)
				.reduce(0, (sum,element) -> sum+element);
		
		
		System.out.println("new Founder salary : "+ result);
							
	}
}
