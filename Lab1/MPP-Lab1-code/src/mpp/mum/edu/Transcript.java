package mpp.mum.edu;

import java.util.Map;

public class Transcript {
	private double gpa;
	private String degree;
	private Map<Course,String> registeredCourse;
	//methods
	public void calculateGPA(){};
	public void addCourse(Course course,String grade){
		registeredCourse.put(course, grade);
	}
	public void removeCourse(Course course){
		registeredCourse.remove(course);
	}
}
