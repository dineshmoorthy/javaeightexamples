package streamexamples;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;

import pojoclass.Employee;

public class InsideStreamExample {

	public static void main(String[] args) {
		
		Employee emp1 = new Employee(123,1000.500f,"gates");
		Employee emp2 = new Employee(145,5000.500f,"cotes");
		Employee emp3 = new Employee(1545,4000.500f,"godse");
		Employee emp4 = new Employee(156,6000.500f,"cofounder");
		Employee emp5 = new Employee(178,7000.500f,"bill");
		Employee emp6 = new Employee(100,10300.500f,"cofounder");
		
		ArrayList<Employee> employeelist = new ArrayList<Employee>();
		employeelist.add(emp1);
		employeelist.add(emp2);
		employeelist.add(emp3);
		employeelist.add(emp4);
		employeelist.add(emp5);
		employeelist.add(emp6);
		
		
		// new way 2
		
		Stream<Employee> streamone = employeelist.stream();
		
		Stream<Employee> streamtwo = streamone.filter(e -> e.getName().equalsIgnoreCase("cofounder"));
		
		Stream<Employee> streamthree = streamtwo.filter(e -> e.getEmpid()==100);
		
		Stream<Employee> streamfour = streamthree.peek(e -> e.display());
		DoubleStream doublestream = streamfour.mapToDouble(e -> e.getSalary());
		double salary = doublestream.sum();
		System.out.println("inside happening : "+ salary);
		
							
	}
}
