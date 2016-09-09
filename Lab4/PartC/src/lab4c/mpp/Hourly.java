package lab4c.mpp;

public class Hourly extends Emplyee {
	private double hourlyWage;
	public double getHourlyWage() {
		return hourlyWage;
	}
	public void setHourlyWage(double hourlyWage) {
		this.hourlyWage = hourlyWage;
	}
	public double getHoursPerWeek() {
		return hoursPerWeek;
	}
	public void setHoursPerWeek(double hoursPerWeek) {
		this.hoursPerWeek = hoursPerWeek;
	}
	private double hoursPerWeek;
	@Override
	public double calcGrossPay(int month) {		
		return hourlyWage*hoursPerWeek*4;
	}

}
