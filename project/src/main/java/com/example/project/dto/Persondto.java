package com.example.project.dto;

import com.example.project.entity.Person;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor(staticName = "bulid")
@NoArgsConstructor
public class Persondto {
    @NotBlank(message = "Your name should be blank fill your name!")
	private String name;
    @NotBlank(message = "Your address should not blank fill please")
	private String address;
    @NotBlank(message = "fill up your gender")
	private String gender;
    @NotNull(message = "Mobile number must not be null.")
    private Double mobileNo;
    
    private Person person;
    
}    

