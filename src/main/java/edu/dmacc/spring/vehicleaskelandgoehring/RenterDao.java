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

//Playing with renter delete, not tested yet, referenced ConsoleGalleryApp for code examples
	public void deleteRenter(Renter renterToDelete) {
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		TypedQuery<Renter> typedQuery = em.createQuery("select r from Renter r where r.firstName = :selectedFirstName and r.lastName = :selectedLastName", Renter.class);
		typedQuery.setParameter("selectedFirstName", renterToDelete.getFirstName());
		typedQuery.setParameter("selectedLastName",  renterToDelete.getLastName());
		typedQuery.setMaxResults(1);
		Renter result = typedQuery.getSingleResult();
		em.remove(result);
		em.getTransaction().commit();
		em.close();
		
	}
}
