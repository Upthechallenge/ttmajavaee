package ttma.services.Interfaces;

import java.util.List;

import javax.ejb.Remote;

import ttma.Entities.Conge;
import ttma.Entities.Doctor;



@Remote
public interface GestionCongeRemote {
	
	Boolean addConge(Conge con);
	Boolean updateConge(Conge con);
	Boolean deleteConge(Conge con);
	//Doctor findCongeById(Integer id);
    List <Conge> findAllConges();

	 

}
