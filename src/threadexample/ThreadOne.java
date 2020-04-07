package threadexample;

public class ThreadOne {

	public static void main(String[] args) {
		
		Runnable task = () -> {
		    String threadName = Thread.currentThread().getName();
		    System.out.println("Hello " + threadName);
		};

		// comment or uncomment below line to see the difference in output
		//	task.run();

		Thread thread = new Thread(task);
		thread.start();

		System.out.println("Done!");
	}
}
