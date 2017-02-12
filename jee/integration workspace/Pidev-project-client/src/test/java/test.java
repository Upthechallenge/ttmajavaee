import ttma.Entities.Doctor;
import ttma.client.delegate.GestionDoctorDelegate;
import ttma.client.delegate.GestionFinanceDelegate;


public class test {

	public static void main(String[] args) {
		//Doctor d=new Doctor();
		
		
		
		System.out.print(GestionDoctorDelegate.countdocs());
		//Long a=GestionDoctorDelegate.countdocs();
		//System.out.println(a);
		int b = GestionFinanceDelegate.countFinance("January","events");
		System.out.println(b);

	}

}
