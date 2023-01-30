package com.java.bean;

public class Address {
	//Address attributes
	private String blockNumber;
	private String areaName;
	private String city;
	private String district;
	private String state;
	private String country;
	private int pincode;
	
	
	
	
	public String getBlockNumber() {
		return blockNumber;
	}
	public void setBlockNumber(String blockNumber) {
		this.blockNumber = blockNumber;
	}
	public String getAreaName() {
		return areaName;
	}
	public void setAreaName(String areaName) {
		this.areaName = areaName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	//toString() method
	@Override
	public String toString() {
		return "Address [blockNumber=" + blockNumber + ", areaName=" + areaName + ", city=" + city + ", district="
				+ district + ", state=" + state + ", country=" + country + ", pincode=" + pincode + "]";
	}
	
	
	

}
