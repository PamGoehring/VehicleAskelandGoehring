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
}
