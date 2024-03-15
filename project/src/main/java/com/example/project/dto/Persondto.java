package com.example.project.dto;

import jakarta.validation.constraints.NotBlank;
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
    @NotBlank
	private double mobileNo;
}

