package lab4c.mpp;

public class Paycheck {
	private double grossPay;
	private double fica;
	private double state;
	private double local;
	private double medicare;
	private double socialSecurity;
	
	public Paycheck(double grossPay
			,double fica
			,double state
			,double local
			,double medicare,
			double socialSecurity) {
		this.fica=fica;
		this.grossPay=grossPay;
		this.local=local;
		this.medicare=medicare;
		this.socialSecurity=socialSecurity;
		this.state=state;
	}
	
	public double getGrossPay() {
		return grossPay;
	}

	public double getFica() {
		return fica;
	}

	public double getState() {
		return state;
	}

	public double getLocal() {
		return local;
	}

	public double getMedicare() {
		return medicare;
	}

	public double getSocialSecurity() {
		return socialSecurity;
	}

	public void print(){
		
	}
	public double getNetpay(){
		return this.grossPay*(1-socialSecurity-state-local-medicare-fica);
	}
	
}
