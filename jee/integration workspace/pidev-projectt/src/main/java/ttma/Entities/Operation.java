package ttma.Entities;

import java.io.Serializable;
import java.lang.String;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: InfosOffre
 *
 */
@Entity

public class Operation implements Serializable {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int ID_offre;
	private String Type_Operation;
	private float Price_Operation;
	private String doctorName;
	private String medicCenterNAme;
	private String publier;
	private String date;
	
	public String getPublier() {
		return publier;
	}
	public void setPublier(String publier) {
		this.publier = publier;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	//private Doctors doctors;
	//private MedicalCenters medicalCenters;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public int getID_offre() {
		return ID_offre;
	}
	public void setID_offre(int iD_offre) {
		ID_offre = iD_offre;
	}
	public String getType_Operation() {
		return Type_Operation;
	}
	public void setType_Operation(String type_Operation) {
		Type_Operation = type_Operation;
	}
	public float getPrice_Operation() {
		return Price_Operation;
	}
	public void setPrice_Operation(float price_Operation) {
		Price_Operation = price_Operation;
	}
	public String getDoctorName() {
		return doctorName;
	}
	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}
	public String getMedicCenterNAme() {
		return medicCenterNAme;
	}
	public void setMedicCenterNAme(String medicCenterNAme) {
		this.medicCenterNAme = medicCenterNAme;
	}
	public Operation() {
		super();
	}
	
	
	

}
