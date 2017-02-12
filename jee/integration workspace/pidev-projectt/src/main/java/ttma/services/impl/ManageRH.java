package ttma.services.impl;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import ttma.services.Interfaces.ManageRHRemote;
import ttma.services.Interfaces.ManageRHLocal;
import ttma.Entities.Staff;

/**
 * Session Bean implementation class ManageRH
 * 
 * Cette classe implèmente tous les méthodes associées Ã  un Staff
 * 
 * @author AminePc
 */
@Stateless
public class ManageRH implements ManageRHRemote,
ManageRHLocal {

	@PersistenceContext(unitName = "pidev-project")
	private EntityManager em;

	/**
	 * Default constructor.
	 */
	public ManageRH() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean addStaff(Staff staff) {
		 em.persist(staff);
		 return true;
	}

	@Override
	public void updateStaff(Staff staff) {
		em.merge(staff);
	}

	@Override
	public Staff findByIdStaff(int id) {
		return em.find(Staff.class, id);
	}

	@Override
	public void deleteStaff(Staff staff) {
		em.remove(em.merge(staff));
	}

	@Override
	public List<Staff> findAll() {
		return em.createQuery("select a from Staff a",Staff.class).getResultList();
	}
	
	@Override
	public Staff getStaffByLogin(String name) {
	    TypedQuery<Staff> query = em.createQuery("SELECT c FROM Staff c WHERE c.login = :name", Staff.class);
	    return query.setParameter("name", name).getSingleResult();
	  } 

}
