package ttma.services.impl;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import ttma.Entities.Staff;
import ttma.services.Interfaces.*;


/**
 * Session Bean implementation class AuthentificationService
 */
@Stateless
public class AuthentificationService implements AuthentificationServiceLocal,AuthentificationServiceRemote {

	/**
	 * Default constructor.
	 */
	@PersistenceContext(unitName="pidev-project")
	EntityManager entityManager;

	public AuthentificationService() {
		// TODO Auto-generated constructor stub
	}

	public Staff authentifier(String login, String password) {
		Staff utilisateur = null;
		Query query = entityManager.createQuery("select u from Staff u where u.login=:e and u.mdp=:p");
		query.setParameter("e", login).setParameter("p", password);
		try {
			utilisateur = (Staff) query.getSingleResult();
		} catch (Exception e) {
			Logger.getLogger(this.getClass().getName()).log(Level.WARNING, "authentication failed with login="+login+" and password="+password);
			utilisateur = null;
		
		}
		return utilisateur;
	}

	public boolean existeLogin(String login) {
		boolean exists = false;
		String jpql = "select case when (count(u) > 0)  then true else false end from Staff u where u.login=:login";
		Query query = entityManager.createQuery(jpql);
		query.setParameter("login", login);
		exists = (Boolean) query.getSingleResult();
		return exists;

	}
	@Override
	public boolean sauvegarderUtilisateur(Staff utilisateur) {
		entityManager.merge(utilisateur);
		return true;
	}

	public List<Staff> list() {
		return entityManager.createQuery("select e from Staff e ").getResultList();
	}

	@Override
	public Staff sauvegarderUtilisateur(boolean selected) {
		// TODO Auto-generated method stub
		return null;
	}



	

}
