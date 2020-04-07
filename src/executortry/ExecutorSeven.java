package executortry;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.IntStream;

public class ExecutorSeven {

	int count = 0;

	void increment() {
	    count = count + 1;
	}

	
	public static void main(String[] args) {
		
		ExecutorService executor = Executors.newFixedThreadPool(2);

		
	}
}
