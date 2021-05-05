package gun_4_odev_3.abstracts;

import gun_4_odev_3.entities.Customer;
import gun_4_odev_3.entities.Game;

public interface PurchaseService {
	
	void addToCart(Customer customer, Game game);
	
	void removeFromCart(Customer customer, Game game);
	
	void removeAllFromCart(Customer customer, Game[] games);
	
	void viewCart(Customer customer, Game[] games);
	
	void buy(Customer customer, Game[] games);

}
