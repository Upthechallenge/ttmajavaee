package ttma.client.delegate;

import java.util.List;

import ttma.Entities.Evenement;
import ttma.client.locator.ServiceLocator;
import ttma.services.Interfaces.ManageEventRemote;




public class EventDelegate {
	private static String jndiName ="pidev-projectt/ManageEvent!ttma.services.Interfaces.ManageEventRemote";

	public static ManageEventRemote getProxy() {

		return (ManageEventRemote) ServiceLocator.getInstance().getProxy(jndiName);
				
	}
	
	public static Boolean doaddEvenement(Evenement evenement){
		return getProxy().addEvenement(evenement);
	}
	public static  Evenement findByIdEvenement(int ID){
		return getProxy().findByIdEvenement(ID);
	}

	public static Boolean deleteEvenement(Evenement evenement){
		return getProxy().deleteEvenement(evenement);
	}
	public static Boolean updateEvenement(Evenement evenement){
		return getProxy().updateEvenement(evenement);
	}
	
	public static List<Evenement> findAll(){
		return getProxy().findAll();
	}
    
	public static Long countEvenement(){
		return getProxy().countEvenement();
		
	}
	
	public static Long countParticipant(){
		return getProxy().countParticipant();
	}
}
