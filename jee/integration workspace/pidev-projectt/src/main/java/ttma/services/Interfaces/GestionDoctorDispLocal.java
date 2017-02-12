package ttma.services.Interfaces;

import java.util.List;




import javax.ejb.Local;

import ttma.Entities.Doctor;
import ttma.Entities.DoctorDisponibilities;



@Local
public interface GestionDoctorDispLocal {
	Boolean addDoctordisp(DoctorDisponibilities Doctor);
	Boolean updateDoctordisp(DoctorDisponibilities Doctor);
	Boolean deleteDoctordisp(DoctorDisponibilities Doctor);
	DoctorDisponibilities findDoctordispById(Integer id);
    List <DoctorDisponibilities> findAllDoctorsdisp();
    List <DoctorDisponibilities> listerDoctorsdispbyDate(String date);
    //public Long CountDoctors();
   
	
}
