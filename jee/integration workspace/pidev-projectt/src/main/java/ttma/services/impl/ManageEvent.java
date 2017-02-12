package ttma.services.impl;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import ttma.Entities.Evenement;
import ttma.services.Interfaces.ManageEventLocal;
import ttma.services.Interfaces.ManageEventRemote;



/**
 * Session Bean implementation class ManageEvent
 */
@Stateless
public class ManageEvent implements ManageEventRemote, ManageEventLocal{
	@PersistenceContext(unitName="pidev-project")	
		private EntityManager em;

		    public ManageEvent() {
		    }

		    @Override
			public Boolean addEvenement(Evenement evenement) {
		    	try {
					em.persist(evenement);
					return true;
				} catch (Exception e) {
					return false;
				}
			}

			@Override
			public Boolean updateEvenement(Evenement evenement) {
				try {
					em.merge(evenement);
					return true;
				} catch (Exception e) {
					return false;
				}
			}

			@Override
			public Boolean deleteEvenement(Evenement evenement) {
				try {
					em.remove(em.merge(evenement));
					return true;
				} catch (Exception e) {
					return false;
				}
			}
			
			@Override
			public Evenement findByIdEvenement(int ID) {
				Evenement evenement=null;
				try {
					evenement=em.find(Evenement.class, ID);
					em.remove(em.merge(evenement));
				} catch (Exception e) {
					
				}
				return evenement;
		
			}

			

			@Override
			public List<Evenement> findAll() {
				Query query = em.createQuery("select a from Evenement a");
				return query.getResultList();
			}
            
			@Override
			public Long countEvenement() {
				
				Query query=em.createQuery("SELECT COUNT(h) FROM Evenement h ");
				Long count=(Long) query.getSingleResult();
				return count;
			}
			
			@Override
			public Long countParticipant() {
				
				Query query=em.createQuery("SELECT nbr_participants FROM Evenement where ID_event=1 ");
				Long count=(Long) query.getSingleResult();
				return count;
			}
			
			@Override
			public Evenement getEvenementByLogin(String name) {
				return null;
			}

			
			
			
		}
