package ttma.client.delegate;

import java.util.List;


import ttma.Entities.Timetable;
import ttma.client.locator.ServiceLocator;
import ttma.services.Interfaces.*;


public class GestionEmploiDelegate {

	public static GestionEmploiRemote rremote;
	public static final String jndi="pidev-projectt/GestionEmploi!ttma.services.Interfaces.GestionEmploiRemote";
	
	private static  GestionEmploiRemote getProxy(){
		return ( GestionEmploiRemote) ServiceLocator.getInstance().getProxy(jndi);
		
	}
	public static Boolean doaddTimetable(Timetable hotel){
		return getProxy().addTimetable(hotel);
	};
	public static Boolean doupdateTimetable(Timetable hotel){
		return getProxy().updateTimetable(hotel);
	};
	public static Boolean dodeleteTimetable(Timetable hotel){
		return getProxy().deleteTimetable(hotel);
	};
	
	public static List <Timetable> dofindAllTimetable(){
		return getProxy().findAllTimetable();
		
	};
	
}
