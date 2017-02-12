package ttma.services.Interfaces;

import java.util.List;

import javax.ejb.Remote;

import ttma.Entities.TransportCompagnie;




/**
 * Declaration des methodes associées a une compagnie
 * 
 * @author AminPc
 *
 */
@Remote
public interface TransportCompagnieServiceEjbRemote {

	/**
	 * cette methode permet d'ajouter un nouveau TransportCompagnie
	 * 
	 * @param admin
	 */
	public void addTransportCompagnie(TransportCompagnie transport);

	/**
	 * cette methode permet de modifier un TransportCompagnie
	 * 
	 * @param admin
	 */
	public void updateTransportCompagnie(TransportCompagnie transport);

	/**
	 * cette methode permet de chercher une Compagie en utilisant l'Id
	 * 
	 * @param idAdmin
	 * @return Administrator
	 */
	public TransportCompagnie findByIdTransport(int id);

	/**
	 * cette methode permet de supprimer une Compagnie
	 * 
	 * @param admin
	 */
	public void deleteTransportCompagnie(TransportCompagnie transport);
	
	public List<TransportCompagnie> findAll();
	
	public TransportCompagnie getTransportCompagnieByLogin(String name);
	public List<TransportCompagnie> listerTransportCompagnieByCategory(String category);
	
}

