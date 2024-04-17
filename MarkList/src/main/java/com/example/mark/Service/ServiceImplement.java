package com.example.mark.Service;

import java.util.List;
import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.mark.Entity.Student;
import com.example.mark.Repository.StudentRepository;

@Service
public class ServiceImplement implements ServiceInterface{
	
	@Autowired
	StudentRepository stuRepo;

	@Override
	public ResponseEntity<?> createStudent(Student student) {
		stuRepo.save(student);
		student.setTotal(student.getTamil()+student.getEnglish()+student.getMaths()+student.getScience()+student.getSocial());
		stuRepo.save(student);
		student.setAverage(student.getTotal()/5);
		
		if(student.getTotal()>250) {
			student.setResult("Pass");
		}else {
			student.setResult("Fail");
		}
		 stuRepo.save(student);
		
		 return ResponseEntity.status(HttpStatus.CREATED).body("Created Student");
	}

	@Override
	public ResponseEntity<List<Student>> getAllStudent() {
		List<Student> student=stuRepo.findAll();
		return ResponseEntity.ok(student);
		
	}

	@Override
	public ResponseEntity<?> getStudentById(int id) {
		Student student1=stuRepo.findById(id).get();
		
	if(student1!=null) {
		return ResponseEntity.ok(student1);
	}else {
		return ResponseEntity.notFound().build();
	}
		}

	@Override
	public ResponseEntity<?> updateStudent(int id, Student student) {
	    Optional<Student> studentOptional = stuRepo.findById(id);
	    if (studentOptional.isPresent()) {
	        Student stu = studentOptional.get();
	        
	        if (student.getFirstname() != null) {
	            stu.setFirstname(student.getFirstname());
	        }
	        if (student.getLastname() != null) {
	            stu.setLastname(student.getLastname());
	        }
	        if (student.getSection() != null) {
	            stu.setSection(student.getSection());
	        }
	        if (student.getTamil() != 0) {
	            stu.setTamil(student.getTamil());
	        }
	        if (student.getEnglish() != 0) {
	            stu.setEnglish(student.getEnglish());
	        }
	        if (student.getMaths() != 0) {
	            stu.setMaths(student.getMaths());
	        }
	        if (student.getScience() != 0) {
	            stu.setScience(student.getScience());
	        }
	        if (student.getSocial() != 0) {
	            stu.setSocial(student.getSocial());
	        }
	        
	        stuRepo.save(stu);
	        return ResponseEntity.ok().body("Update Successfully!");
	    } else {
	        return ResponseEntity.notFound().build();
	    }
	}


	@Override
	public ResponseEntity<?> deleteStudent(int id) {
		stuRepo.deleteById(id);
		return ResponseEntity.ok().body("Delete Succesfully!");
	}

	@Override
	public List<Student> getStudentParam(Set<String> sec) {
		return stuRepo.findAllBySectionIn(sec);
	}

	@Override
	public List<Student> getFailedStudent() {
		return stuRepo.findFailedStudent();
	}

}
