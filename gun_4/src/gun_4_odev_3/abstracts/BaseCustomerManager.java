package gun_4_odev_3.abstracts;

import gun_4_odev_3.entities.Customer;

public abstract class BaseCustomerManager implements CustomerService {

	@Override
	public void add(Customer customer) throws Exception {
		System.out.println("M��teri veritaban�na eklendi : " + customer.getFirstName() + " " + customer.getLastName());
	}

	@Override
	public void delete(Customer customer) {
		System.out.println("M��teri veritaban�ndan silindi : " + customer.getFirstName() + " " + customer.getLastName());
		
	}

	@Override
	public void update(Customer customer) {
		System.out.println("M��teri veritaban�nda g�ncellendi : " + customer.getFirstName() + " " + customer.getLastName());
		
	}

	@Override
	public void listAll(Customer[] customers) {
		System.out.println("M��TER� L�STES�\n___________________\n");
		for(Customer customer : customers) {
			System.out.println(customer.getFirstName() + " " + customer.getLastName());
		}
	}

}
