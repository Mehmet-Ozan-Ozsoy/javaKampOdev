package gun_4_odev_2.Concrete;

import gun_4_odev_2.Abstract.CustomerCheckService;
import gun_4_odev_2.Entities.Customer;

public class CustomerCheckManager implements CustomerCheckService {

	@Override
	public boolean checkIfRealPerson(Customer customer) {
		
		return true;
	}

}
