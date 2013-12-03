package uebung1;

public class EmloyedStudent extends Student implements Employment{
	
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
