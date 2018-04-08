package edu.dmacc.spring.vehicleaskelandgoehring;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

public class VehicleDao {
	EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("VehicleAskelandGoehring");

	public void insertVehicle(Vehicle vehicleToAdd) {
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		em.persist(vehicleToAdd);
		em.getTransaction().commit();
		em.close();
	}

	public List<Vehicle> getAllVehicles() {
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		String q = "select v from Vehicle v";
		TypedQuery<Vehicle> typedQuery = em.createQuery(q, Vehicle.class);
		List<Vehicle> all = typedQuery.getResultList();
		return all;
	}
	
	public void deleteVehicle(Vehicle vehicletoDelete) {
		// TODO Auto-generated method stub
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		TypedQuery<Vehicle> typedQuery = em.createQuery(
				"select li from Vehicle li where li.vehicleId = :selectedId",
				Vehicle.class);
		typedQuery.setParameter("selectedId", vehicletoDelete.getVehicleId()); 
		typedQuery.setMaxResults(1);
		Vehicle result = typedQuery.getSingleResult();
		System.out.println("TEST - result: " + result);
		em.remove(result);
		em.getTransaction().commit();
		em.close();
	}

	public Vehicle searchForVehicleById(int idToEdit) {
		// TODO Auto-generated method stub
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		
		Vehicle foundItem =  em.find(Vehicle.class, idToEdit);
		em.close();
		return foundItem; 
	}

	public void editVehicle(Vehicle toEdit) {
		// TODO Auto-generated method stub
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin(); 
		em.merge(toEdit);
		em.getTransaction().commit();
		em.close();
	}
}
