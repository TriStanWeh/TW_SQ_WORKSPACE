package uebung1;

public class Employee implements Employment {
	
	double salary;

	@Override
	public void setSalary(double sal) {
		salary = sal;
		
	}

	@Override
	public double getSalary() {
		
		return salary;
	}

}
