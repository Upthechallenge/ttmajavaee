package ttma.services.Interfaces;


import java.util.List;





import javax.ejb.Local;

import ttma.Entities.*;



@Local
public interface GestionOperationLocal {
	Boolean addOperation(Operation Doctor);
	Boolean updateOperation(Operation Doctor);
	Boolean deleteOperation(Operation Doctor);
	Operation findOperationById(Integer id);
	Operation findOperationByName(String name);
    List <Operation> findAllOperations();
    List <Operation> listerOperationsbyname(String name);
    List <Operation> listerOperationsbynameClnic(String name,String clinic);
    List <Operation> listerOperationsbynameClnicMIN(String name);
    List <Operation> listerOperationsbynameClnicMAX(String name);
	
}
