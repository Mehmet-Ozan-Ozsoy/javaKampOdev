package gun_4_odev_3.adapters;

import java.rmi.RemoteException;

import gun_4_odev_3.abstracts.CustomerCheckService;
import gun_4_odev_3.entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoap;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements CustomerCheckService {

	@Override
	public boolean checkIfRealPerson(Customer customer) throws NumberFormatException, RemoteException {
		
		KPSPublicSoap client = new KPSPublicSoapProxy();
		return client.TCKimlikNoDogrula(Long.parseLong(customer.getNationalIdNumber()), customer.getFirstName(), customer.getLastName(), customer.getDateOfBirth().getYear());
	}
}
