package ttma.services.Interfaces;

import java.util.List;

import javax.ejb.Remote;
import ttma.Entities.*;


/**
 * Declaration des methodes associées a un staff
 * 
 * @author AminPc
 *
 */
@Remote
public interface ManageRHRemote {

	/**
	 * cette methode permet d'ajouter un nouveau staff
	 * 
	 * @param Staff
	 */
	public boolean addStaff(Staff staff);

	public void updateStaff(Staff staff);

	
	public Staff findByIdStaff(int id);

	
	public void deleteStaff(Staff staff);
	
	public List<Staff> findAll();
	
	public Staff getStaffByLogin(String name);
	
	
}
