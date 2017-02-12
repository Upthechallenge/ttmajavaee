package ttma.client.delegate;

import java.util.List;

import ttma.Entities.Hotel;
import ttma.client.locator.ServiceLocator;
import ttma.services.Interfaces.GestionHotelRemote;



public class GestionHotelDelegate {

	public static GestionHotelRemote rremote;
	public static final String jndi="pidev-projectt/GestionHotel!ttma.services.Interfaces.GestionHotelRemote";
	private static GestionHotelRemote getProxy(){
		return (GestionHotelRemote) ServiceLocator.getInstance().getProxy(jndi);
		
		
	}
	public static Boolean doaddHotel(Hotel hotel){
		return getProxy().addHotel(hotel);
	};
	public static Boolean doupdateHotel(Hotel hotel){
		return getProxy().updateHotel(hotel);
	};
	public static Boolean dodeleteHotel(Hotel hotel){
		return getProxy().deleteHotel(hotel);
	};
	public static Hotel dofindHotelById(Integer id){
		return getProxy().findHotelById(id);
	};
	public static List <Hotel> dofindAllHotels(){
		return getProxy().findAllHotels();
		
	};
}
