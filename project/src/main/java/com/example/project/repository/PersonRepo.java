package com.example.project.repository;

import java.util.List;
import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.project.entity.Person;

@Repository
public interface PersonRepo extends JpaRepository<Person, Integer> {
	List<Person>findAllByAddressAndGender(Set<String> add,String gen);
}
