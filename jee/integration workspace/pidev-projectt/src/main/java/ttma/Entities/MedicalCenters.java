package ttma.Entities;

import java.util.List;
import java.io.Serializable;
import java.lang.String;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: MedicalCenters
 *
 */
@Entity
public class MedicalCenters implements Serializable {

	private int ID_Med_center;
	private String Name_Med_center;
	private String Adress_Med_center;
	private String Resp_Med_center;
	private String Speciality_Med_center;
	private String Conventionne;

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public int getID_Med_center() {
		return ID_Med_center;
	}

	public void setID_Med_center(int iD_Med_center) {
		ID_Med_center = iD_Med_center;
	}

	public String getName_Med_center() {
		return Name_Med_center;
	}

	public void setName_Med_center(String name_Med_center) {
		Name_Med_center = name_Med_center;
	}

	public String getAdress_Med_center() {
		return Adress_Med_center;
	}

	public void setAdress_Med_center(String adress_Med_center) {
		Adress_Med_center = adress_Med_center;
	}

	public String getResp_Med_center() {
		return Resp_Med_center;
	}

	public void setResp_Med_center(String resp_Med_center) {
		Resp_Med_center = resp_Med_center;
	}

	public String getSpeciality_Med_center() {
		return Speciality_Med_center;
	}

	public void setSpeciality_Med_center(String speciality_Med_center) {
		Speciality_Med_center = speciality_Med_center;
	}

	public String getConventionne() {
		return Conventionne;
	}

	public void setConventionne(String conventionne) {
		Conventionne = conventionne;
	}

	@Override
	public String toString() {
		return Name_Med_center;
	}

	
	
	

}
