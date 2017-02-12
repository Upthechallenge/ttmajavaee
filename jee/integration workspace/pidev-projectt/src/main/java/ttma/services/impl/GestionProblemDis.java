package ttma.services.impl;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import ttma.Entities.Problem;
import ttma.Entities.ProblemDiscussion;
import ttma.services.Interfaces.GestionProblemDisLocal;
import ttma.services.Interfaces.GestionProblemDisRemote;



/**
 * Session Bean implementation class GestionProblemDis
 */
@Stateless
@LocalBean
public class GestionProblemDis implements GestionProblemDisRemote, GestionProblemDisLocal {

	@PersistenceContext(unitName="pidev-project")	
	EntityManager entityManager;
    /**
     * Default constructor. 
     */
    public GestionProblemDis() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public Boolean addProblemDiscussion(ProblemDiscussion hotel) {
		try {
			entityManager.persist(hotel);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	@Override
	public Boolean updateProblemDiscussion(ProblemDiscussion hotel) {
		try {
			entityManager.merge(hotel);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	@Override
	public Boolean deleteProblemDiscussion(ProblemDiscussion hotel) {
		try {
			entityManager.remove(entityManager.merge(hotel));
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	@Override
	public ProblemDiscussion findProblemDiscussionById(Integer id) {
		ProblemDiscussion hotel=null;
		try {
			hotel=entityManager.find(ProblemDiscussion.class, id);
			
		} catch (Exception e) {
			
		}
		return hotel;	}

	@Override
	public List<ProblemDiscussion> findAllProblemDiscussion() {
		Query query=entityManager.createQuery("select h from ProblemDiscussion h");
		return query.getResultList();
	}

	@Override
	public List <ProblemDiscussion> findAllProblemsById(Problem userid)  {
		Query query=entityManager.createQuery("select h from ProblemDiscussion h WHERE h.problem LIKE :problem").setParameter("problem", userid);
		return query.getResultList();
	}
	
	


}
