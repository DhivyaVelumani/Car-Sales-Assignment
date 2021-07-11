package com.example.demo.model;

import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
public class Car {

	private String model;
	private int modelyear;
	private double TravelKms;
	private String status;
	private String ownerName;
	private long ownerNumber;
	
	
}

