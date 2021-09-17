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
		String string = (String)container.getBean("string");
		System.out.println(string);
		Double db=(Double)container.getBean("double");
		System.out.println(db);
		Integer integer=(Integer)container.getBean("integer");
		System.out.println(integer);
		Boolean temp=(Boolean)container.getBean("boolean");
		System.out.println(temp);
		Long value=(Long)container.getBean("long");
		System.out.println(value);
		Short sht=(Short)container.getBean("short");
		System.out.println(sht);
		Byte byt=(Byte)container.getBean("byte");
		System.out.println(byt);
		Float flt=(Float)container.getBean("float");
		System.out.println(flt);
	}

}
