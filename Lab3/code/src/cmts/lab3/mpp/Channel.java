package cmts.lab3.mpp;

public class Channel {
	private CM assignedCM;
	public CM getAssignedCM() {
		return assignedCM;
	}
	public void setAssignedCM(CM assignedCM) {
		this.assignedCM = assignedCM;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public int getBandwidth() {
		return bandwidth;
	}
	public void setBandwidth(int bandwidth) {
		this.bandwidth = bandwidth;
	}
	private int status;
	private int bandwidth;
}
