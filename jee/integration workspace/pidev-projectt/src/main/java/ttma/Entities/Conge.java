package ttma.Entities;

import java.io.Serializable;
import java.lang.String;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Conge
 *
 */
@Entity

public class Conge implements Serializable {

	
	private int ID;
	private String CIN;
	private String DateDeb;
	private String DateFin;
	private String Verif;
	private static final long serialVersionUID = 1L;

	public Conge() {
		super();
	}   
	@Id    
	@GeneratedValue(strategy = GenerationType.AUTO)
	public int getID() {
		return this.ID;
	}

	public void setID(int ID) {
		this.ID = ID;
	}   
	public String getCIN() {
		return this.CIN;
	}

	public void setCIN(String CIN) {
		this.CIN = CIN;
	}   
	public String getDateDeb() {
		return this.DateDeb;
	}

	public void setDateDeb(String DateDeb) {
		this.DateDeb = DateDeb;
	}   
	public String getDateFin() {
		return this.DateFin;
	}

	public void setDateFin(String DateFin) {
		this.DateFin = DateFin;
	}   
	public String getVerif() {
		return this.Verif;
	}

	public void setVerif(String Verif) {
		this.Verif = Verif;
	}
   
}
