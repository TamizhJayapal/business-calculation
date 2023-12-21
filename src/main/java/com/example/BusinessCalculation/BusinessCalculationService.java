package com.example.BusinessCalculation;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class BusinessCalculationService {
	private DataService dataService;
	
	@Value("${app.feature:failure}")
	private String feature;

	public BusinessCalculationService(DataService dataService) {
		this.dataService = dataService;
	}

	public int findMax() {
		return Arrays.stream(dataService.reteriveData()).max().orElse(0);
	}
	
	public void getFeature() {
		System.out.println(this.feature);
	}
}
