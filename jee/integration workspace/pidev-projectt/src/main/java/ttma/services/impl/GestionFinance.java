package ttma.services.impl;


import java.util.List;

import ttma.services.Interfaces.*;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;







import ttma.Entities.Doctor;
import ttma.Entities.FinanceManagement;




/**
 * Session Bean implementation class GestionProjet
 */
@Stateless
public class GestionFinance implements GestionFinanceRemote, GestionFinanceLocal {

    /**
     * Default constructor. 
     */
    public GestionFinance() {
        // TODO Auto-generated constructor stub
    }

    @PersistenceContext(unitName="pidev-project")	
    private EntityManager entityManager;

    @Override
	public Boolean addFinance(FinanceManagement hotel) {
		try {
			entityManager.persist(hotel);
			return true;
		} catch (Exception e) {
			return false;
		}
		
	}

	@Override
	public Boolean updateFinance(FinanceManagement hotel) {
		try {
			entityManager.merge(hotel);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	@Override
	public Boolean deleteFinance(FinanceManagement hotel) {
		try {
			entityManager.remove(entityManager.merge(hotel));
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	
	@Override
	public List<FinanceManagement> findAllFinances() {
		Query query=entityManager.createQuery("select h from FinanceManagement h");
		return query.getResultList();
	}

	@Override
	public List<FinanceManagement>  listerFinancebyMois(String mois){
		Query query=entityManager.createQuery("select h.mois from financemanagement as h");
		return query.getResultList();
	}

	@Override
	public int CountFinance(String mois, String typeFinance) {
		
		 Query q2 = entityManager.createQuery("SELECT SUM(e.events) FROM financemanagement  e  ");
		// q2.setParameter("t",typeFinance);
		// q2.setParameter("m",mois);  
		 
		    int count = (int)q2.getSingleResult();
		    return count;
	}

	

	 
    
	
}
