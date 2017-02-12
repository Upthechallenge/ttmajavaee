package ttma.services.Interfaces;

import java.util.List;

import javax.ejb.Remote;



import ttma.Entities.MedicalCenters;

@Remote
public interface GestionMedicalCentersRemote {
	
	Boolean addMedicalCenters(MedicalCenters hotel);
	Boolean updateMedicalCenters(MedicalCenters hotel);
	Boolean deleteMedicalCenters(MedicalCenters hotel);
	MedicalCenters findMedicalCentersById(Integer id);
    List <MedicalCenters> findAllMedicalCenters();
    List <MedicalCenters> findAllMedicalCentersbyname();

}
