package com.example.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.project.entity.Bike;

@Repository
public interface BikeRepo extends JpaRepository<Bike, Integer> {

}
