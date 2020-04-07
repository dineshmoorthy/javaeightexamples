package executortry;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorEleven {

	   public static void main(String[] args)
	         throws InterruptedException, ExecutionException {

	      ExecutorService service = Executors.newFixedThreadPool(3);
	      Future<Double> f1 = service.submit(new
	         AreaOfACircle(12.5));
	      Future<Integer> f2 = service.submit(new
	         FactorialTask(7));
	      Future<Double> f3 = service.submit(new
	         CircumOfACircle(12.5));
	      System.out.println("Area of Circle (radius 12.5) = " +
	         f1.get());
	      System.out.println("Factorial of 7 = " + f2.get());
	      System.out.println("Circumference (radius 12.5) = " +
	         f3.get());
	      service.shutdown();
	   }
	}

	class AreaOfACircle implements Callable<Double> {
	   double rad = 0.0;

	   public AreaOfACircle(double d) {
	      rad = d;
	   }

	   @Override
	   public Double call() throws Exception {
	      return Math.PI * rad * rad;
	   }

	}

	class CircumOfACircle implements Callable<Double> {
	   double rad = 0.0;

	   public CircumOfACircle(double d) {
	      rad = d;
	   }

	   @Override
	   public Double call() throws Exception {
	      return 2 * Math.PI * rad;
	   }
	}

	class FactorialTask implements Callable<Integer> {
	   private int num = 0;

	   public FactorialTask(int num) {
	      this.num = num;
	   }

	   @Override
	   public Integer call() throws Exception {
	      int prod = 1;
	      if (num > 1) {
	         for (int i = 2; i <= num; i++)
	         prod *= i;
	      }
	      return prod;
	   }
	}