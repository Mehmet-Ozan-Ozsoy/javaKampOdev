package gun_4_odev_2;

import java.time.LocalDate;

import gun_4_odev_2.Abstract.BaseCustomerManager;
import gun_4_odev_2.Concrete.NeroCustomerManager;
import gun_4_odev_2.Concrete.StarbucksCustomerManager;
import gun_4_odev_2.Entities.Customer;
import gun_4_odev_2.Adapters.MernisServiceAdapter;

public class Main {

	public static void main(String[] args) throws Exception {
		
		BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
		
		System.out.println("DOÐRULANMIÞ KÝMLÝK\n____________________\n");
		customerManager.save(new Customer(1,"Engin","Demiroð",LocalDate.of(1985, 1, 6),"28861499108"));
		
		System.out.println("DOÐRULANMAMIÞ KÝMLÝK\n____________________\n");
		customerManager.save(new Customer(2,"Thomas", "Anderson", LocalDate.of(1971, 11, 13), "01234567890"));
	}
}
