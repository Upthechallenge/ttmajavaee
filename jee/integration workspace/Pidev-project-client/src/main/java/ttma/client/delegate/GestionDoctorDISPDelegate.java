package ttma.client.delegate;

import java.util.List;

import ttma.Entities.Doctor;
import ttma.Entities.DoctorDisponibilities;
import ttma.client.locator.ServiceLocator;
import ttma.services.Interfaces.GestionDoctorDispRemote;
import ttma.services.Interfaces.GestionDoctorRemote;


public class GestionDoctorDISPDelegate {

	public static GestionDoctorDispRemote rremote;
	public static final String jndi="pidev-projectt/GestionDoctotDisp!ttma.services.Interfaces.GestionDoctorDispRemote";
	private static GestionDoctorDispRemote  getProxy(){
		return (GestionDoctorDispRemote ) ServiceLocator.getInstance().getProxy(jndi);
		
	}
	public static Boolean doaddDoctordisp(DoctorDisponibilities hotel){
		return getProxy().addDoctordisp(hotel);
	};
	public static Boolean doupdateDoctordisp(DoctorDisponibilities hotel){
		return getProxy().updateDoctordisp(hotel);
	};
	public static Boolean dodeleteDoctordisp(DoctorDisponibilities hotel){
		return getProxy().deleteDoctordisp(hotel);
	};
	
	public static List <DoctorDisponibilities> dofindAllDoctorsdisp(){
		return getProxy().findAllDoctorsdisp();
		
	};
	public static List <DoctorDisponibilities> dofindAllDoctorsdispbydate(String date){
		return getProxy().listerDoctorsdispbyDate(date);
		
	};
	
}
