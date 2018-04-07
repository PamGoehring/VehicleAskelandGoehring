package edu.dmacc.spring.vehicleaskelandgoehring;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

public class RenterDao {
	EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("VehicleAskelandGoehring");

	public void insertRenter(Renter renterToAdd) {
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		em.persist(renterToAdd);
		em.getTransaction().commit();
		em.close();
	}
	
	public List<Renter> getAllRenters(){
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		String q = "select r from Renter r";
		TypedQuery<Renter> typedQuery = em.createQuery(q,Renter.class);
		List<Renter> all = typedQuery.getResultList();
		return all;
	}
}
