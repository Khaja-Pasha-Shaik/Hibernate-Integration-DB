package io.crud.student.studentcrudapp;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Arrays;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

	
	@Autowired
	private StudentRepo studentRepo;
	
	public List<Student> getAllStudents(){
		return studentRepo.findAll();
	}
	
	public void addStudent(Student student){
			studentRepo.save(student);

	}

	public void updateStudent(Integer studentId, Student student) {
		studentRepo.save(student);
		
	}

	public Optional<Student> getStudentById(int studentId) {
		Optional<Student> s = studentRepo.findById(studentId);
		return s;
	}

	public void deleteStudent(int studentId) {
		
		studentRepo.deleteById(studentId);
	}
	
	

}
