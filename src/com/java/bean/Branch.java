package com.java.bean;

public class Branch {
	//Branch attributes
	private int branchId;
	private char branchGrade;
	private int branchStrength;
	private String branchName;
	private String branchCategiry;
	
	
	
	
	//setter and getter methods
	public int getBranchId() {
		return branchId;
	}
	public void setBranchId(int branchId) {
		this.branchId = branchId;
	}
	public int getBranchGrade() {
		return branchGrade;
	}
	public void setBranchGrade(char branchGrade) {
		this.branchGrade = branchGrade;
	}
	public int getBranchStrength() {
		return branchStrength;
	}
	public void setBranchStrength(int branchStrength) {
		this.branchStrength = branchStrength;
	}
	public String getBranchName() {
		return branchName;
	}
	public  void setBranchName(String branchName) {
		this.branchName = branchName;
	}
	public String getBranchCategiry() {
		return branchCategiry;
	}
	public void setBranchCategiry(String branchCategiry) {
		this.branchCategiry = branchCategiry;
	}
	//toString()method
	
	@Override
	public String toString() {
		return "Branch [branchId=" + branchId + ", branchGrade=" + branchGrade + ", branchStrength=" + branchStrength
				+ ", branchName=" + branchName + ", branchCategiry=" + branchCategiry + "]";
	}
	

}
