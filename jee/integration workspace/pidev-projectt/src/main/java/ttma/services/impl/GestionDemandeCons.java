package ttma.services.impl;


import java.util.List;

import ttma.services.Interfaces.*;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;




import ttma.Entities.DemandeConsultationEnLigne;
import ttma.Entities.Doctor;




/**
 * Session Bean implementation class GestionProjet
 */
@Stateless
public class GestionDemandeCons implements GestionDemandeConsAppLocal,GestionDemandeConsAppRemote{

    /**
     * Default constructor. 
     */
    public GestionDemandeCons() {
        // TODO Auto-generated constructor stub
    }

    @PersistenceContext(unitName="pidev-project")	
    private EntityManager entityManager;

   
	@Override
	public List<DemandeConsultationEnLigne> findAlldemandecons() {
		Query query=entityManager.createQuery("select h from DemandeConsultationEnLigne h");
		return query.getResultList();
	}

	

	 
    
	
}
