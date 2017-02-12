package ttma.services.Interfaces;

import java.util.List;

import javax.ejb.Local;

import ttma.Entities.Evenement;



@Local
public interface ManageEventLocal {
	List<Evenement> findAll();


	Long countEvenement();

}
