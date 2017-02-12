package ttma.client.delegate;

import java.util.List;

import ttma.Entities.Problem;
import ttma.client.locator.ServiceLocator;
import ttma.services.Interfaces.GestionProblemsRemote;



public class GestionProblemDelegate {
	
	public static GestionProblemsRemote rremote;
	public static final String jndi="pidev-projectt/GestionProblems!ttma.services.Interfaces.GestionProblemsRemote";
	private static GestionProblemsRemote getProxy(){
		return (GestionProblemsRemote) ServiceLocator.getInstance().getProxy(jndi);
		
		
	}
	public static Boolean doaddProblem(Problem hotel){
		return getProxy().addProblem(hotel);
	};
	public static Boolean doupdateHotel(Problem hotel){
		return getProxy().updateProblem(hotel);
	};
	public static Boolean dodeleteHotel(Problem hotel){
		return getProxy().deleteProblem(hotel);
	};
	public static Problem dofindProblemById(Integer id){
		return getProxy().findProblemById(id);
	};
	public static List <Problem> dofindAllProblems(){
		return getProxy().findAllProblems();
	};
	public static Long dofindUnresolved(){
		return getProxy().countUnresolved();
	};
	public static Long dofindResolved(){
		return getProxy().countResolved();
	};
	public static List <Problem> dofindAllUnresolved(){
		return getProxy().findAllUnresolved();
	};
	public static List <Problem> dofindAllResolved(){
		return getProxy().findAllResolved();
	};

}
