package ttma.services.impl;


import java.util.List;

import ttma.services.Interfaces.*;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;




import ttma.Entities.Doctor;
import ttma.Entities.DoctorDisponibilities;




/**
 * Session Bean implementation class GestionProjet
 */
@Stateless
public class GestionDoctotDisp implements GestionDoctorDispRemote, GestionDoctorDispLocal {

    /**
     * Default constructor. 
     */
    public GestionDoctotDisp() {
        // TODO Auto-generated constructor stub
    }

    @PersistenceContext(unitName="pidev-project")	
    private EntityManager entityManager;

    @Override
	public Boolean addDoctordisp(DoctorDisponibilities hotel) {
		try {
			entityManager.persist(hotel);
			return true;
		} catch (Exception e) {
			return false;
		}
		
	}

	@Override
	public Boolean updateDoctordisp(DoctorDisponibilities hotel) {
		try {
			entityManager.merge(hotel);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	@Override
	public Boolean deleteDoctordisp(DoctorDisponibilities hotel) {
		try {
			entityManager.remove(entityManager.merge(hotel));
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	@Override
	public DoctorDisponibilities findDoctordispById(Integer id) {
		DoctorDisponibilities hotel=null;
		try {
			hotel=entityManager.find(DoctorDisponibilities.class, id);
			
		} catch (Exception e) {
			
		}
		return hotel;
	}

	
	@Override
	public List<DoctorDisponibilities> findAllDoctorsdisp() {
		Query query=entityManager.createQuery("select h from DoctorDisponibilities h");
		return query.getResultList();
	}

	@Override
	public List<DoctorDisponibilities> listerDoctorsdispbyDate(String date) {
		Query query5 = entityManager.createQuery("SELECT e FROM DoctorDisponibilities e WHERE doctor_name=:s");
		query5.setParameter("s",date);
		
		return query5.getResultList();
	}


	
	

	 
    
	
}
