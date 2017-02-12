package ttma.services.impl;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import ttma.Entities.Hotel;
import ttma.services.Interfaces.GestionHotelLocal;
import ttma.services.Interfaces.GestionHotelRemote;



/**
 * Session Bean implementation class GestionHotel
 */
@Stateless
public class GestionHotel implements GestionHotelRemote, GestionHotelLocal {

@PersistenceContext(unitName="pidev-project")	
	EntityManager entityManager;

    /**
     * Default constructor. 
     */
    public GestionHotel() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public Boolean addHotel(Hotel hotel) {
		try {
			entityManager.persist(hotel);
			return true;
		} catch (Exception e) {
			return false;
		}
		
	}

	@Override
	public Boolean updateHotel(Hotel hotel) {
		try {
			entityManager.merge(hotel);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	@Override
	public Boolean deleteHotel(Hotel hotel) {
		try {
			entityManager.remove(entityManager.merge(hotel));
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	@Override
	public Hotel findHotelById(Integer id) {
		Hotel hotel=null;
		try {
			hotel=entityManager.find(Hotel.class, id);
			
		} catch (Exception e) {
			
		}
		return hotel;
	}

	
	@Override
	public List<Hotel> findAllHotels() {
		Query query=entityManager.createQuery("select h from Hotel h");
		return query.getResultList();
	}

}
