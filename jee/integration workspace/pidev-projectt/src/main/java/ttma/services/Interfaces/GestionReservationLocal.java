package ttma.services.Interfaces;

import java.util.List;

import javax.ejb.Local;

import ttma.Entities.Reservation;



@Local
public interface GestionReservationLocal {
	
	Boolean addReservation (Reservation problem);
	Boolean updateReservation (Reservation problem);
	Boolean deleteReservation (Reservation problem);
	Reservation findReservationById(Integer id);
    List <Reservation> findAllReservations();
    List <Reservation> findAllReservationsById(Integer userid);
  

}
