package ttma.services.Interfaces;

import java.util.List;

import javax.ejb.Local;


import ttma.Entities.*;

@Local
public interface ManageRHLocal {

	List<Staff> findAll();

}
