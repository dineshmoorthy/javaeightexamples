package executortry;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.IntStream;

public class ExecutorEight {

	static int count = 0;
	
	static synchronized void incrementSync() {
	    count = count + 1;
	}

	
	public static void main(String[] args) {
	
		ExecutorService executor = Executors.newFixedThreadPool(2);

		// IntStream.range(0, 10000)
		 //   .forEach(i -> executor.submit(count::incrementSync).get());

		//stop(executor);

		System.out.println(count); //10000 
	}
}
