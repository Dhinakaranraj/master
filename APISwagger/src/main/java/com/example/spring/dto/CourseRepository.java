package com.example.spring.dto;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.spring.model.Course;

public interface CourseRepository extends JpaRepository<Course, Integer> {

}
