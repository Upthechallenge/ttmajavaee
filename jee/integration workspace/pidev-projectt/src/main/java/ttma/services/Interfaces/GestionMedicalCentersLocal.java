package ttma.services.Interfaces;

import java.util.List;

import javax.ejb.Local;



import ttma.Entities.MedicalCenters;

@Local
public interface GestionMedicalCentersLocal {
	
	Boolean addMedicalCenters(MedicalCenters hotel);
	Boolean updateMedicalCenters(MedicalCenters hotel);
	Boolean deleteMedicalCenters(MedicalCenters hotel);
	MedicalCenters findMedicalCentersById(Integer id);
    List <MedicalCenters> findAllMedicalCenters();
    List <MedicalCenters> findAllMedicalCentersbyname();

}
