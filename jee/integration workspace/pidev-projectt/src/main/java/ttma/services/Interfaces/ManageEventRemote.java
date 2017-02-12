package ttma.services.Interfaces;

import java.util.List;

import javax.ejb.Remote;

import ttma.Entities.Evenement;



@Remote
public interface ManageEventRemote {

	Boolean addEvenement(Evenement evenement);

	Boolean updateEvenement(Evenement evenement);

	Boolean deleteEvenement(Evenement evenement);
	
	Evenement findByIdEvenement(int ID);

	List<Evenement> findAll();
	
	Long countEvenement()	 ;
	
	Long countParticipant();
	
	public Evenement getEvenementByLogin(String name);


	
}



