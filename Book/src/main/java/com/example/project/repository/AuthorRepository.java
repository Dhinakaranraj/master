package com.example.project.repository;

import java.util.List;
import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.project.entity.Author;

@Repository
public interface AuthorRepository extends JpaRepository<Author, Integer> {


	List<Author> findAllByGenderInAndName(Set<String> gen,String name);


}
