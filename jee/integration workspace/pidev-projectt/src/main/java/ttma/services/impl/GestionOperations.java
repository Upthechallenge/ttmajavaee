package ttma.services.impl;



import java.util.HashMap;
import java.util.List;





import java.util.Map;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;









import ttma.Entities.Operation;

import ttma.services.Interfaces.*;



/**
 * Session Bean implementation class GestionProjet
 */
@Stateless
public class GestionOperations implements GestionOperationRemote, GestionOperationLocal {

    /**
     * Default constructor. 
     */
    public GestionOperations() {
        // TODO Auto-generated constructor stub
    }

    @PersistenceContext(unitName="pidev-project")	
    private EntityManager entityManager;

    @Override
	public Boolean addOperation(Operation hotel) {
		try {
			entityManager.persist(hotel);
			return true;
		} catch (Exception e) {
			return false;
		}
		
	}

	@Override
	public Boolean updateOperation(Operation hotel) {
		try {
			entityManager.merge(hotel);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	@Override
	public Boolean deleteOperation(Operation hotel) {
		try {
			entityManager.remove(entityManager.merge(hotel));
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	@Override
	public Operation findOperationById(Integer id) {
		Operation hotel=null;
		try {
			hotel=entityManager.find(Operation.class, id);
			
		} catch (Exception e) {
			
		}
		return hotel;
	}

	
	@Override
	public List<Operation> findAllOperations() {
		Query query=entityManager.createQuery("select h from Operation h");
		return query.getResultList();
	}

	@Override
	public List<Operation> listerOperationsbyname(String name) {
		
		Query query5 = entityManager.createQuery("SELECT e FROM Operation e WHERE type_Operation=:s");
		query5.setParameter("s",name);
		
		return query5.getResultList();
	
	}

	@Override
	public Operation findOperationByName(String name) {
		Operation hotel=null;
		try {
			hotel=entityManager.find(Operation.class,name);
			
		} catch (Exception e) {
			
		}
		return hotel;
	}

	@Override
	public List<Operation> listerOperationsbynameClnic(String name,
			String clinic) {
		Query query5 = entityManager.createQuery("SELECT e FROM Operation e WHERE type_Operation=:s and medicCenterNAme:=d");
		query5.setParameter("s",name);
		query5.setParameter("d",clinic);
		
		return query5.getResultList();
	}

	@Override
	public List<Operation> listerOperationsbynameClnicMIN(String name) {
		Query query5 = entityManager.createQuery("SELECT e FROM Operation e WHERE type_Operation=:s and price_Operation:=requete");
		query5.setParameter("s",name);
		query5.setParameter("requete","SELECT MIN(e.price_Operation)  FROM Operation e");
		
		
		return query5.getResultList();
		
	}

	@Override
	public List<Operation> listerOperationsbynameClnicMAX(String name) {
		Query query5 = entityManager.createQuery("SELECT e FROM Operation e WHERE type_Operation=:s");
		query5.setParameter("s",name);
		return query5.getResultList();
		
	}

	 
    
	
}
