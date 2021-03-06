package gun_4_odev_3.abstracts;

import gun_4_odev_3.entities.Customer;

public abstract class BaseCustomerManager implements CustomerService {

	@Override
	public void add(Customer customer) throws Exception {
		System.out.println("Müşteri veritabanına eklendi : " + customer.getFirstName() + " " + customer.getLastName());
	}

	@Override
	public void delete(Customer customer) {
		System.out.println("Müşteri veritabanından silindi : " + customer.getFirstName() + " " + customer.getLastName());
		
	}

	@Override
	public void update(Customer customer) {
		System.out.println("Müşteri veritabanında güncellendi : " + customer.getFirstName() + " " + customer.getLastName());
		
	}

	@Override
	public void listAll(Customer[] customers) {
		System.out.println("MÜŞTERİ LİSTESİ\n___________________\n");
		for(Customer customer : customers) {
			System.out.println(customer.getFirstName() + " " + customer.getLastName());
		}
	}

}
