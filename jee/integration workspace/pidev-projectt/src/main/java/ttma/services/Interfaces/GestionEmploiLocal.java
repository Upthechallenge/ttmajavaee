package ttma.services.Interfaces;

import java.util.List;





import javax.ejb.Local;

import ttma.Entities.Conge;
import ttma.Entities.Doctor;
import ttma.Entities.Timetable;



@Local
public interface GestionEmploiLocal {
	
	Boolean updateTimetable(Timetable con);
	Boolean deleteTimetable(Timetable con);
	//Doctor findCongeById(Integer id);
    List <Timetable> findAllTimetable();
	Boolean addTimetable(Timetable hotel);
    
   
	
}
