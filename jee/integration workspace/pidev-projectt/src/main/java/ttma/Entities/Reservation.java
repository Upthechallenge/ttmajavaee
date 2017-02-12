package ttma.Entities;

import java.io.Serializable;
import java.lang.Integer;
import java.sql.Date;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Reservation
 *
 */
@Entity

public class Reservation implements Serializable {

	   
	
	private Integer id;
	private Date dateReserv;
	private static final long serialVersionUID = 1L;
	private User user;
	private Hotel hotel;
	
	private Boolean approvation;

	public Reservation() {
		super();
	}   

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}   
	public Date getDateReserv() {
		return this.dateReserv;
	}

	public void setDateReserv(Date dateReserv) {
		this.dateReserv = dateReserv;
	}
	@ManyToOne
	@JoinColumn(name="user")
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	@ManyToOne
	@JoinColumn(name="hotel")
	public Hotel getHotel() {
		return hotel;
	}
	public void setHotel(Hotel hotel) {
		this.hotel = hotel;
	}
	public Boolean getApprovation() {
		return approvation;
	}
	public void setApprovation(Boolean approvation) {
		this.approvation = approvation;
	}
   
}
