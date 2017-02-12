package ttma.client.delegate;

import java.util.List;

import ttma.Entities.Conge;
import ttma.client.locator.ServiceLocator;
import ttma.services.Interfaces.*;


public class GestionCongeDelegate {

	public static GestionCongeRemote rremote;
	public static final String jndi="pidev-projectt/GestionConge!ttma.services.Interfaces.GestionCongeRemote";
	//public static final String jndi="pidev-project/GestionDoctor!ttma.services.Interfaces.GestionDoctorRemote";
	private static  GestionCongeRemote getProxy(){
		return ( GestionCongeRemote) ServiceLocator.getInstance().getProxy(jndi);
		
	}
	public static Boolean doaddConge(Conge hotel){
		return getProxy().addConge(hotel);
	};
	public static Boolean doupdateConge(Conge hotel){
		return getProxy().updateConge(hotel);
	};
	public static Boolean dodeleteConge(Conge hotel){
		return getProxy().deleteConge(hotel);
	};
	
	public static List <Conge> dofindAllConges(){
		return getProxy().findAllConges();
		
	};
	
}
