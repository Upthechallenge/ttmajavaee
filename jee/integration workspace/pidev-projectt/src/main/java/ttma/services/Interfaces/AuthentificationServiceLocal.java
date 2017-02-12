package ttma.services.Interfaces;

import java.util.List;

import javax.ejb.Local;

import ttma.Entities.*;

@Local
public interface AuthentificationServiceLocal {
	public Staff authentifier(String login, String pwd);

	public boolean existeLogin(String login);

	public boolean sauvegarderUtilisateur(Staff utilisateur);
	
	List<Staff> list();
}
