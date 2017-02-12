package ttma.services.impl;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import ttma.Entities.Publicity;
import ttma.services.Interfaces.PublicityServiceEjbRemote;
import ttma.services.Interfaces.PublicityServiceEjbLocal;


/**
 * Session Bean implementation class PublicityServiceEjb
 */
@Stateless
@LocalBean
public class PublicityServiceEjb implements PublicityServiceEjbRemote, PublicityServiceEjbLocal {


	@PersistenceContext(unitName ="pidev-project")
	private EntityManager em;
	
    /**
     * Default constructor. 
     */
    public PublicityServiceEjb() {
        // TODO Auto-generated constructor stub
    }
    
        	

        	@Override
        	public void addPublicity(Publicity Pub) {
        		em.persist(Pub);
        		
        	}

        	@Override
        	public void updatePublicity(Publicity Pub) {
        		em.merge(Pub);
        	}

        	@Override
        	public Publicity findByIdPublicity(int PublicityId) {
        		return em.find(Publicity.class, PublicityId);
        	}

        	@Override
        	public void deletePublicity(Publicity Pub) {
        		em.remove(em.merge(Pub));
        	}

        	@Override
        	public List<Publicity> findAll() {
        		Query query=em.createQuery("select a from Publicity a");
        		return query.getResultList();
        	}
        	
        	@Override
        	public Publicity getPublicityByLogin(String Title) {
        	    TypedQuery<Publicity> query = em.createQuery("SELECT c FROM Publicity c WHERE c.login = :PublicityTitle",
        	    		Publicity.class);
        	    return query.setParameter("PublicityTitle", Title).getSingleResult();
        	    
        	  } 

        }

