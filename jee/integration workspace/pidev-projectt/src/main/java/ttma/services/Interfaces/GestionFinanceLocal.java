package ttma.services.Interfaces;

import java.util.List;






import javax.ejb.Local;

import ttma.Entities.Doctor;
import ttma.Entities.FinanceManagement;



@Local
public interface GestionFinanceLocal {
	Boolean addFinance(FinanceManagement Doctor);
	Boolean updateFinance(FinanceManagement Doctor);
	Boolean deleteFinance(FinanceManagement Doctor);
	//Doctor findDoctorById(Integer id);
    List <FinanceManagement> findAllFinances();
    List <FinanceManagement> listerFinancebyMois(String mois);
    public int CountFinance(String mois,String typeFinance);
   // public Long CountDoctors();

   
	
}
