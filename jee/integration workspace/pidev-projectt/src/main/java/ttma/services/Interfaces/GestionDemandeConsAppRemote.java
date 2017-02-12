package ttma.services.Interfaces;

import java.util.List;

import javax.ejb.Remote;

import ttma.Entities.DemandeConsultationEnLigne;
import ttma.Entities.DoctorDisponibilities;
import ttma.Entities.OnlineConsultations;



@Remote
public interface GestionDemandeConsAppRemote {
	
	 List <DemandeConsultationEnLigne>  findAlldemandecons();
   

	 

}
