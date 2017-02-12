package ttma.Entities;

import java.io.Serializable;
import java.lang.String;




import javax.persistence.*;

/**
 * Entity implementation class for Entity: Doctor
 *
 */
@Entity

public class Doctor implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int NumCinDoc;
	private String FirsNameDoc;
	private String EmailDoc;
	private String AdressDoc;
	private int NbrYearsOfExp;
	private String SpecialityDoc;
	private String clinic;
	
	
	//private static final long serialVersionUID = 1L;

	
	public Doctor() {
		super();
	}
@Id
public int getNumCinDoc() {
		return NumCinDoc;
	}

	public void setNumCinDoc(int numCinDoc) {
		NumCinDoc = numCinDoc;
	}

	public String getFirsNameDoc() {
		return FirsNameDoc;
	}

	public void setFirsNameDoc(String firsNameDoc) {
		FirsNameDoc = firsNameDoc;
	}

	public String getEmailDoc() {
		return EmailDoc;
	}

	public void setEmailDoc(String emailDoc) {
		EmailDoc = emailDoc;
	}

	public String getAdressDoc() {
		return AdressDoc;
	}

	public void setAdressDoc(String adressDoc) {
		AdressDoc = adressDoc;
	}

	public int getNbrYearsOfExp() {
		return NbrYearsOfExp;
	}

	public void setNbrYearsOfExp(int nbrYearsOfExp) {
		NbrYearsOfExp = nbrYearsOfExp;
	}

	public String getSpecialityDoc() {
		return SpecialityDoc;
	}

	public void setSpecialityDoc(String specialityDoc) {
		SpecialityDoc = specialityDoc;
	}

	public String getClinic() {
		return clinic;
	}

	public void setClinic(String clinic) {
		this.clinic = clinic;
	}
	@Override
	public String toString() {
		return FirsNameDoc;
	}
	
	
	
   
}
