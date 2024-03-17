package com.example.project.repository;

import java.util.List;
import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.project.entity.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Integer> {

	
	@Query("SELECT b FROM Book b WHERE b.yearOfPublication IN:yop And b.bookType=:book")
	List<Book> findAllByYearOfPublicationAndBookType(@Param("yop") Set<Integer> yop,@Param("book")String book);

	List<Book> findAllByBookTypeIn(Set<String> bok);

}
