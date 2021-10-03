package com.bl.studentmanagement.controller;

import com.bl.studentmanagement.model.Student;
import com.bl.studentmanagement.service.IStudentService;
import com.bl.studentmanagement.serviceimpl.StudentServiceImpl;

public class DashBoard {
	public static void main(String[] args) {
		System.out.println("Sree Narayana Guru High School\n");

		Student studentObject = new Student();
		
		IStudentService studentService = new StudentServiceImpl();
		studentService.addStudent(studentObject);
	}
}