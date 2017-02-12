package ttma.services.impl;


import java.util.List;

import ttma.services.Interfaces.*;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;





import ttma.Entities.Doctor;
import ttma.Entities.OnlineConsultations;




/**
 * Session Bean implementation class GestionProjet
 */
@Stateless
public class GestionConsultationApp implements GestionConsAppRemote, GestionConsAppLocal {

    /**
     * Default constructor. 
     */
    public GestionConsultationApp() {
        // TODO Auto-generated constructor stub
    }

    @PersistenceContext(unitName="pidev-project")	
    private EntityManager entityManager;

    @Override
	public Boolean addcons(OnlineConsultations hotel) {
		try {
			entityManager.persist(hotel);
			return true;
		} catch (Exception e) {
			return false;
		}
		
	}

	@Override
	public Boolean updatecons(OnlineConsultations hotel) {
		try {
			entityManager.merge(hotel);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	@Override
	public Boolean deletecons(OnlineConsultations hotel) {
		try {
			entityManager.remove(entityManager.merge(hotel));
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	

	
	@Override
	public List<OnlineConsultations> findAllcons() {
		Query query=entityManager.createQuery("select h from OnlineConsultations h");
		return query.getResultList();
	}

	

	
}
