package ttma.Entities;

import java.io.Serializable;
import java.lang.String;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

/**
 * Entity implementation class for Entity: Publicity
 *
 */
@Entity

public class Publicity implements Serializable {

	   
	
	private int PublicityId;
	@Lob
	@Column(length=16000000)
	private byte[] PublicityImage;
	private String PublicityDescription;
	private String PublicityTitle;
	private static final long serialVersionUID = 1L;

	public Publicity() {
		super();
	}   
	@Id
	@GeneratedValue  (strategy=GenerationType.AUTO) 
	public int getPublicityId() {
		return this.PublicityId;
	}

	public void setPublicityId(int PublicityId) {
		this.PublicityId = PublicityId;
	}   
	


	public String getPublicityDescription() {
		return this.PublicityDescription;
	}

	public void setPublicityDescription(String PublicityDescription) {
		this.PublicityDescription = PublicityDescription;
	}
	/**
	 * @return the publicityTitle
	 */
	public String getPublicityTitle() {
		return PublicityTitle;
	}
	/**
	 * @param publicityTitle the publicityTitle to set
	 */
	public void setPublicityTitle(String publicityTitle) {
		PublicityTitle = publicityTitle;
	}
	/**
	 * @return the publicityImage
	 */
	@Lob
	@Column(length=16000000)
	public byte[] getPublicityImage() {
		return PublicityImage;
	}
	/**
	 * @param b the publicityImage to set
	 */
	public void setPublicityImage(byte[] b) {
		this.PublicityImage = b;
	}
   
}
