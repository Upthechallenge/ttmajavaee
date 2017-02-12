package ttma.services.Interfaces;

import java.util.List;

import javax.ejb.Remote;

import ttma.Entities.Doctor;



@Remote
public interface GestionDoctorRemote {
	
	Boolean addDoctor(Doctor Doctor);
	Boolean updateDoctor(Doctor Doctor);
	Boolean deleteDoctor(Doctor Doctor);
	Doctor findDoctorById(Integer id);
    List <Doctor> findAllDoctors();
    List <Doctor> listerDoctorsbyname();
	public Long CountDoctors();

	 

}
