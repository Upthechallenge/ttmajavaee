package ttma.services.Interfaces;

import java.util.List;

import javax.ejb.Remote;

import ttma.Entities.*;

@Remote
public interface AuthentificationServiceRemote {
	
	public Staff authentifier(String login, String password);
	
	public boolean existeLogin(String login);
	
	public boolean sauvegarderUtilisateur(Staff utilisateur);
	
	
	public List<Staff> list();

	public Staff sauvegarderUtilisateur(boolean selected);

	
}
