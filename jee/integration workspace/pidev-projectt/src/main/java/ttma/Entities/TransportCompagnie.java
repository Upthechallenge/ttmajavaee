package ttma.Entities;

import java.io.Serializable;
import java.lang.String;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: TransportCompagnie
 *
 */
@Entity

public class TransportCompagnie implements Serializable {

	   
	
	private int CompanyId;
	private String CompanyAdress;
	private String CompanyCategory;
	private String CompanyResponsable;
	private float CompanyCost;
	private String CompanyName;
	private static final long serialVersionUID = 1L;

	public TransportCompagnie() {
		super();
	} 
	
	@Id
	@GeneratedValue  (strategy=GenerationType.AUTO)  // generation automatique 
	public int getCompanyId() {
		return this.CompanyId;
	}

	public void setCompanyId(int CompanyId) {
		this.CompanyId = CompanyId;
	}   
	public String getCompanyAdress() {
		return this.CompanyAdress;
	}

	public void setCompanyAdress(String CompanyAdress) {
		this.CompanyAdress = CompanyAdress;
	}   
	public String getCompanyCategory() {
		return this.CompanyCategory;
	}

	public void setCompanyCategory(String CompanyCategory) {
		this.CompanyCategory = CompanyCategory;
	}   
	public String getCompanyResponsable() {
		return this.CompanyResponsable;
	}

	public void setCompanyResponsable(String CompanyResponsable) {
		this.CompanyResponsable = CompanyResponsable;
	}   
	public float getCompanyCost() {
		return this.CompanyCost;
	}

	public void setCompanyCost(float CompanyCost) {
		this.CompanyCost = CompanyCost;
	}

	/**
	 * @return the companyName
	 */
	public String getCompanyName() {
		return CompanyName;
	}

	/**
	 * @param companyName the companyName to set
	 */
	public void setCompanyName(String companyName) {
		CompanyName = companyName;
	}
   
}
