package gun_4_odev_3.concretes;

import gun_4_odev_3.abstracts.BaseCustomerManager;
import gun_4_odev_3.abstracts.CustomerCheckService;
import gun_4_odev_3.entities.Customer;

public class CustomerManager extends BaseCustomerManager {
	
	private CustomerCheckService customerCheckService;
	
	public CustomerManager(CustomerCheckService customerCheckService) {
		this.customerCheckService = customerCheckService;
	}
		
	@Override
	public void add(Customer customer) throws Exception {
		if(customerCheckService.checkIfRealPerson(customer)) {
			
			super.add(customer);
		}
		else {
			throw new Exception("Ge�ersiz kimlik bilgisi girilmi�tir. L�tfen bilgilerinizi kontrol ederek tekrar deneyiniz.");
		}
		
	}

}
