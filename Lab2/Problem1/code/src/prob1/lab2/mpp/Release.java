package prob1.lab2.mpp;
import java.util.*;
public class Release {
	private List<Sprint> sprintList = new ArrayList<>();

	public Release() {}
	
	public void addSprint(Sprint s) {
		sprintList.add(s);
	}
		public List<Sprint> getSprintList() {
		return sprintList;
	}
	public void setSprintList(List<Sprint> sprintList) {
		this.sprintList = sprintList;
	}
	
}
