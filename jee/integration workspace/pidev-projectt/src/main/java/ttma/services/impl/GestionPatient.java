package ttma.services.impl;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import ttma.Entities.User;
import ttma.services.Interfaces.GestionPatientLocal;
import ttma.services.Interfaces.GestionPatientRemote;



/**
 * Session Bean implementation class GestionPatient
 */
@Stateless
public class GestionPatient implements GestionPatientRemote, GestionPatientLocal {
	
	@PersistenceContext(unitName="pidev-project")	
	EntityManager entityManager;

    /**
     * Default constructor. 
     */
    public GestionPatient() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public Boolean addUser(User user) {
		try {
			entityManager.persist(user);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	@Override
	public Boolean updateUser(User user) {
		try {
			entityManager.persist(user);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	@Override
	public Boolean deleteUser(User user) {
		try {
			entityManager.remove(entityManager.merge(user));
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	@Override
	public User findUserById(Integer id) {
		User user=null;
		try {
			user=entityManager.find(User.class, id);
			
		} catch (Exception e) {
			
		}
		return user;
	}

	@Override
	public List<User> findAllUsers() {
		Query query=entityManager.createQuery("select h from User h");
		return query.getResultList();
	}

}
