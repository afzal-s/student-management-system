package com.bl.studentmanagement.model;

public class Student {
	String id;
	String firstName;
	String middleName;
	String lastName;
	String mobileNumber;
	String emailId;
	Address address;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
	@Override
	public String toString() {
		return "\nSree Narayana Guru High School\n" + "\nStudent Details: \n" + "School ID: " + id + "\n"
				+ "Full Name: " + firstName + " " + middleName + " " + lastName + "\n" + "Mobile Number: "
				+ mobileNumber + "\n" + "Email ID: " + emailId + "\n" + "Address: " + address + "\n";
	}
}
