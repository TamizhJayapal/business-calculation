package com.example.BusinessCalculation;

import org.springframework.context.annotation.ComponentScan;

import org.springframework.context.ApplicationContext;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@ComponentScan
public class BusinessCalculationApplication {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(BusinessCalculationApplication.class);
		System.out.println(context.getBean(BusinessCalculationService.class).findMax());
		//System.out.println(context.getBean("name"));
		context.getBean(BusinessCalculationService.class).getFeature();

	}

}
