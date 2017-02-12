package ttma.services.Interfaces;

import java.util.List;

import javax.ejb.Remote;

import ttma.Entities.Problem;
import ttma.Entities.ProblemDiscussion;



@Remote
public interface GestionProblemDisRemote {
	
	Boolean addProblemDiscussion(ProblemDiscussion hotel);
	Boolean updateProblemDiscussion(ProblemDiscussion hotel);
	Boolean deleteProblemDiscussion(ProblemDiscussion hotel);
	ProblemDiscussion findProblemDiscussionById(Integer id);
    List <ProblemDiscussion> findAllProblemDiscussion();
    List <ProblemDiscussion> findAllProblemsById(Problem userid);

}
