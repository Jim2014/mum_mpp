package Prob2C;

import java.util.List;

public class Section {
	private int sectionNum;
	public int getSectionNum() {
		return sectionNum;
	}
	public void setSectionNum(int sectionNum) {
		this.sectionNum = sectionNum;
	}
	public List<Student> getStudents() {
		return students;
	}
	public void setStudents(List<Student> students) {
		this.students = students;
	}
	private List<Student> students;
}
