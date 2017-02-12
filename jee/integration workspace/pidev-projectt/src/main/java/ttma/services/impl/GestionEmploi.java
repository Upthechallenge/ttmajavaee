package ttma.services.impl;


import java.util.List;

import ttma.services.Interfaces.*;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import ttma.Entities.Timetable;




/**
 * Session Bean implementation class GestionProjet
 */
@Stateless
public class GestionEmploi implements GestionEmploiRemote, GestionEmploiLocal {

    /**
     * Default constructor. 
     */
    public GestionEmploi() {
        // TODO Auto-generated constructor stub
    }

    @PersistenceContext(unitName="pidev-project")	
    private EntityManager entityManager;

    @Override
	public Boolean addTimetable(Timetable hotel) {
		try {
			entityManager.persist(hotel);
			return true;
		} catch (Exception e) {
			return false;
		}
		
	}

	@Override
	public Boolean updateTimetable(Timetable hotel) {
		try {
			entityManager.merge(hotel);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	@Override
	public Boolean deleteTimetable(Timetable hotel) {
		try {
			entityManager.remove(entityManager.merge(hotel));
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	
	@Override
	public List<Timetable> findAllTimetable() {
		Query query=entityManager.createQuery("select h from Timetable h");
		return query.getResultList();
	}

	
    
	
}
