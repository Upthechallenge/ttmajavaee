package ttma.services.Interfaces;

import java.util.List;





import javax.ejb.Local;

import ttma.Entities.Doctor;
import ttma.Entities.DoctorDisponibilities;
import ttma.Entities.OnlineConsultations;



@Local
public interface GestionConsAppLocal {
	Boolean addcons(OnlineConsultations Doctor);
	Boolean updatecons(OnlineConsultations Doctor);
	Boolean deletecons(OnlineConsultations Doctor);
	//DoctorDisponibilities findDoctordispById(Integer id);
    List <OnlineConsultations> findAllcons();
  //  List <DoctorDisponibilities> listerDoctorsdispbyDate(String date);
    //public Long CountDoctors();
   
	
}
