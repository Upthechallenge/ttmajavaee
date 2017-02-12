package ttma.services.Interfaces;

import java.util.List;

import javax.ejb.Local;

import ttma.Entities.Hotel;



@Local
public interface GestionHotelLocal {
	
	Boolean addHotel(Hotel hotel);
	Boolean updateHotel(Hotel hotel);
	Boolean deleteHotel(Hotel hotel);
    Hotel findHotelById(Integer id);
    List <Hotel> findAllHotels();

}
