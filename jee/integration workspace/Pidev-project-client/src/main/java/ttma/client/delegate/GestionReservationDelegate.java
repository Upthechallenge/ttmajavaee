package ttma.client.delegate;

import java.util.List;

import ttma.Entities.Reservation;
import ttma.client.locator.ServiceLocator;
import ttma.services.Interfaces.GestionReservationRemote;



public class GestionReservationDelegate {
	
	
	public static GestionReservationRemote rremote;
	public static final String jndi="pidev-projectt/GestionReservation!ttma.services.Interfaces.GestionReservationRemote";
	private static GestionReservationRemote getProxy(){
		return (GestionReservationRemote) ServiceLocator.getInstance().getProxy(jndi);
		
		
	}
	
	public static Boolean doaddReservation(Reservation hotel){
		return getProxy().addReservation(hotel);
	};
	/*public static Boolean doupdateProblemDiscussion(ProblemDiscussion hotel){
		return getProxy().updateProblemDiscussion(hotel);
	};*/
	public static Boolean dodeleteReservation(Reservation hotel){
		return getProxy().deleteReservation(hotel);
	};
	
	public static List <Reservation> dofindAllReservations(){
		return getProxy().findAllReservations();
	};
	public static Boolean doupdateReservation(Reservation hotel){
		return getProxy().updateReservation(hotel);
	};

}
