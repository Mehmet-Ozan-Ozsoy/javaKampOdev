package gun_4_odev_3.abstracts;

import gun_4_odev_3.entities.Customer;

public abstract class BaseCustomerManager implements CustomerService {

	@Override
	public void add(Customer customer) throws Exception {
		System.out.println("Müþteri veritabanýna eklendi : " + customer.getFirstName() + " " + customer.getLastName());
	}

	@Override
	public void delete(Customer customer) {
		System.out.println("Müþteri veritabanýndan silindi : " + customer.getFirstName() + " " + customer.getLastName());
		
	}

	@Override
	public void update(Customer customer) {
		System.out.println("Müþteri veritabanýnda güncellendi : " + customer.getFirstName() + " " + customer.getLastName());
		
	}

	@Override
	public void listAll(Customer[] customers) {
		System.out.println("MÜÞTERÝ LÝSTESÝ\n___________________\n");
		for(Customer customer : customers) {
			System.out.println(customer.getFirstName() + " " + customer.getLastName());
		}
	}

}
