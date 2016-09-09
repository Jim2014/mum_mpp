package lab4c.mpp;

import java.util.Date;

public class Order {
	private String orderNo;
	public String getOrderNo() {
		return orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}
	public Date getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}
	public double getOrderAmmount() {
		return orderAmmount;
	}
	public void setOrderAmmount(double orderAmmount) {
		this.orderAmmount = orderAmmount;
	}
	private Date orderDate;
	private double orderAmmount;
	

}
