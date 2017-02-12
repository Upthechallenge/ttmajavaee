package ttma.client.delegate;

import java.util.List;

import ttma.Entities.Problem;
import ttma.Entities.ProblemDiscussion;
import ttma.client.locator.ServiceLocator;
import ttma.services.Interfaces.GestionProblemDisRemote;



public class GestionProblemDisDelegate {
	
	public static GestionProblemDisRemote rremote;
	public static final String jndi="pidev-projectt/GestionProblemDis!ttma.services.Interfaces.GestionProblemDisRemote";
	private static GestionProblemDisRemote getProxy(){
		return (GestionProblemDisRemote) ServiceLocator.getInstance().getProxy(jndi);
		
		
	}
	public static Boolean doaddProblem(ProblemDiscussion hotel){
		return getProxy().addProblemDiscussion(hotel);
	};
	public static Boolean doupdateProblemDiscussion(ProblemDiscussion hotel){
		return getProxy().updateProblemDiscussion(hotel);
	};
	public static Boolean dodeleteHotel(ProblemDiscussion hotel){
		return getProxy().deleteProblemDiscussion(hotel);
	};
	public static List <ProblemDiscussion> dofindProblemDiscussionById(Problem id){
		return  getProxy().findAllProblemsById(id);
	};
	public static List <ProblemDiscussion> dofindAllProblemDiscussion(){
		return getProxy().findAllProblemDiscussion();
	};


}
