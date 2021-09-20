package com.xworkz.apartment;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.apartment.dao.ApartmentDao;
import com.xworkz.apartment.entity.ApartmentEntity;

public class Tester {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		ApartmentDao dao = context.getBean(ApartmentDao.class);
		ApartmentEntity entity = new ApartmentEntity();
		entity.setApartmentID((byte) 12);
		entity.setFlatPrice(34567);
		entity.setLiftAvailable(true);
		entity.setNoOfFloors(5);
		entity.setParkingAvailable(false);
	}

}
