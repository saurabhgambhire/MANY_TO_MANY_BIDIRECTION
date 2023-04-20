package MANY_TO_MANY_BIDIRECTION.DAO;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import MANY_TO_MANY_BIDIRECTION.DTO.Student;

public class Dao 
{

	public void saveStudent(Student student) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("saurabh");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(student);
		entityTransaction.commit();
		
	}
	
	

}
