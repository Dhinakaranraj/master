package com.example.project.common;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Error {
	private String targetField;
	private String message;

}
