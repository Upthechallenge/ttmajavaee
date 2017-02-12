package ttma.services.Interfaces;

import java.util.List;






import javax.ejb.Local;

import ttma.Entities.DemandeConsultationEnLigne;
import ttma.Entities.Doctor;
import ttma.Entities.DoctorDisponibilities;
import ttma.Entities.OnlineConsultations;



@Local
public interface GestionDemandeConsAppLocal {

    List <DemandeConsultationEnLigne> findAlldemandecons();
  
   
	
}
