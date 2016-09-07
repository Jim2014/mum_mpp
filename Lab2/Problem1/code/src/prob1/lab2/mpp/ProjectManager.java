package prob1.lab2.mpp;

public class ProjectManager extends Employee {
	void setProductLog(ProductBackLog backLog)
	{
		
	}
	void assignFutures(Feature feature,Developer dev)
	{
		feature.setAssociatedDeveloper(dev);
	}
}
