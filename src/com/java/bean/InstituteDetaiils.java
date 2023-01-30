package com.java.bean;



public class InstituteDetaiils {
	
	//Institute attributes
	private String instituteName;
	private String instituteAddress;
	private String instituteDepartment;
	private String instituteCourses;
	private int instituteMaleStrength;
	private int instituteFemaleStrength;
	private int instituteStaff;
	private String instituteMail;
	private String instituteMobile;
	//adding Address Object
	private Address address;
	//adding Course Object
	private Course course;
	//adding Branch Object

	public String getInstituteName() {
		return instituteName;
	}
	public void setInstituteName(String instituteName) {
		this.instituteName = instituteName;
	}
	public String getInstituteAddress() {
		return instituteAddress;
	}
	public void setInstituteAddress(String instituteAddress) {
		this.instituteAddress = instituteAddress;
	}
	public String getInstituteDepartment() {
		return instituteDepartment;
	}
	public void setInstituteDepartment(String instituteDepartment) {
		this.instituteDepartment = instituteDepartment;
	}
	public String getInstituteCourses() {
		return instituteCourses;
	}
	public void setInstituteCourses(String instituteCourses) {
		this.instituteCourses = instituteCourses;
	}
	public int getInstituteMaleStrength() {
		return instituteMaleStrength;
	}
	public void setInstituteMaleStrength(int instituteMaleStrength) {
		this.instituteMaleStrength = instituteMaleStrength;
	}
	public int getInstituteFemaleStrength() {
		return instituteFemaleStrength;
	}
	public void setInstituteFemaleStrength(int instituteFemaleStrength) {
		this.instituteFemaleStrength = instituteFemaleStrength;
	}
	public int getInstituteStaff() {
		return instituteStaff;
	}
	public void setInstituteStaff(int instituteStaff) {
		this.instituteStaff = instituteStaff;
	}
	public String getInstituteMail() {
		return instituteMail;
	}
	public void setInstituteMail(String instituteMail) {
		this.instituteMail = instituteMail;
	}
	public String getInstituteMobile() {
		return instituteMobile;
	}
	public void setInstituteMobile(String instituteMobile) {
		this.instituteMobile = instituteMobile;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public Course getCourse() {
		return course;
	}
	public void setCourse(Course course) {
		this.course = course;
	}
	@Override
	public String toString() {
		return "InstituteDetaiils [instituteName=" + instituteName + ", instituteAddress=" + instituteAddress
				+ ", instituteDepartment=" + instituteDepartment + ", instituteCourses=" + instituteCourses
				+ ", instituteMaleStrength=" + instituteMaleStrength + ", instituteFemaleStrength="
				+ instituteFemaleStrength + ", instituteStaff=" + instituteStaff + ", instituteMail=" + instituteMail
				+ ", instituteMobile=" + instituteMobile + ", address=" + address + ", course=" + course + "]";
	}
	public void setBranchName(String instituteMail2) {
		// TODO Auto-generated method stub
		
	}
	public void setBranchName(InstituteDetaiils institute) {
		// TODO Auto-generated method stub
		
	}
	public void setAddress(InstituteDetaiils institute) {
		// TODO Auto-generated method stub
		
	}
	public void setAddress(String instituteMail2) {
		// TODO Auto-generated method stub
		
	}
	
}
	


