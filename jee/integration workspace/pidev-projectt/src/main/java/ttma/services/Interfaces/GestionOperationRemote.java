package ttma.services.Interfaces;

import java.util.List;
import java.util.Map;

import javax.ejb.Remote;

import ttma.Entities.Doctor;
import ttma.Entities.Operation;



@Remote
public interface GestionOperationRemote {
	Boolean addOperation(Operation Doctor);
	Boolean updateOperation(Operation Doctor);
	Boolean deleteOperation(Operation Doctor);
	Operation findOperationById(Integer id);
	Operation findOperationByName(String name);
    List <Operation> findAllOperations();
    List <Operation> listerOperationsbyname(String name);
	//Map<String, List<E>> psychologistsPerSpecialty ();
    List <Operation> listerOperationsbynameClnic(String name,String clinic);
    List <Operation> listerOperationsbynameClnicMIN(String name);
    List <Operation> listerOperationsbynameClnicMAX(String name);
	 

}
