package ttma.services.Interfaces;

import java.util.List;

import javax.ejb.Remote;

import ttma.Entities.Problem;




@Remote
public interface GestionProblemsRemote {
	Boolean addProblem (Problem problem);
	Boolean updateProblem (Problem problem);
	Boolean deleteProblem (Problem problem);
	Problem findProblemById(Integer id);
    List <Problem> findAllProblems();
    List <Problem> findAllProblemsById(Integer userid);
    Long countUnresolved();
    Long countResolved();
    List <Problem> findAllUnresolved();
    List <Problem> findAllResolved();

}
