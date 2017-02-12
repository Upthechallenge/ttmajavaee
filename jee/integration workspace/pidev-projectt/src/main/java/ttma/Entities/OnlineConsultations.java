package ttma.Entities;

import java.io.Serializable;
import java.lang.String;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: OnlineConsultations
 *
 */
@Entity

public class OnlineConsultations implements Serializable {

	
	private int IDappointement;
	private String DoctorNAmeapp;
	private String PatientNAmeApp;
	private String DateApp;
	private static final long serialVersionUID = 1L;

	public OnlineConsultations() {
		super();
	}   
	@Id    
	@GeneratedValue(strategy = GenerationType.AUTO)
	public int getIDappointement() {
		return this.IDappointement;
	}

	public void setIDappointement(int IDappointement) {
		this.IDappointement = IDappointement;
	}   
	public String getDoctorNAmeapp() {
		return this.DoctorNAmeapp;
	}

	public void setDoctorNAmeapp(String DoctorNAmeapp) {
		this.DoctorNAmeapp = DoctorNAmeapp;
	}   
	public String getPatientNAmeApp() {
		return this.PatientNAmeApp;
	}

	public void setPatientNAmeApp(String PatientNAmeApp) {
		this.PatientNAmeApp = PatientNAmeApp;
	}   
	public String getDateApp() {
		return this.DateApp;
	}

	public void setDateApp(String DateApp) {
		this.DateApp = DateApp;
	}
   
}
