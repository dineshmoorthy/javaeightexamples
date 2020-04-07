package streamexamples;

import java.util.ArrayList;

import pojoclass.Employee;

public class StreamExampleTwo {

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
		
		// new way
		
		double newsalary = employeelist
							.stream()
							.filter(e -> e.getName().equalsIgnoreCase("cofounder"))
							.filter(e -> e.getEmpid()==100)
							.peek(e -> e.display())
							.mapToDouble(e -> e.getSalary())
							.findAny()
							.getAsDouble();
		
		double newsalary2 = employeelist
				.stream()
				.filter(e -> e.getName().equalsIgnoreCase("cofounder"))
				.filter(e -> e.getEmpid()==100)
				.peek(e -> e.display())
				.mapToDouble(e -> e.getSalary())
				.sequential()
				.findAny()
				.getAsDouble();
		
		double newsalary3 = employeelist
				.stream()
				.filter(e -> e.getName().equalsIgnoreCase("cofounder"))
				.filter(e -> e.getEmpid()==100)
				.peek(e -> e.display())
				.mapToDouble(e -> e.getSalary())
				.parallel()
				.findAny()
				.getAsDouble();
		
		// sequential find any and parallel findany differs in operation but result will be same
		System.out.println("new Founder salary : "+newsalary);
							
	}
}
