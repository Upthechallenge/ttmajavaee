package ttma.services.Interfaces;

import java.util.List;

import javax.ejb.Remote;

import ttma.Entities.Hotel;



@Remote
public interface GestionHotelRemote {
	
	Boolean addHotel(Hotel hotel);
	Boolean updateHotel(Hotel hotel);
	Boolean deleteHotel(Hotel hotel);
    Hotel findHotelById(Integer id);
    List <Hotel> findAllHotels();
}
