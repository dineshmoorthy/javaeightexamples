package pojoclass;
public class Employee
{
	int empid;

	float salary;

	String name;

	public Employee(int empid,float salary,String name)
	{
		this.empid = empid;
		
		this.salary = salary;
		
		this.name = name;
	
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void display()
	{
		System.out.println("output from display method");
	}	
}