package ttma.services.Interfaces;

import java.util.List;

import javax.ejb.Remote;

import ttma.Entities.User;




@Remote
public interface GestionPatientRemote {
	Boolean addUser (User user);
	Boolean updateUser (User user);
	Boolean deleteUser (User user);
	User findUserById(Integer id);
    List <User> findAllUsers();
   

}
