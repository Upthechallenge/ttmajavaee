package ttma.services.Interfaces;

import java.util.List;

import javax.ejb.Remote;



import ttma.Entities.Timetable;



@Remote
public interface GestionEmploiRemote {
	
	Boolean addTimetable(Timetable con);
	Boolean updateTimetable(Timetable con);
	Boolean deleteTimetable(Timetable con);
	//Doctor findCongeById(Integer id);
    List <Timetable> findAllTimetable();

	 

}
