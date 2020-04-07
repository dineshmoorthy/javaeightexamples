package reductionexamples;

import java.util.ArrayList;
import java.util.stream.IntStream;

import pojoclass.Employee;

public class ParallelReductionExample {

	public static void main(String[] args) {

		// (0+3) +(2+4) +(1+5) = 15
		
		int result = IntStream.rangeClosed(1, 5)
				.parallel()
				.reduce(0, (sum,element) -> sum+element);
		
		
		
		System.out.println("new Founder salary : "+ result);
							
	}
}
