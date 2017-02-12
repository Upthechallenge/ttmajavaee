package ttma.client.locator;

import java.util.HashMap;
import java.util.Map;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;



public class ServiceLocator {
	private static ServiceLocator instance;
	private Context context;
	
	private Map<String,Object> cache;
	
    private ServiceLocator(){
    	cache=new HashMap<String,Object>();
    	
    	try {
			context=new InitialContext();
		} catch (NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    }
   public Object getProxy(String mhd){
	   Object proxy=null;
	   proxy=cache.get(mhd);
	   if (proxy!=null)
		   return proxy;
	else
		try {
			proxy=context.lookup(mhd);
			cache.put(mhd, proxy);
		} catch (NamingException e) {
			
			e.printStackTrace();
		}
	   return proxy;
   }
   public static ServiceLocator getInstance(){
	   if (instance==null)
		   instance=new ServiceLocator();
	   return instance;
   }
}
