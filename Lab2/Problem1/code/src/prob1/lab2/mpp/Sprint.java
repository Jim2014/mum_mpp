package prob1.lab2.mpp;

import java.time.LocalDate;
import java.util.List;

public class Sprint {
	private List<Feature> sprintFeatures;
	private Release associatedRelease;
	public Release getAssociatedRelease() {
		return associatedRelease;
	}

	public void setAssociatedRelease(Release associatedRelease) {
		this.associatedRelease = associatedRelease;
	}
	private LocalDate dueDate;
	
	public Sprint() {
	}
	
	public LocalDate getDueDate() {
		return dueDate;
	}
	public void setDueDate(LocalDate dueDate) {
		this.dueDate = dueDate;
	}
	
	
	public List<Feature> getSprintFeatures() {
		return sprintFeatures;
	}
	public void setSprintFeatures(List<Feature> sprintFeatures) {
		this.sprintFeatures = sprintFeatures;
	}

	
	
}
