package ttma.Entities;

import java.io.Serializable;
import java.lang.String;
import java.util.Date;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: DemandeConsultationEnLigne
 *
 */
@Entity

public class DemandeConsultationEnLigne implements Serializable {

	
	private int ID;
	private String Patient_Name;
	private String DateAppointement;
	private String Doctor_name;
	
	public String getDateAppointement() {
		return DateAppointement;
	}
	public void setDateAppointement(String dateAppointement) {
		DateAppointement = dateAppointement;
	}

	private static final long serialVersionUID = 1L;

	public DemandeConsultationEnLigne() {
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
	public String getPatient_Name() {
		return this.Patient_Name;
	}

	public void setPatient_Name(String Patient_Name) {
		this.Patient_Name = Patient_Name;
	}   
	
	public String getDoctor_name() {
		return this.Doctor_name;
	}

	public void setDoctor_name(String Doctor_name) {
		this.Doctor_name = Doctor_name;
	}
   
}
