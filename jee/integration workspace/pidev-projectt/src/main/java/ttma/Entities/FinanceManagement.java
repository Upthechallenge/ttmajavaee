package ttma.Entities;

import java.io.Serializable;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: FinanceManagement
 *amine
 */

@Entity

public class FinanceManagement implements Serializable {

	
	private int ID_bilan;
	private int transports_compagnies;
	private int  Events;
	private int  Salaries;
	private int  Clinics;
	private int  hotels;
	private int  publicity;
	private String mois;
	private String annee;
	private String titre;
	private String typeBilan;
	
	
	public String getTypeBilan() {
		return typeBilan;
	}
	public void setTypeBilan(String typeBilan) {
		this.typeBilan = typeBilan;
	}
	public String getMois() {
		return mois;
	}
	public void setMois(String mois) {
		this.mois = mois;
	}
	public String getAnnee() {
		return annee;
	}
	public void setAnnee(String annee) {
		this.annee = annee;
	}
	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}

	private static final long serialVersionUID = 1L;

	public FinanceManagement() {
		super();
	}   
	@Id    
	@GeneratedValue(strategy = GenerationType.AUTO)
	public int getID_bilan() {
		return this.ID_bilan;
	}

	public void setID_bilan(int ID_bilan) {
		this.ID_bilan = ID_bilan;
	}   
	public int getTransports_compagnies() {
		return this.transports_compagnies;
	}
	public int getEvents() {
		return Events;
	}
	public void setEvents(int events) {
		Events = events;
	}
	public int getSalaries() {
		return Salaries;
	}
	public void setSalaries(int salaries) {
		Salaries = salaries;
	}
	public int getClinics() {
		return Clinics;
	}
	public void setClinics(int clinics) {
		Clinics = clinics;
	}
	public int getHotels() {
		return hotels;
	}
	public void setHotels(int hotels) {
		this.hotels = hotels;
	}
	public int getPublicity() {
		return publicity;
	}
	public void setPublicity(int publicity) {
		this.publicity = publicity;
	}
	public void setTransports_compagnies(int transports_compagnies) {
		this.transports_compagnies = transports_compagnies;
	}

   
}
