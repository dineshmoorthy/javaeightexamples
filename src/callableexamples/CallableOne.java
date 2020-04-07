package callableexamples;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class CallableOne {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		Callable<Integer> task = () -> {
		    try {
		    	// change the below seconds to see the changes in output
		        TimeUnit.SECONDS.sleep(10);
		        return 123;
		    }
		    catch (InterruptedException e) {
		        throw new IllegalStateException("task interrupted", e);
		    }
		};
		
		ExecutorService executor = Executors.newFixedThreadPool(1);
		Future<Integer> future = executor.submit(task);

		System.out.println("future done 1 ? " + future.isDone());

		Integer result = future.get();

		// System.out.println("future done 2 ? " + future.isDone());
		System.out.print("result: " + result);
	}
}
