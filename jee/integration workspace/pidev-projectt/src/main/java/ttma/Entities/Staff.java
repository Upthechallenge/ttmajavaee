package ttma.Entities;

import java.awt.Dimension;
import java.io.Serializable;
import java.lang.String;
import java.util.Date;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Staff
 *
 */
@Entity




public class Staff implements Serializable {

	
	private int id;
	private String name;
	private String Surname;

	private Date Dns;
	private String cin;
	private float salaire;
	private String login;
	private String mdp;
	private String Email;
	private String function;

	
	
	
	@Column(name="e_mail") //CHnger le nom de la colone mail=email
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public Staff(){
		
	}
	


	/**
	 * @param name
	 * @param surname
	 * @param dns
	 * @param cin
	 * @param salaire
	 * @param login
	 * @param mdp
	 * @param email
	 * @param function
	 */
	public Staff(String name, String surname, Date dns, String cin,
			float salaire, String login, String mdp, String email,
			String function) {
		super();
		this.name = name;
		Surname = surname;
		Dns = dns;
		this.cin = cin;
		this.salaire = salaire;
		this.login = login;
		this.mdp = mdp;
		Email = email;
		this.function = function;
	}



	private static final long serialVersionUID = 1L;

	
	@Id   
	@GeneratedValue  (strategy=GenerationType.AUTO)  // generation automatique 
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}   

	/**
	 * @return the cin
	 */
	public String getCin() {
		return cin;
	}
	/**
	 * @param cin the cin to set
	 */
	public void setCin(String cin) {
		this.cin = cin;
	}
	/**
	 * @return the salaire
	 */
	public float getSalaire() {
		return salaire;
	}
	/**
	 * @param salaire the salaire to set
	 */
	public void setSalaire(float salaire) {
		this.salaire = salaire;
	}
	/**
	 * @return the login
	 */
	public String getLogin() {
		return login;
	}
	/**
	 * @param login the login to set
	 */
	public void setLogin(String login) {
		this.login = login;
	}
	/**
	 * @return the mdp
	 */
	public String getMdp() {
		return mdp;
	}
	/**
	 * @param cs the mdp to set
	 */
	public void setMdp(String mdp) {
		this.mdp = mdp;
	}
	/**
	 * @return the dns
	 */
	public Date getDns() {
		return Dns;

	}
	/**
	 * @param dns the dns to set
	 */
	public void setDns(Date dns) {
		Dns = dns;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return Surname;
	}
	public void setSurname(String surname) {
		Surname = surname;
	}
	/**
	 * @return the function
	 */
	public String getFunction() {
		return function;
	}
	/**
	 * @param function the function to set
	 */
	public void setFunction(String function) {
		this.function = function;
	}
	
	

}
