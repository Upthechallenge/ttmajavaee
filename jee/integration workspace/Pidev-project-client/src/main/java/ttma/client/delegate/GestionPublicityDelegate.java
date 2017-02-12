package ttma.client.delegate;

import java.util.List;

import ttma.Entities.Publicity;
import ttma.client.locator.ServiceLocator;
import ttma.services.Interfaces.PublicityServiceEjbRemote;



public class GestionPublicityDelegate {
	public static PublicityServiceEjbRemote remote;
	public static final String jndi="pidev-projectt/PublicityServiceEjb!ttma.services.Interfaces.PublicityServiceEjbRemote";
	private static PublicityServiceEjbRemote getProxy(){
		return (PublicityServiceEjbRemote) ServiceLocator.getInstance().getProxy(jndi);
		
	}
	public static void doaddPublicity(Publicity Pub){
		getProxy().addPublicity(Pub);
	};
	public static void doupdateTransportCompagnie(Publicity Pub){
		 getProxy().updatePublicity(Pub);
	};
	public static void dodeletePublicity(Publicity Pub){
		 getProxy().deletePublicity(Pub);
	};
	public static Publicity dofindPublicityById(Integer id){
		return getProxy().findByIdPublicity(id);
	};
	public static List <Publicity> dofindAllPublicity(){
		return getProxy().findAll();
	}

}
