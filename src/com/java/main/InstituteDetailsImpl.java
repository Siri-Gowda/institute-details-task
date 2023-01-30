package com.java.main;

import java.util.Optional;

import com.java.bean.Address;
import com.java.bean.Branch;
import com.java.bean.Course;
import com.java.bean.InstituteDetaiils;

public class InstituteDetailsImpl implements InstituteDetailsInterface {

	@Override
	public void getCourseDetails() {

		// Creating Course Object
		Course course = new Course();
		course.setCourseName("JAVA FullStack");
		course.setCourseFee("45K");
		course.setCourseDepartment("Information Technology");
		course.setCourseType("Coding");
		course.setCourseMethodology("Agile");
		course.setCourseVersion("jdk 11.0.15.1");
	}

	@Override
	public void getInstituteDetails(int intituteStaff, String instituteMail) {
		// creating institute object
		InstituteDetaiils institute = new InstituteDetaiils();
		institute.setInstituteName("J Spiders");
		institute.setInstituteAddress("Hydarabad");
		institute.setInstituteDepartment("IT");
		institute.setInstituteCourses("Java,Python,C#");
		institute.setInstituteMaleStrength(200);
		institute.setInstituteFemaleStrength(300);
		institute.setInstituteStaff(50);
		institute.setInstituteMail("jspy@gmail.com");
		institute.setInstituteMobile("+91 8979654321");
		Branch instituteDetails = new Branch();
		instituteDetails.setBranchName("Computer Science");

		Course course = new Course();
		course.setCourseName("JAVA FullStack");
		course.setCourseFee("45K");
		course.setCourseDepartment("Information Technology");
		course.setCourseType("Coding");
		course.setCourseMethodology("Agile");
		course.setCourseVersion("jdk 11.0.15.1");

		institute.setCourse(course);
		System.out.println("Printing Course Details in Institute Object =n" + course);

		if (Optional.ofNullable(instituteMail).isPresent()) {
			System.out.println("INSTITUTE DETAILS");
			System.out.println(instituteMail.concat(" Q spiders"));//jspyd@gmail.com Q spiders
			System.out.println(instituteMail.contains("siri@gmail.com")); //false

			System.out.println("========================================");
		} else {
			System.out.println("Institute Mail is not available in Institute Object");

		}

	}

	@Override
	public void getBranchDetails(int branchId, String branchName) {
		// creating branch object
		Branch branch = new Branch();
		branch.setBranchId(22021);
		branch.setBranchGrade('A');
		branch.setBranchStrength(500);
		branch.setBranchName("Computer Science");
		branch.setBranchCategiry("Software");

		if (branchId != 22022 || branchName == "Botony") {
			System.out.println("BRANCH DETAILS");
			System.out.println("If Condition is true");
			System.out.println(branch);
		} else {
			System.out.println("Else Condition is true");
		}

	}

	@Override
	public void getAddressDetails(int pincode) {
		Address address = new Address();
		address.setBlockNumber("D3");
		address.setAreaName("Nagawara");
		address.setCity("Banglore");
		address.setDistrict("Bengaluru Rural");
		address.setState("Karnataka");
		address.setCountry("India");
		address.setPincode(516671);
		if (Optional.ofNullable(address).isPresent()) {
			System.out.println("ADDRESS DETAILS");
			System.out.println(address.getCountry());
			System.out.println(address);
			System.out.println("============================");
		} else {
			System.out.println("else condition is true");
		}

	}

}
