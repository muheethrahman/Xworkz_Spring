package com.xworkz.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TesterCol {
	ApplicationContext container=new ClassPathXmlApplicationContext("applicationContext.xml");
	
	Collection collection=container.getBean(Collection.class);
}
