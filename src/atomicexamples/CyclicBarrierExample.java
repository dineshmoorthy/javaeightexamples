package atomicexamples;

import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public class CyclicBarrierExample {

	final CyclicBarrier barrier = new CyclicBarrier(2);
	AtomicInteger threadCount = new AtomicInteger(0);

	public static void main(String args[]){
	ExecutorService executor = Executors.newFixedThreadPool(4);
	CyclicBarrierExample ex = new CyclicBarrierExample();
	
	/*executor.submit(() -> {
		System.out.println("hellooooo");
	});*/
	executor.shutdown();

	}
}
