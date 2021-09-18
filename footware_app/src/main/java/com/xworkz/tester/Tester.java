package com.xworkz.tester;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.Footwear;

public class Tester {
public static void main(String[] args) {
		
		String beanConfig="applicationContext.xml";
		ApplicationContext context= new ClassPathXmlApplicationContext(beanConfig);
		
		Footwear foot = context.getBean(Footwear.class);
	    System.out.println(foot.brand);
	    System.out.println(foot.color);
	    System.out.println(foot.price);
	    
	    System.out.println(foot.material.leather);
	    System.out.println(foot.material.rubber);
	    System.out.println(foot.material.cloth);
	    
	    foot.walk();
	    foot.material.protection();
	    

	}

}

