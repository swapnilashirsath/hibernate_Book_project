package com.strorege;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Book_App {

	public static void main(String[] args) {
		 
		Configuration configuration;
		configuration = new Configuration ();
		
		configuration.configure("hibernate.cfg.xml");
		
		SessionFactory sessionfactory ;
		sessionfactory = configuration.buildSessionFactory();
		
		System.out.println("now.. connection has been done:) ");
		
		Session session;
		session= sessionfactory.openSession();
		System.out.println("now we can start for transaction Querry..");
		
		Transaction transaction;
		transaction=session.beginTransaction();  //  from here query transaction gets started..
		
		
		Books book;
		book= new Books(132,"mahabharat",899.80,"Birjjumaharaj..");
		
		
		// session.save(book);   //this command only useful for create atable & insert data
		//session.update(book);   //for.. update any atributes..
		
	// if u want to delete any query then.. u need to check 1st.
	// whatever query are exist Or not in database .?
		
		/*session.get(Books.class, 132);
		session.delete(session.get(Books.class, 132));*/
		
		System.out.println("database has been updated.!");
	
   // if u want to see all exixting table query in console then..
		
		session.createQuery("from Books").getResultList();
		List <Books>bookslist =session.createQuery("from Books").getResultList();
		for (Books books : bookslist) {
			System.out.println(books);
		}
		
		transaction.commit();
		session.close();
		sessionfactory.close();
		
		 

	}

}
