package ttma.services.Interfaces;

import java.util.List;

import javax.ejb.Remote;

import ttma.Entities.DoctorDisponibilities;
import ttma.Entities.OnlineConsultations;



@Remote
public interface GestionConsAppRemote {
	
	Boolean addcons(OnlineConsultations Doctor);
	Boolean updatecons(OnlineConsultations Doctor);
	Boolean deletecons(OnlineConsultations Doctor);
	//DoctorDisponibilities findDoctordispById(Integer id);
    List <OnlineConsultations> findAllcons();
  //  List <DoctorDisponibilities> listerDoctorsdispbyDate(String date);
    //public Long CountDoctors();
   

	 

}
