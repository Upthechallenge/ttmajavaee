package ttma.client.delegate;


import java.util.List;

import ttma.Entities.Staff;
import ttma.services.Interfaces.*;
import ttma.client.locator.*;

public class ManageRHDeleguate {
	private static String jndi="pidev-projectt/ManageRH!ttma.services.Interfaces.ManageRHRemote";
	public static ManageRHRemote getProxy()
	{
		return (ManageRHRemote) ServiceLocator.getInstance().getProxy(jndi);

	}
	
	public static boolean toaddStaff(Staff staff){
		return getProxy().addStaff(staff);
		
	}
	public static boolean toupdateStaff(Staff staff){
		 getProxy().updateStaff(staff);
		return true;
	}
	

	public static Staff tofindByIdStaff(int id){
		return getProxy().findByIdStaff(id);
		
	}

	
	public static boolean todeleteStaff(Staff staff)
	{
		 getProxy().deleteStaff(staff);
		 return true;
		
	}
	
	
	public static List<Staff> tofindAll(){
		
		return getProxy().findAll();
	}
	
	public static Staff togetStaffByLogin(String name){
		
		return getProxy().getStaffByLogin(name);
	}

	public static List<Staff> setDefaultCloseOperation(int exitOnClose) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
