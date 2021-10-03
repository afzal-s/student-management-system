package com.bl.studentmanagement.serviceimpl;

import com.bl.studentmanagement.model.Address;
import com.bl.studentmanagement.model.Student;
import com.bl.studentmanagement.service.IStudentService;
import com.bl.studentmanagement.utility.UtilScanner;
import com.bl.studentmanagement.utility.UtilValidation;

public class StudentServiceImpl implements IStudentService {
	@Override
	public void addStudent(Student studentData) {
		studentData.setId(UtilScanner.getString("Enter ID: "));
		boolean isValidID = UtilValidation.isValid(studentData.getId(), "^[0-9]{2}");
		while (isValidID != true) {
			System.out.println("Error! Enter 3 digit School ID");
			studentData.setId(UtilScanner.getString("Enter ID Again: "));
			isValidID = UtilValidation.isValid(studentData.getId(), "^[0-9]{2}");
		}

		studentData.setFirstName(UtilScanner.getString("Enter First Name: "));
		boolean isCapitalFirstName = UtilValidation.isValid(studentData.getFirstName(), "^[A-Z]{1}[A-Za-z]{1,9}$");
		while (isCapitalFirstName != true) {
			System.out.println("Error! Start With Capital Letter Or Max Input 16");
			studentData.setFirstName(UtilScanner.getString("Enter First Name Again: "));
			isCapitalFirstName = UtilValidation.isValid(studentData.getFirstName(), "^[A-Z]{1}[A-Za-z]{1,9}$");
		}

		studentData.setMiddleName(UtilScanner.getString("Enter Middle Name: "));
		boolean isCapitalMiddleName = UtilValidation.isValid(studentData.getMiddleName(), "^[A-Z]{1}[A-Za-z]{1,9}$");
		while (isCapitalMiddleName != true) {
			System.out.println("Error! Start With Capital Letter Or Max Input 16");
			studentData.setMiddleName(UtilScanner.getString("Enter Middle Name Again: "));
			isCapitalMiddleName = UtilValidation.isValid(studentData.getMiddleName(), "^[A-Z]{1}[A-Za-z]{1,9}$");
		}

		studentData.setLastName(UtilScanner.getString("Enter Last Name: "));
		boolean isCapitalLastName = UtilValidation.isValid(studentData.getLastName(), "^[A-Z]{1}[A-Za-z]{1,9}$");
		while (isCapitalLastName != true) {
			System.out.println("Error! Start With Capital Letter Or Max Input 16");
			studentData.setLastName(UtilScanner.getString("Enter Last Name Again: "));
			isCapitalLastName = UtilValidation.isValid(studentData.getLastName(), "^[A-Z]{1}[A-Za-z]{1,9}$");
		}

		studentData.setMobileNumber(UtilScanner.getString("Enter Mobile Number: "));
		boolean isValidMobileNumber = UtilValidation.isValid(studentData.getMobileNumber(), "^[6-9]{1}[1-9]{9}");
		while (isValidMobileNumber != true) {
			System.out.println("Error! Enter 10 Digit Mobile Number");
			studentData.setMobileNumber(UtilScanner.getString("Enter Mobile Number Again: "));
			isValidMobileNumber = UtilValidation.isValid(studentData.getMobileNumber(), "^[6-9]{1}[1-9]{9}");
		}

		studentData.setEmailId(UtilScanner.getString("Enter Email ID: "));
		boolean isValidEmail = UtilValidation.isValid(studentData.getEmailId(),
				"^[a-zA-Z0-9_+&*-]+(?:\\." + "[a-zA-Z0-9_+&*-]+)*@" + "(?:[a-zA-Z0-9-]+\\.)+[a-z" + "A-Z]{2,7}$");
		while (isValidEmail != true) {
			System.out.println("Error! Don't Start With Capital Letter & Check @ .com");
			studentData.setEmailId(UtilScanner.getString("Enter Email ID Again: "));
			isValidEmail = UtilValidation.isValid(studentData.getEmailId(),
					"^[a-zA-Z0-9_+&*-]+(?:\\." + "[a-zA-Z0-9_+&*-]+)*@" + "(?:[a-zA-Z0-9-]+\\.)+[a-z" + "A-Z]{2,7}$");
		}

		Address addressObject = new Address();

		addressObject.setStreetName(UtilScanner.getString("Enter Street: "));
		addressObject.setCity(UtilScanner.getString("Enter Land Mark:  "));
		addressObject.setLandMark(UtilScanner.getString("Enter City: "));
		addressObject.setPin(UtilScanner.getString("Enter Pin Code: "));

		studentData.setAddress(addressObject);
	}
}