package gun_4_odev_3.abstracts;

import gun_4_odev_3.entities.Customer;

public interface CustomerService {
	
	void add(Customer customer) throws Exception;
	
	void delete(Customer customer);
	
	void update(Customer customer);
	
	void listAll(Customer[] customers);

}
