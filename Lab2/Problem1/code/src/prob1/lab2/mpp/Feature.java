package prob1.lab2.mpp;

import java.util.Date;

public class Feature {
	private Date estimateTime;
	public Date getEstimateTime() {
		return estimateTime;
	}
	public void setEstimateTime(Date estimateTime) {
		this.estimateTime = estimateTime;
	}
	public Date getActualTime() {
		return actualTime;
	}
	public void setActualTime(Date actualTime) {
		this.actualTime = actualTime;
	}
	private Date actualTime;
	private Sprint owningSprint;
	private Developer associatedDeveloper;
	public Feature(Sprint s) {
		this.owningSprint = s;
	}
	public Sprint getOwningSprint() {
		return owningSprint;
	}
	public void setOwningSprint(Sprint owningSprint) {
		this.owningSprint = owningSprint;
	}
	public Developer getAssociatedDeveloper() {
		return associatedDeveloper;
	}
	public void setAssociatedDeveloper(Developer associatedDeveloper) {
		this.associatedDeveloper = associatedDeveloper;
	}
}
