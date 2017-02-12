package ttma.Entities;

import java.io.Serializable;
import java.lang.String;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: DoctorDisponibilities
 *
 */
@Entity

public class DoctorDisponibilities implements Serializable {

	
	private int ID_disp;
	private String Date_disp;
	private String doctor_name;
	private static final long serialVersionUID = 1L;

	public DoctorDisponibilities() {
		super();
	}   
	@Id   
	@GeneratedValue(strategy = GenerationType.AUTO)
	public int getID_disp() {
		return this.ID_disp;
	}

	public void setID_disp(int ID_disp) {
		this.ID_disp = ID_disp;
	}   
	public String getDate_disp() {
		return this.Date_disp;
	}

	public void setDate_disp(String Date_disp) {
		this.Date_disp = Date_disp;
	}   
	public String getDoctor_name() {
		return this.doctor_name;
	}

	public void setDoctor_name(String doctor_name) {
		this.doctor_name = doctor_name;
	}
   
}
