package com.wordpress.sreeharshasite;

public class Person implements Comparable<Person>{
	
	private String SSN;
	
	private String name;
	
	private String passportNo;
	
	private String drivingLicenseNo;
	
	public Person()
	{
		
		
	}
	
	public Person(String SSN,String name,String passportNo,String drivingLicenseNo)
	{
		
		this.SSN=SSN;
		
		this.name=name;
		
		this.passportNo=passportNo;
		
		this.drivingLicenseNo=drivingLicenseNo;	
		
	}

	public String getSSN() {
		return SSN;
	}

	public void setSSN(String sSN) {
		SSN = sSN;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassportNo() {
		return passportNo;
	}

	public void setPassportNo(String passportNo) {
		this.passportNo = passportNo;
	}

	public String getDrivingLicenseNo() {
		return drivingLicenseNo;
	}

	public void setDrivingLicenseNo(String drivingLicenseNo) {
		this.drivingLicenseNo = drivingLicenseNo;
	}

	@Override
	public int compareTo(Person obj) {
		
		return this.SSN.compareTo(obj.getSSN());
		
	}

}
