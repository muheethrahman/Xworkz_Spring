package com.xworkz.Tester;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.airport.AirportInfo;

public class Tester {

	public static void main(String[] args) {
		String beanConfigurationFile = "spring.xml";
		ApplicationContext container = new ClassPathXmlApplicationContext(beanConfigurationFile);
		AirportInfo airport = container.getBean(AirportInfo.class);
		System.out.println(airport);
		airport.runway();
		airport.maintainance();
	}

}
