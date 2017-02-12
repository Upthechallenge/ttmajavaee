package ttma.Entities;

import java.io.Serializable;
import java.lang.Integer;
import java.lang.String;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: User
 *
 */
@Entity

public class User implements Serializable {

	   
	
	private Integer id;
	private String name;
	private String email;
	private static final long serialVersionUID = 1L;
	private List<Problem> problems;
	private List<ProblemDiscussion> discussions;
	private List<Reservation> reservations;
	

	public User() {
		super();
	}   
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}   
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@OneToMany(mappedBy="user")
	public List<Problem> getProblems() {
		return problems;
	}
	public void setProblems(List<Problem> problems) {
		this.problems = problems;
	}
	@OneToMany(mappedBy="user")
	public List<ProblemDiscussion> getDiscussions() {
		return discussions;
	}
	public void setDiscussions(List<ProblemDiscussion> discussions) {
		this.discussions = discussions;
	}
	@OneToMany(mappedBy="user")
	public List<Reservation> getReservations() {
		return reservations;
	}
	public void setReservations(List<Reservation> reservations) {
		this.reservations = reservations;
	}
	
   
}
