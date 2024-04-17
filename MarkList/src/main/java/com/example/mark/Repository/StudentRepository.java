package com.example.mark.Repository;

import java.util.List;
import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.mark.Entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer>{

	List<Student> findAllBySectionIn(Set<String> sec);

	 @Query(value = "SELECT l.firstname, l.lastname, l.result FROM student l WHERE l.result = 'Fail'", nativeQuery = true)
	 List<Student> findFailedStudent();

}
