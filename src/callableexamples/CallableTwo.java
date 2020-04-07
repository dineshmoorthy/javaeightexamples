package callableexamples;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class CallableTwo {

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

		// Integer result = future.get();
		Integer result;
		try {
			// below is the maximum wait time of 1 seconds. but in above code sleep is 10ms.
			// so we get timeoutException
			result = future.get(1, TimeUnit.SECONDS);
			System.out.print("result: " + result);
		} catch (TimeoutException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			
			executor.shutdown();
		}
		// System.out.println("future done 2 ? " + future.isDone());
	}
}
