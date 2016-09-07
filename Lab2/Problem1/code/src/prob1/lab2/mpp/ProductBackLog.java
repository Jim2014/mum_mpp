package prob1.lab2.mpp;

import java.util.ArrayList;
import java.util.List;

public class ProductBackLog {
	private List<Feature> backlogFeatureList = new ArrayList<>();
	public List<Feature> getBacklogFeatureList() {
		return backlogFeatureList;
	}
	public void setBacklogFeatureList(List<Feature> backlogFeatureList) {
		this.backlogFeatureList = backlogFeatureList;
	}
	private Project project;
	public Project getProject() {
		return project;
	}
	public void setProject(Project project) {
		this.project = project;
	}
}
