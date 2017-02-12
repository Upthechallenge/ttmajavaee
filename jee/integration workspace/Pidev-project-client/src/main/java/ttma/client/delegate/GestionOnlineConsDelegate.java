package ttma.client.delegate;

import java.util.List;

import ttma.Entities.Doctor;
import ttma.Entities.OnlineConsultations;
import ttma.client.locator.ServiceLocator;
import ttma.services.Interfaces.GestionConsAppRemote;
import ttma.services.Interfaces.GestionDoctorRemote;


public class GestionOnlineConsDelegate {

	public static GestionConsAppRemote rremote;
	public static final String jndi="pidev-projectt/GestionConsultationApp!ttma.services.Interfaces.GestionConsAppRemote";
	private static GestionConsAppRemote getProxy(){
		return (GestionConsAppRemote) ServiceLocator.getInstance().getProxy(jndi);
		
	}
	public static Boolean doaddCons(OnlineConsultations hotel){
		return getProxy().addcons(hotel);
	};
	public static Boolean doupdatecons(OnlineConsultations hotel){
		return getProxy().updatecons(hotel);
	};
	public static Boolean dodeletecons(OnlineConsultations hotel){
		return getProxy().deletecons(hotel);
	};
	
	public static List <OnlineConsultations> dofindAllCons(){
		return getProxy().findAllcons();
		
	};
	
}
