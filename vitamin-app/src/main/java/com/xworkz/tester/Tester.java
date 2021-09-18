package com.xworkz.tester;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.Fruit;

public class Tester {
	public static void main(String[] args) {
		String beanConfigurationFile = "applicationContext.xml";
		ApplicationContext context = new ClassPathXmlApplicationContext(beanConfigurationFile);
		
		Fruit fruit = context.getBean(Fruit.class);
		System.out.println(fruit.name);		
		System.out.println(fruit.color);
		System.out.println(fruit.price);
		System.out.println(fruit.taste);
		
        System.out.println(fruit.vitamin.type);
		System.out.println(fruit.vitamin.waterSoluble);
		System.out.println(fruit.vitamin.fatSoluble);
		fruit.provideEnergy();

	}
}
