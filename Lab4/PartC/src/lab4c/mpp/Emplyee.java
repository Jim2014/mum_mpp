package lab4c.mpp;

public abstract class Emplyee {
	private String empId;

	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}
	
	public void print(){}
	public Paycheck calcCompensation(int month){
		return new Paycheck(calcGrossPay(month),0.23,0.05,0.01,0.03,0.075);
	}
	public abstract double calcGrossPay(int month);
}
