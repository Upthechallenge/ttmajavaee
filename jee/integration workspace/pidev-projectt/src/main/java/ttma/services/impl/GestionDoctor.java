package ttma.services.impl;


import java.util.List;
import ttma.services.Interfaces.*;


import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;



import ttma.Entities.Doctor;




/**
 * Session Bean implementation class GestionProjet
 */
@Stateless
public class GestionDoctor implements GestionDoctorRemote, GestionDoctorLocal {

    /**
     * Default constructor. 
     */
    public GestionDoctor() {
        // TODO Auto-generated constructor stub
    }

    @PersistenceContext(unitName="pidev-project")	
    private EntityManager entityManager;

    @Override
	public Boolean addDoctor(Doctor hotel) {
		try {
			entityManager.persist(hotel);
			return true;
		} catch (Exception e) {
			return false;
		}
		
	}

	@Override
	public Boolean updateDoctor(Doctor hotel) {
		try {
			entityManager.merge(hotel);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	@Override
	public Boolean deleteDoctor(Doctor hotel) {
		try {
			entityManager.remove(entityManager.merge(hotel));
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	@Override
	public Doctor findDoctorById(Integer id) {
		Doctor hotel=null;
		try {
			hotel=entityManager.find(Doctor.class, id);
			
		} catch (Exception e) {
			
		}
		return hotel;
	}

	
	@Override
	public List<Doctor> findAllDoctors() {
		Query query=entityManager.createQuery("select h from Doctor h");
		return query.getResultList();
	}

	@Override
	public List<Doctor> listerDoctorsbyname() {
		Query query=entityManager.createQuery("select h.firsNameDoc from Doctor as h");
		return query.getResultList();
	}

	@Override
	public Long CountDoctors() {
		
		
		 
		 
		 Query q2 = entityManager.createQuery(
			        "SELECT COUNT(e) FROM Doctor e ");
			   
		    Long count = (Long)q2.getSingleResult();
		    return count;
		
		
		
	}

	 
    
	
}
