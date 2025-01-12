package ibm.client;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import ibm.entity.Student;

public class Runner {
	public static void main(String[] args) {
		Student st = new Student(2,"Raghav", "male");
		//......configuration().configure()>>>method chaining
		Configuration cfg=new Configuration().configure();
		//cfg.configure();
		SessionFactory sf= cfg.buildSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		session.persist(st);
		tx.commit();
		
	}
}
