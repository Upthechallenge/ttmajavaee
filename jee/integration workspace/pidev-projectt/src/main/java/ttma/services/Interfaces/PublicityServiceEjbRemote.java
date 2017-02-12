package ttma.services.Interfaces;

import java.util.List;

import javax.ejb.Remote;

import ttma.Entities.Publicity;



@Remote
public interface PublicityServiceEjbRemote {


	/**
	 * cette methode permet d'ajouter un nouveau pub
	 * 
	 * @param admin
	 */
	public void addPublicity(Publicity Pub);

	/**
	 * cette methode permet de modifier un TransportCompagnie
	 * 
	 * @param admin
	 */
	public void updatePublicity(Publicity Pub);

	/**
	 * cette methode permet de chercher une Compagie en utilisant l'Id
	 * 
	 * @param idAdmin
	 * @return Administrator
	 */
	public Publicity findByIdPublicity(int id);

	/**
	 * cette methode permet de supprimer une Compagnie
	 * 
	 * @param admin
	 */
	public void deletePublicity(Publicity Pub);
	
	public List<Publicity> findAll();
	
	public Publicity getPublicityByLogin(String title);
	
}


