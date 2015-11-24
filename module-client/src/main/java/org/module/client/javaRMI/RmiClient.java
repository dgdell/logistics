package org.module.client.javaRMI;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;



public class RmiClient {

	/*public UserDataService getUserDataService(){
		String url="rmi://127.0.0.1/"+UserDataService.class.getName();
		UserDataService service;   
		 try {
			service = (UserDataService)Naming.lookup(url);
			return service;
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch ( RemoteException  e) {
			e.printStackTrace();
		} catch ( NotBoundException e) {
			e.printStackTrace();
		} 
		 return null;
	}*/

	@SuppressWarnings("unchecked")
	public static <T> T get(Class<T> cla){
		String url="rmi://127.0.0.1/"+cla.getName();
		T service;   
		 try {
			service = (T)Naming.lookup(url);
			return service;
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch ( RemoteException  e) {
			e.printStackTrace();
		} catch ( NotBoundException e) {
			e.printStackTrace();
		} 
		return null;
		
	}
}
