package ttma.services.Interfaces;

import java.util.List;

import javax.ejb.Remote;

import ttma.Entities.Doctor;
import ttma.Entities.FinanceManagement;



@Remote
public interface GestionFinanceRemote {
	
	Boolean addFinance(FinanceManagement Doctor);
	Boolean updateFinance(FinanceManagement Doctor);
	Boolean deleteFinance(FinanceManagement Doctor);
	//Doctor findDoctorById(Integer id);
    List <FinanceManagement> findAllFinances();
    List <FinanceManagement> listerFinancebyMois(String mois);
    public int CountFinance(String mois,String typeFinance);

	 

}
