package lab4c.mpp;

import java.util.Calendar;
import java.util.List;

public class Commissioned extends Emplyee {
	private double baseSalary;
	public double getBaseSalary() {
		return baseSalary;
	}
	public void setBaseSalary(double baseSalary) {
		this.baseSalary = baseSalary;
	}
	public double getCommission() {
		return commission;
	}
	public void setCommission(double commission) {
		this.commission = commission;
	}
	private double commission;
	private List<Order> orders;
	
	public List<Order> getOrders() {
		return orders;
	}
	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}
	
	@Override
	public double calcGrossPay(int month) {
		double sumOrderAmount=0.0;
		for(Order order : orders)
		{

			 Calendar cal = Calendar.getInstance();
			 cal.setTime(order.getOrderDate());
			 int orderMonth = cal.get(Calendar.MONTH);
			if(orderMonth==month)
				sumOrderAmount+=order.getOrderAmmount();
		}
		return sumOrderAmount*this.commission;
	}

}
