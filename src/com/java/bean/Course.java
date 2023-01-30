package com.java.bean;

public class Course {
	//course attributes
	private String courseName;
	private String courseFee;
	private String courseDepartment;
	private String courseType;
	private String courseMethodology;
	private String courseVersion;
	

	//setter and getter method
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public String getCourseFee() {
		return courseFee;
	}
	public void setCourseFee(String courseFee) {
		this.courseFee = courseFee;
	}
	public String getCourseDepartment() {
		return courseDepartment;
	}
	public void setCourseDepartment(String courseDepartment) {
		this.courseDepartment = courseDepartment;
	}
	public String getCourseType() {
		return courseType;
	}
	public void setCourseType(String courseType) {
		this.courseType = courseType;
	}
	public String getCourseMethodology() {
		return courseMethodology;
	}
	public void setCourseMethodology(String courseMethodology) {
		this.courseMethodology = courseMethodology;
	}
	public String getCourseVersion() {
		return courseVersion;
	}
	public void setCourseVersion(String courseVersion) {
		this.courseVersion = courseVersion;
	}
	//toString()method
	
	@Override
	public String toString() {
		return "Course [courseName=" + courseName + ", courseFee=" + courseFee + ", courseDepartment="
				+ courseDepartment + ", courseType=" + courseType + ", courseMethodology=" + courseMethodology
				+ ", courseVersion=" + courseVersion + "]";
	}
	

}
