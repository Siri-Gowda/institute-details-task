package com.java.main;

//import com.java.bean.InstituteDetaiils;

public class InstituteDetailsMain {
	public static void main(String args[]) {

		// object creation for course details
		InstituteDetailsInterface courseDetails = new InstituteDetailsImpl();
		courseDetails.getCourseDetails();// method calling

		int intituteStaff = 50;
		String instituteMail = "jspyd@gmail.com";
		InstituteDetailsInterface instituteDetails = new InstituteDetailsImpl();
		instituteDetails.getInstituteDetails(intituteStaff, instituteMail); // (parameterized)method calling

		// object creation for address object
		int pincode = 0;
		InstituteDetailsInterface address = new InstituteDetailsImpl();
		address.getAddressDetails(pincode); // (parameterized)method calling

		// object creation for branch object
		int branchId = 22021;
		String branchName = "Computer Science";
		InstituteDetailsInterface branch = new InstituteDetailsImpl();
		branch.getBranchDetails(branchId, branchName); // (parameterized )method calling

	}

}
