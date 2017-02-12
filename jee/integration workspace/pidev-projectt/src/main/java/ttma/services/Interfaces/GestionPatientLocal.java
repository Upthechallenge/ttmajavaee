package ttma.services.Interfaces;

import java.util.List;

import javax.ejb.Local;

import ttma.Entities.User;



@Local
public interface GestionPatientLocal {
	Boolean addUser (User user);
	Boolean updateUser (User user);
	Boolean deleteUser (User user);
	User findUserById(Integer id);
    List <User> findAllUsers();

}
