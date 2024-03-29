package com.example.project.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor(staticName = "bulid")
@NoArgsConstructor
@Entity
@Table(name="persondetails")
public class Person {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String address;
	private String gender;
	private double mobileNo;
	
	@OneToOne(mappedBy = "person",cascade = CascadeType.ALL)
	@JsonManagedReference
	private Bike bike;

	

	
	
	

}
