package com.lti.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.lti.entity.CarPart;

@Component("carParts4")//It's a dao class cause it's talking to the database.
public class CarPartsInventoryImpl4 implements CarPartsInventory {
	

	@PersistenceContext
	EntityManager em;
	
	
	
	public List<CarPart> getAvailableParts() {
		String sql ="select cp from CarPart as cp";
		TypedQuery<CarPart> query = em.createQuery(sql, CarPart.class);
		List<CarPart> list = query.getResultList();
		System.out.println(list);
		return list;
	}

	@Transactional
	public void addNewPart(CarPart carPart) {
		em.persist(carPart);		
	}

	
	
	
}
