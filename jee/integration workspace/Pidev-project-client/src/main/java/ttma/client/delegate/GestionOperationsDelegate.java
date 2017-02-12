package ttma.client.delegate;

import java.util.List;

import ttma.Entities.Doctor;
import ttma.Entities.Operation;
import ttma.client.locator.ServiceLocator;
import ttma.services.Interfaces.GestionDoctorRemote;
import ttma.services.Interfaces.GestionOperationRemote;


public class GestionOperationsDelegate {

	public static GestionOperationRemote rremote;
	public static final String jndi="pidev-projectt/GestionOperations!ttma.services.Interfaces.GestionOperationRemote";
	private static GestionOperationRemote getProxy(){
		return (GestionOperationRemote) ServiceLocator.getInstance().getProxy(jndi);
		
	}
	public static Boolean doaddOperation(Operation hotel){
		return getProxy().addOperation(hotel);
	};
	public static Boolean doupdateOperation(Operation hotel){
		return getProxy().updateOperation(hotel);
	};
	public static Boolean dodeleteOperation(Operation hotel){
		return getProxy().deleteOperation(hotel);
	};
	public static Operation dofindOperationById(Integer id){
		return getProxy().findOperationById(id);
	};
	public static List <Operation> dofindAllOperation(){
		return getProxy().findAllOperations();
		
	};
	/*public static List <Doctor> dofindAllDoctorsbyname(){
		return getProxy().listerDoctorsbyname();
		
	};
	public static Integer countdocs() {
		return getProxy().CountDoctors();
		
	}
	

	
	public static List <Operation> dofindOperationByNAme(){
		return getProxy().findAllOperations();
		
	};
	*/
	public static  List <Operation> dofindOperationByNam(String name){
		return getProxy().listerOperationsbyname(name);
	};
	
	public static  List <Operation> dofindOperationByNameANDclinic(String name,String clinic){
		return getProxy().listerOperationsbynameClnic(name, clinic);
	};
	
	public static  List <Operation> dofindOperationByNamMIN(String name){
		return getProxy().listerOperationsbynameClnicMIN(name);
	};
	public static  List <Operation> dofindOperationByNamMAX(String name){
		return getProxy().listerOperationsbynameClnicMAX(name);
	};
	
}
