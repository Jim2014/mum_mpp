package prob1.lab2.mpp;
import java.util.*;
public class Project {
	private String projectId;
	private ProductBackLog productBackLog;
	public ProductBackLog getProductBackLog() {
		return productBackLog;
	}

	public void setProductBackLog(ProductBackLog productBackLog) {
		this.productBackLog = productBackLog;
	}
	private List<Release> releaseList= new ArrayList<>();
	public Project() {}
	
	public void addRelease(Release r) {
		releaseList.add(r);
	}
	public String getProjectId() {
		return projectId;
	}
	public void setProjectId(String projectId) {
		this.projectId = projectId;
	}

	public List<Release> getReleaseList() {
		return releaseList;
	}
	public void setReleaseList(List<Release> releaseList) {
		this.releaseList = releaseList;
	}

}
