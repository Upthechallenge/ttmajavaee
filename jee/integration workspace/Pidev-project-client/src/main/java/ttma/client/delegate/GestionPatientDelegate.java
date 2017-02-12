package ttma.client.delegate;

import java.util.List;

import ttma.Entities.User;
import ttma.client.locator.ServiceLocator;
import ttma.services.Interfaces.GestionPatientRemote;



public class GestionPatientDelegate {
	
	public static GestionPatientRemote rremote;
	public static final String jndi="pidev-projectt/GestionPatient!ttma.services.Interfaces.GestionPatientRemote";
	private static GestionPatientRemote getProxy(){
		return (GestionPatientRemote) ServiceLocator.getInstance().getProxy(jndi);
		
		
	}
	public static Boolean doaddPatient(User hotel){
		return getProxy().addUser(hotel);
	};
	public static Boolean doupdatePatient(User hotel){
		return getProxy().updateUser(hotel);
	};
	public static Boolean dodeletePatient(User hotel){
		return getProxy().deleteUser(hotel);
	};
	public static User dofindPatientById(Integer id){
		return getProxy().findUserById(id);}
	public static List <User> dofindAllPatients(){
		return getProxy().findAllUsers();
	}

}
