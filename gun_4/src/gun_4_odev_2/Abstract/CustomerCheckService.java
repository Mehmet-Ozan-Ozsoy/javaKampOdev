package gun_4_odev_2.Abstract;

import java.rmi.RemoteException;

import gun_4_odev_2.Entities.Customer;

public interface CustomerCheckService {
	
	boolean checkIfRealPerson(Customer customer) throws NumberFormatException, RemoteException;
}
