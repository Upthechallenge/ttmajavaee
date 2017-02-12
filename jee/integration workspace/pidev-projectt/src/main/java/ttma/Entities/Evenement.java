package ttma.Entities;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;

import java.awt.TextArea;
import java.io.Serializable;
import java.lang.String;
import java.util.Date;


/**
 * Entity implementation class for Entity: Evenement
 *
 */
@Entity

public class Evenement implements Serializable {

	   
	
	private int ID_event;
	private String name_event;
	private String place_event;
	private Date date_event;
	//private Integer doctor_id;
	private String program;
	private Integer nbr_participants;
	
	private Integer nbr_de_places;
	
	public Integer getNbr_de_places() {
		return nbr_de_places;
	}
	public void setNbr_de_places(Integer nbr_de_places) {
		this.nbr_de_places = nbr_de_places;
	}
	private float price;
	//private Integer patient_id;
	private byte[] image;
	private static final long serialVersionUID = 1L;

	public Evenement() {
		super();
	}   
	@Id
	@GeneratedValue (strategy=GenerationType.IDENTITY)
	public int getID_event() {
		return this.ID_event;
	}

	public void setID_event(int ID_event) {
		this.ID_event = ID_event;
	}   
	
	public String getName_event() {
		return this.name_event;
	}

	public void setName_event(String name_event) {
		this.name_event = name_event;
	}   
	public String getPlace_event() {
		return this.place_event;
	}

	public void setPlace_event(String place_event) {
		this.place_event = place_event;
	}   
	public Date getDate_event() {
		return this.date_event;
	}

	public void setDate_event(Date date_event) {
		this.date_event = date_event;
	}   
	//public Integer getDoctor_id() {
		//return this.doctor_id;
	//}

	//public void setDoctor_id(Integer doctor_id) {
		//this.doctor_id = doctor_id;
	//}   
	public String getProgram() {
		return this.program;
	}

	public void setProgram(String program) {
		this.program = program;
	}   
	public Integer getNbr_participants() {
		return this.nbr_participants;
	}

	public void setNbr_participants(Integer nbr_participants) {
		this.nbr_participants = nbr_participants;
	}   
	public float getPrice() {
		return this.price;
	}

	public void setPrice(float price) {
		this.price = price;
	}   
	//public Integer getPatient_id() {
	//	return this.patient_id;
	//}
	
	@Lob
	@Column(length=15000000)
	public byte[] getImage() {
		return image;
	}
	public void setImage(byte[] image) {
		this.image = image;
	}

	//public void setPatient_id(Integer patient_id) {
		//this.patient_id = patient_id;
	//}
   
}
