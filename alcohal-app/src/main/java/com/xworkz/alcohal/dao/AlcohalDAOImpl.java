package com.xworkz.alcohal.dao;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.xworkz.alcohal.entity.AlcohalEntity;


public class AlcohalDAOImpl implements AlcohalDAO {

	@Autowired
	private SessionFactory factory;

	public AlcohalDAOImpl(SessionFactory sessionFactory) {
		this.factory = sessionFactory;
		System.out.println(this.getClass().getSimpleName() + "Bean Created");
	}

	public void save(AlcohalEntity entity) {
		Session session = null;
		try {
			session = factory.openSession();
			session.beginTransaction();
			session.save(entity);
			session.getTransaction().commit();

		} catch (HibernateException e) {
			session.getTransaction().rollback();
			System.out.println(e.getMessage());
		} finally {
			if (session != null) {
				session.close();
			}
		}
		
	}
	

	
}

