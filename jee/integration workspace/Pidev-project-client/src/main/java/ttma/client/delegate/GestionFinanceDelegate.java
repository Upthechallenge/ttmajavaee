package ttma.client.delegate;

import java.util.List;

import ttma.Entities.Doctor;
import ttma.Entities.FinanceManagement;
import ttma.client.locator.ServiceLocator;
import ttma.services.Interfaces.GestionDoctorRemote;
import ttma.services.Interfaces.GestionFinanceRemote;


public class GestionFinanceDelegate {

	public static GestionFinanceRemote rremote;
	public static final String jndi="pidev-projectt/GestionFinance!ttma.services.Interfaces.GestionFinanceRemote";
	private static GestionFinanceRemote getProxy(){
		return (GestionFinanceRemote) ServiceLocator.getInstance().getProxy(jndi);
		
	}
	public static Boolean doaddFinance(FinanceManagement hotel){
		return getProxy().addFinance(hotel);}
	
	public static Boolean doupdateFinance(FinanceManagement hotel){
		return getProxy().updateFinance(hotel);
	};
	public static Boolean dodeleteFinance(FinanceManagement hotel){
		return getProxy().deleteFinance(hotel);
	};
	
	public static List <FinanceManagement> dofindAllFinaces(){
		return getProxy().findAllFinances();
		
	};
	public static int  countFinance(String mois,String typefin) {
		return getProxy().CountFinance(mois, typefin);
	}
	
	
}
