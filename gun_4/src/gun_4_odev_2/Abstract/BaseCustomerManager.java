package gun_4_odev_2.Abstract;

import gun_4_odev_2.Entities.Customer;

public abstract class BaseCustomerManager implements CustomerService {

	@Override
	public void save(Customer customer) throws Exception {
		System.out.println("Saved to DB : " + customer.getFirstName() + " " + customer.getLastName() + "\n");
	}

	
	
}
