package gun_4_odev_2.Concrete;

import gun_4_odev_2.Abstract.BaseCustomerManager;
import gun_4_odev_2.Abstract.CustomerCheckService;
import gun_4_odev_2.Entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager {
	
	private CustomerCheckService customerCheckService;
	
	public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
		this.customerCheckService = customerCheckService;
	}

	@Override
	public void save(Customer customer) throws Exception {
		
		if(customerCheckService.checkIfRealPerson(customer)) {			
			super.save(customer);
		}
		else {
			throw new Exception("Not a valid person.");
		}		
	}
}
