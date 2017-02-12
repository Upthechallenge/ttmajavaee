package ttma.client.delegate;


import java.util.List;

import ttma.Entities.*;
import ttma.services.Interfaces.AuthentificationServiceRemote;
import ttma.services.Interfaces.ManageRHRemote;
import ttma.client.locator.ServiceLocator;

public class AuthentificationDeleguate {
	private static String jndi="pidev-projectt/AuthentificationService!ttma.services.Interfaces.AuthentificationServiceRemote";
	public static AuthentificationServiceRemote getProxy()
	{
		return (AuthentificationServiceRemote) ServiceLocator.getInstance().getProxy(jndi);

	}
	
	
	
	public Staff authentifier(String login, String password){
		
		return getProxy().authentifier(login, password);
	}
	

	public boolean existeLogin(String login){
		 getProxy().existeLogin(login);
		 return true;
	}

public void sauvegarderUtilisateur(Staff utilisateur){
	 getProxy().sauvegarderUtilisateur(utilisateur);
}
	
	
	public List<Staff> list(){
		 return getProxy().list();
		
	}
	
	
	

	

}
