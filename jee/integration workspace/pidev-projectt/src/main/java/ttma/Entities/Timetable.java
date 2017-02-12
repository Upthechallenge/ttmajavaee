package ttma.Entities;

import java.io.Serializable;
import java.lang.String;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Timetable
 *
 */
@Entity

public class Timetable implements Serializable {

	
	private int id;
	private String Monday;
	private String Monday1;
	private String Tuesday;
	private String Tuesday1;
	private String Wednesday;
	private String Wednesday1;
	private String Thursday;
	private String Thursday1;
	private String Friday;
	private String Friday1;
	private String TypeU;
	
	private static final long serialVersionUID = 1L;

	public Timetable() {
		super();
	}   
	@Id 
	@GeneratedValue(strategy = GenerationType.AUTO)
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}   
	public String getMonday() {
		return this.Monday;
	}

	public void setMonday(String Monday) {
		this.Monday = Monday;
	}   
	public String getMonday1() {
		return this.Monday1;
	}

	public void setMonday1(String Monday1) {
		this.Monday1 = Monday1;
	}   
	public String getTuesday() {
		return this.Tuesday;
	}

	public void setTuesday(String Tuesday) {
		this.Tuesday = Tuesday;
	}   
	public String getTuesday1() {
		return this.Tuesday1;
	}

	public void setTuesday1(String Tuesday1) {
		this.Tuesday1 = Tuesday1;
	}   
	public String getWednesday() {
		return this.Wednesday;
	}

	public void setWednesday(String Wednesday) {
		this.Wednesday = Wednesday;
	}   
	public String getWednesday1() {
		return this.Wednesday1;
	}

	public void setWednesday1(String Wednesday1) {
		this.Wednesday1 = Wednesday1;
	}   
	public String getThursday() {
		return this.Thursday;
	}

	public void setThursday(String Thursday) {
		this.Thursday = Thursday;
	}   
	public String getThursday1() {
		return this.Thursday1;
	}

	public void setThursday1(String Thursday1) {
		this.Thursday1 = Thursday1;
	}   
	public String getFriday() {
		return this.Friday;
	}

	public void setFriday(String Friday) {
		this.Friday = Friday;
	}   
	public String getFriday1() {
		return this.Friday1;
	}

	public void setFriday1(String Friday1) {
		this.Friday1 = Friday1;
	}
	public String getTypeU() {
		return TypeU;
	}
	public void setTypeU(String typeU) {
		TypeU = typeU;
	}
	
	
   
   
   
}
