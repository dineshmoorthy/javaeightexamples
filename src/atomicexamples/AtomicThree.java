package atomicexamples;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicThree {

	public static void main(String[] args) {
		AtomicInteger ai = new AtomicInteger();
		System.out.println("New Value 1: "+ai.incrementAndGet());
		System.out.println("New Value 2: "+ai.getAndIncrement());
		System.out.println("New Value 2: "+ai.get());
		
	}
}
