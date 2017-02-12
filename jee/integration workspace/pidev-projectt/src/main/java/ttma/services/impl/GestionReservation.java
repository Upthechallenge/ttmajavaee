package ttma.services.impl;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import ttma.Entities.Reservation;
import ttma.services.Interfaces.GestionReservationLocal;
import ttma.services.Interfaces.GestionReservationRemote;



/**
 * Session Bean implementation class GestionReservation
 */
@Stateless
@LocalBean
public class GestionReservation implements GestionReservationRemote, GestionReservationLocal {
	
	@PersistenceContext(unitName="pidev-project")	
	EntityManager entityManager;

    /**
     * Default constructor. 
     */
    public GestionReservation() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public Boolean addReservation(Reservation problem) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean updateReservation(Reservation problem) {
		try {
			entityManager.merge(problem);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	@Override
	public Boolean deleteReservation(Reservation problem) {
		try {
			entityManager.remove(entityManager.merge(problem));
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	@Override
	public Reservation findReservationById(Integer id) {
		Query query=entityManager.createQuery("select h from Reservation h WHERE h.user LIKE :userid").setParameter("userid", id);
		return (Reservation) query.getResultList();
	}

	@Override
	public List<Reservation> findAllReservations() {
		Query query=entityManager.createQuery("select h from Reservation h");
		return query.getResultList();
	}

	@Override
	public List<Reservation> findAllReservationsById(Integer userid) {
		// TODO Auto-generated method stub
		return null;
	}

	

}
