package ttma.services.Interfaces;

import java.util.List;




import javax.ejb.Local;

import ttma.Entities.Conge;
import ttma.Entities.Doctor;



@Local
public interface GestionCongeLocal {
	Boolean addConge(Conge con);
	Boolean updateConge(Conge con);
	Boolean deleteConge(Conge con);
	//Doctor findCongeById(Integer id);
    List <Conge> findAllConges();
    
   
	
}
