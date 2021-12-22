package io.crud.student.studentcrudapp;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	@RequestMapping("/students")
	public List<Student> getAllStudents(){
		return studentService.getAllStudents();
	}
	
	@GetMapping("/students/{studentId}")
	public Optional<Student> getStudentById(@PathVariable int studentId){
		return studentService.getStudentById(studentId);
	}
	
	@PostMapping("/students")
	public void addStudent(@RequestBody Student student){
		studentService.addStudent(student);
	}
	
	@PutMapping("/students/{studentId}")
	public void updateStudent(@RequestBody Student student, @PathVariable Integer studentId){
			 studentService.updateStudent(studentId,student);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/students/{studentId}")
	public void deleteStudent(@PathVariable int studentId){
		studentService.deleteStudent(studentId);
	}

}
