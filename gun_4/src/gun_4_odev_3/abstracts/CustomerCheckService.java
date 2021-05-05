package gun_4_odev_3.abstracts;

import java.rmi.RemoteException;

import gun_4_odev_3.entities.Customer;

public interface CustomerCheckService {
	
	boolean checkIfRealPerson(Customer customer) throws NumberFormatException, RemoteException;
}
