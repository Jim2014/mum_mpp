package lab4c.mpp;

public class Salaried extends Emplyee {
	private double salary;
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public double calcGrossPay(int month) {
		return salary;
	}

}
