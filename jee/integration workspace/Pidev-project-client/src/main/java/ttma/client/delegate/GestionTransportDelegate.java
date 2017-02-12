package ttma.client.delegate;

import java.util.List;

import ttma.Entities.Operation;
import ttma.Entities.TransportCompagnie;
import ttma.client.locator.ServiceLocator;
import ttma.services.Interfaces.TransportCompagnieServiceEjbRemote;


public class GestionTransportDelegate {
	public static TransportCompagnieServiceEjbRemote remote;
	public static final String jndi="pidev-projectt/TransportCompagnieServiceEjb!ttma.services.Interfaces.TransportCompagnieServiceEjbRemote";
	private static TransportCompagnieServiceEjbRemote getProxy(){
		return (TransportCompagnieServiceEjbRemote) ServiceLocator.getInstance().getProxy(jndi);
		
	}
	public static void doaddTransportCompagnie(TransportCompagnie transport){
		getProxy().addTransportCompagnie(transport);
	};
	public static void doupdateTransportCompagnie(TransportCompagnie transport){
		 getProxy().updateTransportCompagnie(transport);
	};
	public static void dodeleteTransportCompagnie(TransportCompagnie transport){
		 getProxy().deleteTransportCompagnie(transport);
	};
	public static TransportCompagnie dofindTransportCompagnieById(Integer id){
		return getProxy().findByIdTransport(id);
	};
	public static List <TransportCompagnie> dofindAllTransportCompagnie(){
		return getProxy().findAll();
		}
	public static  List <TransportCompagnie> dofindTransportCompagnieByCategory(String category){
		return getProxy().listerTransportCompagnieByCategory(category);
	};
}
