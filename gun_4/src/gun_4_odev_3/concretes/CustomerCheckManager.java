package gun_4_odev_3.concretes;

import gun_4_odev_3.abstracts.CustomerCheckService;
import gun_4_odev_3.entities.Customer;

public class CustomerCheckManager implements CustomerCheckService {

	@Override
	public boolean checkIfRealPerson(Customer customer) {

		return true;
	}

}
