package ttma.client.delegate;

import java.util.List;

import ttma.Entities.MedicalCenters;
import ttma.client.locator.ServiceLocator;
import ttma.services.Interfaces.*;


public class GestionMedicalCentersDelegate {

	public static GestionMedicalCentersRemote rremote;
	public static final String jndi="pidev-projectt/GestionMedicalCenters!ttma.services.Interfaces.GestionMedicalCentersRemote";
	private static GestionMedicalCentersRemote getProxy(){
		return (GestionMedicalCentersRemote) ServiceLocator.getInstance().getProxy(jndi);
		
	}
	public static Boolean doaddMedicalCenters(MedicalCenters hotel){
		return getProxy().addMedicalCenters(hotel);
	};
	public static Boolean doupdateMedicalCenters(MedicalCenters hotel){
		return getProxy().updateMedicalCenters(hotel);
	};
	public static Boolean dodeleteMedicalCenters(MedicalCenters hotel){
		return getProxy().deleteMedicalCenters(hotel);
	};
	public static MedicalCenters dofinMedicalCentersById(Integer id){
		return getProxy().findMedicalCentersById(id);
	};
	public static List <MedicalCenters> dofindAllMedicalCenters(){
		return getProxy().findAllMedicalCenters();}
		
		public static List <MedicalCenters> dofindAllMedicalCentersbyName(){
			return getProxy().findAllMedicalCentersbyname();
		
	};
	
		

}
