package io.crud.student.studentcrudapp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Student {

	@Id
	@GeneratedValue
	private int studentId;
	private String studentName;
	private String dept;
	public Student(int studentId, String studentName, String dept) {
	
		this.studentId = studentId;
		this.studentName = studentName;
		this.dept = dept;
	}
	
	public Student(){
		
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	
	
	

}
