package ttma.client.delegate;

import java.util.List;

import ttma.Entities.DemandeConsultationEnLigne;
import ttma.Entities.Doctor;
import ttma.client.locator.ServiceLocator;
import ttma.services.Interfaces.GestionDemandeConsAppRemote;
import ttma.services.Interfaces.GestionDoctorRemote;


public class GestionDemandeConsDelegate {

	public static GestionDemandeConsAppRemote rremote;
	public static final String jndi="pidev-projectt/GestionDemandeCons!ttma.services.Interfaces.GestionDemandeConsAppRemote";
	private static GestionDemandeConsAppRemote getProxy(){
		return (GestionDemandeConsAppRemote) ServiceLocator.getInstance().getProxy(jndi);
		
	}
	
	
	public static List <DemandeConsultationEnLigne> dofindAlldemandes(){
		return getProxy().findAlldemandecons();
	}
	
}
