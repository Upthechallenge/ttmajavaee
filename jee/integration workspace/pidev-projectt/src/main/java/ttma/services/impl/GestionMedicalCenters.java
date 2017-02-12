package ttma.services.impl;


import java.util.List;




import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;




import ttma.Entities.Doctor;
import ttma.Entities.MedicalCenters;

import ttma.services.Interfaces.*;


/**
 * Session Bean implementation class GestionProjet
 */
@Stateless
public class GestionMedicalCenters implements GestionMedicalCentersRemote, GestionMedicalCentersLocal {

    /**
     * Default constructor. 
     */
    public GestionMedicalCenters() {
        // TODO Auto-generated constructor stub
    }

    @PersistenceContext(unitName="pidev-project")	
    private EntityManager entityManager;

    @Override
	public Boolean addMedicalCenters (MedicalCenters  hotel) {
		try {
			entityManager.persist(hotel);
			return true;
		} catch (Exception e) {
			return false;
		}
		
	}

	@Override
	public Boolean updateMedicalCenters (MedicalCenters  hotel) {
		try {
			entityManager.merge(hotel);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	@Override
	public Boolean deleteMedicalCenters (MedicalCenters  hotel) {
		try {
			entityManager.remove(entityManager.merge(hotel));
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	@Override
	public MedicalCenters  findMedicalCentersById(Integer id) {
		MedicalCenters  hotel=null;
		try {
			hotel=entityManager.find(MedicalCenters .class, id);
			
		} catch (Exception e) {
			
		}
		return hotel;
	}

	
	@Override
	public List<MedicalCenters > findAllMedicalCenters() {
		Query query=entityManager.createQuery("select h from MedicalCenters h");
		return query.getResultList();
	}

	@Override
	public List<MedicalCenters> findAllMedicalCentersbyname() {
		Query query=entityManager.createQuery("select h from MedicalCenters h");
		return query.getResultList();
	}

	
	}

	 
    
	

