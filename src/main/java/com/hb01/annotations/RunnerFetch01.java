package com.hb01.annotations;

import java.util.Arrays;
import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class RunnerFetch01 {

	public static void main(String[] args) {

		
		Configuration con = new 
				Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student01.class);
		
		
		SessionFactory sf = con.buildSessionFactory();
		
		Session session = sf.openSession();
		
		Transaction tx = session.beginTransaction();
				
//		Student01 student01= session.get(Student01.class, 1001);
//		Student01 student02= session.get(Student01.class, 1002);
//		Student01 student03= session.get(Student01.class, 1003);


//		System.out.println(student01);
//		System.out.println(student02);
//		System.out.println(student03);
		
		
		
		// SQL ornegi
		
//		String sqlQuary1 = "SELECT * FROM t_student01";
//		List<Object[]> resultList1 = session.createSQLQuery(sqlQuary1).getResultList();
		
//		Query query1 = session.createQuery(sqlQuary1);
//		List<Object[]> resultList1 = query1.getResultList();
		
//		
//		for (Object[] objects : resultList1) {
//			System.out.println(Arrays.toString(objects));
//		}
		
		
		//HQL ornegi---Sql sorgusunda FROM'dan sonra sinif ismi kullanilmali. Kullanilmazsa student01 is not mapped alinir
		
//		String hqlQuery1="FROM Student01";
//		List<Student01> resultList2 = session.createQuery(hqlQuery1, Student01.class).getResultList();
//		
//		for (Student01 student01 : resultList2) {
//			System.out.println(student01);
//		}

		
		
		// Donecek kaydin unique bir kayit olduguna eminseniz uniqueResult() methodu kullanilabilir
//		String sqlQuery2 = "SELECT * FROM t_student01 WHERE student_name='John Coffie'";
//		Object[] uniqueResult1 = (Object[]) session.createSQLQuery(sqlQuery2).uniqueResult();
		
//		System.out.println(Arrays.toString(uniqueResult1));
//		System.out.println(uniqueResult1[0]+":"+uniqueResult1[1]+":"+uniqueResult1[2]);

		
		// HQL ile unique result sorgulama
//		String hqlQuery2 = "FROM Student01 WHERE name='John Coffie'";
//		Student01 uniqueResult2 = session.createQuery(hqlQuery2,Student01.class).uniqueResult();	
//		System.out.println(uniqueResult2);
		
		
		// HQL ile Alias kullanma ornegi
//		String hqlQuery2 = "FROM Student01 std WHERE std.name='John Coffie'";
//		Student01 uniqueResult2 = session.createQuery(hqlQuery2,Student01.class).uniqueResult();	
//		System.out.println(uniqueResult2);
		
		
		
		// HQL ile belirli degiskenleri alma
		// grade degeri 10 olan ogrencileri getir
//		String hqlQuery3 = "SELECT s.id, s.name FROM Student01 s where s.grade=10";
//		List<Object[]> resultList4 = session.createQuery(hqlQuery3).getResultList();
//		for (Object objects : resultList4) {
//			System.out.println(Arrays.deepToString((Object[]) objects));
//		}
		
		
		
		String hqlQuery4 = "FROM Student01 s order by s.id desc";
		List<Student01> resultList5 = session.createQuery(hqlQuery4,Student01.class).getResultList();
		for (Student01 student01 : resultList5) {
			System.out.println(student01);
		}
		
		
		
		
		
		
		
		
		
		
		
		tx.commit();
		
		session.close();
		
		sf.close();
		
	}

}
