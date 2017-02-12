package ttma.client.delegate;

import java.util.List;

import ttma.Entities.Doctor;
import ttma.client.locator.ServiceLocator;
import ttma.services.Interfaces.GestionDoctorRemote;


public class GestionDoctorDelegate {

	public static GestionDoctorRemote rremote;
	public static final String jndi="pidev-projectt/GestionDoctor!ttma.services.Interfaces.GestionDoctorRemote";
	private static GestionDoctorRemote getProxy(){
		return (GestionDoctorRemote) ServiceLocator.getInstance().getProxy(jndi);
		
	}
	public static Boolean doaddDoctor(Doctor hotel){
		return getProxy().addDoctor(hotel);
	};
	public static Boolean doupdateDoctor(Doctor hotel){
		return getProxy().updateDoctor(hotel);
	};
	public static Boolean dodeleteDoctor(Doctor hotel){
		return getProxy().deleteDoctor(hotel);
	};
	public static Doctor dofindDoctorById(Integer id){
		return getProxy().findDoctorById(id);
	};
	public static List <Doctor> dofindAllDoctors(){
		return getProxy().findAllDoctors();
		
	};
	public static List <Doctor> dofindAllDoctorsbyname(){
		return getProxy().listerDoctorsbyname();
		
	};
	public static Long countdocs() {
		return getProxy().CountDoctors();
		
	}
}
