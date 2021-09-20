package com.xworkz.apartment.dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.xworkz.apartment.dao.ApartmentDao;
import com.xworkz.apartment.entity.ApartmentEntity;

public class ApartmentDaoImpl implements ApartmentDao{

	private static SessionFactory factory;
	
	public ApartmentDaoImpl() {
		super();
		System.out.println(this.getClass().getSimpleName()+"bean created");
	}
		public void setApartmentEntity(ApartmentEntity flat) {
			Session session =null;
			try {session=factory.openSession();
			session.beginTransaction();
			session.save(flat);
			session.getTransaction().commit();
				
			} catch (HibernateException e) {
				session.getTransaction().rollback();
				System.out.println(e.getMessage());
			}finally {
				if(session !=null) {
					session.close();
				}
			}
		}

}
