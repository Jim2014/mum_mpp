package prob1.lab2.mpp;


import java.util.List;

public class Developer extends Employee{
	private String developerId;
	private List<Feature> assignedFeatures;
	

	public String getDeveloperId() {
		return developerId;
	}
	public void setDeveloperId(String developerId) {
		this.developerId = developerId;
	}
	public List<Feature> getAssignedFeatures() {
		return assignedFeatures;
	}
	public void setAssignedFeatures(List<Feature> assignedFeatures) {
		this.assignedFeatures = assignedFeatures;
	}
}
