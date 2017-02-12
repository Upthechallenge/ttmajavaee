package ttma.services.Interfaces;

import java.util.List;

import javax.ejb.Local;

import ttma.Entities.Problem;



@Local
public interface GestionProblemsLocal {
	
	Boolean addProblem (Problem problem);
	Boolean updateProblem (Problem problem);
	Boolean deleteProblem (Problem problem);
	Problem findProblemById(Integer id);
    List <Problem> findAllProblems();
    List <Problem> findAllProblemsById(Integer userid);
    Long countUnresolved();
    Long countResolved();

}
