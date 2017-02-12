package ttma.services.impl;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import ttma.Entities.Operation;
import ttma.Entities.TransportCompagnie;
import ttma.services.Interfaces.TransportCompagnieServiceEjbRemote;
import ttma.services.Interfaces.TransportCompagnieServiceEjbLocal;


/**
 * Session Bean implementation class TransportCompagnieServiceEjb
 */
@Stateless
@LocalBean
public class TransportCompagnieServiceEjb implements TransportCompagnieServiceEjbRemote,
TransportCompagnieServiceEjbLocal  {

	@PersistenceContext(unitName = "pidev-project")
	private EntityManager em;
	
     	/**
    	 * Default constructor.
    	 */
    	public TransportCompagnieServiceEjb() {
    		// TODO Auto-generated constructor stub
    	}

    	@Override
    	public void addTransportCompagnie(TransportCompagnie transport) {
    		em.persist(transport);
    		
    	}

    	@Override
    	public void updateTransportCompagnie(TransportCompagnie transport) {
    		em.merge(transport);
    	}

    	@Override
    	public TransportCompagnie findByIdTransport(int CompanyId) {
    		return em.find(TransportCompagnie.class, CompanyId);
    	}

    	@Override
    	public void deleteTransportCompagnie(TransportCompagnie transport) {
    		em.remove(em.merge(transport));
    	}

    	@Override
    	public List<TransportCompagnie> findAll() {
    		Query query=em.createQuery("select a from TransportCompagnie a");
    		return query.getResultList();
    	}
    	
    	@Override
    	public TransportCompagnie getTransportCompagnieByLogin(String name) {
    	    TypedQuery<TransportCompagnie> query = em.createQuery("SELECT c FROM TransportCompagnie c WHERE c.login = :CompanyName", TransportCompagnie.class);
    	    return query.setParameter("CompanyName", name).getSingleResult();
    	    
    	  } 
    	
    	@Override
    	public List<TransportCompagnie> listerTransportCompagnieByCategory(String category) {
    		Query query5 = em.createQuery("SELECT e FROM TransportCompagnie e WHERE CompanyCategory=:s");
    		query5.setParameter("s",category);
    		return query5.getResultList();
    		
    	}

    }

