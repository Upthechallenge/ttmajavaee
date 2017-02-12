package ttma.services.impl;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import ttma.Entities.Problem;
import ttma.services.Interfaces.GestionProblemsLocal;
import ttma.services.Interfaces.GestionProblemsRemote;



/**
 * Session Bean implementation class GestionProblems
 */
@Stateless
public class GestionProblems implements GestionProblemsRemote, GestionProblemsLocal {
	
	@PersistenceContext(unitName="pidev-project")	
	EntityManager entityManager;
    /**
     * Default constructor. 
     */
    public GestionProblems() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public Boolean addProblem(Problem problem) {
		try {
			entityManager.persist(problem);
			return true;
		} catch (Exception e) {
			return false;
		}
		
	}

	@Override
	public Boolean updateProblem(Problem problem) {
		try {
			entityManager.merge(problem);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	@Override
	public Boolean deleteProblem(Problem problem) {
		try {
			entityManager.remove(entityManager.merge(problem));
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	@Override
	public Problem findProblemById(Integer id) {
		Problem problem=null;
		try {
			problem=entityManager.find(Problem.class, id);
			
		} catch (Exception e) {
			
		}
		return problem;
	}

	@Override
	public List<Problem> findAllProblems() {
		Query query=entityManager.createQuery("select h from Problem h");
		return query.getResultList();
	}

	@Override
	public List<Problem> findAllProblemsById(Integer userid) {
		Query query=entityManager.createQuery("select h from Problem h WHERE h.user LIKE :userid").setParameter("userid", userid);
		return query.getResultList();
	}

	@Override
	public Long countUnresolved() {
		
		Query query=entityManager.createQuery("SELECT COUNT(h.resolved)  FROM Problem h WHERE h.resolved=FALSE");
		Long count= (Long) query.getSingleResult();
		return count;
	}

	@Override
	public Long countResolved() {
		
		Query query=entityManager.createQuery("SELECT COUNT(h.resolved) FROM Problem h WHERE h.resolved=TRUE");
		Long count=(Long) query.getSingleResult();
		return count;
	}

	@Override
	public List<Problem> findAllUnresolved() {
		Query query=entityManager.createQuery("select h from Problem h WHERE h.resolved=FALSE");
		return query.getResultList();
	}

	@Override
	public List<Problem> findAllResolved() {
		Query query=entityManager.createQuery("select h from Problem h WHERE h.resolved=TRUE");
		return query.getResultList();
	}

}
