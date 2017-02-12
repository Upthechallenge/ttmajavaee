package ttma.services.Interfaces;

import java.util.List;
import javax.ejb.Remote;
import ttma.Entities.DoctorDisponibilities;



@Remote
public interface GestionDoctorDispRemote {
	
	Boolean addDoctordisp(DoctorDisponibilities Doctor);
	Boolean updateDoctordisp(DoctorDisponibilities Doctor);
	Boolean deleteDoctordisp(DoctorDisponibilities Doctor);
	DoctorDisponibilities findDoctordispById(Integer id);
    List <DoctorDisponibilities> findAllDoctorsdisp();
    List <DoctorDisponibilities> listerDoctorsdispbyDate(String date);

	 

}
