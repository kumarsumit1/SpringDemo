package com.lac.tut.mockito.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lac.tut.mockito.Calculator;

public class MainWithSpring {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"beans.xml");
		Calculator calculator = (Calculator) context.getBean("calculator");
		System.out.println("Area: " + calculator.getArea());
	}
}
