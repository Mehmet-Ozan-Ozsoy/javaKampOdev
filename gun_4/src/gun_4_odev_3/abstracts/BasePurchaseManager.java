package gun_4_odev_3.abstracts;

import gun_4_odev_3.entities.Customer;
import gun_4_odev_3.entities.Game;

public abstract class BasePurchaseManager implements PurchaseService {

	@Override
	public void addToCart(Customer customer, Game game) {
		System.out.println("KULLANICI HESABI : " + customer.getFirstName().toUpperCase() + " " + customer.getLastName().toUpperCase() +	
				"\n\nÜrün sepete eklendi : " + game.getName() + " (" + game.getUnitPrice() + " TL)");		
	}

	@Override
	public void removeFromCart(Customer customer, Game game) {
		System.out.println("KULLANICI HESABI : " + customer.getFirstName().toUpperCase() + " " + customer.getLastName().toUpperCase() +	
				"\n\nÜrün sepetten çýkarýldý : " + game.getName() + " (-" + game.getUnitPrice() + " TL)");		
	}

	@Override
	public void removeAllFromCart(Customer customer, Game[] games) {
		System.out.println("KULLANICI HESABI : " + customer.getFirstName().toUpperCase() + " " + customer.getLastName().toUpperCase() +	
				"\n\nSeçilmiþ ürünlerin tümü sepetten çýkarýldý.");
	}

	@Override
	public void viewCart(Customer customer, Game[] games) {
		System.out.println("KULLANICI HESABI : " + customer.getFirstName().toUpperCase() + " " + customer.getLastName().toUpperCase() +	
				"\n\nSEPETTEKÝ ÜRÜNLER\n____________________\n");
		double total = 0;
		for(Game game : games) {
			System.out.println(game.getName() + "(" + game.getUnitPrice() + " TL)");
			total+=game.getUnitPrice();
		}
		System.out.println("\nTOPLAM TUTAR : " + total + " TL");
	}

	@Override
	public void buy(Customer customer, Game[] games) {
		System.out.println("KULLANICI HESABI : " + customer.getFirstName().toUpperCase() + " " + customer.getLastName().toUpperCase() +	
				"\n\nSATIÞ AYRINTILARI\n____________________\n");
		double total = 0;
		for(Game game : games) {
			System.out.println(game.getName() + "(" + game.getUnitPrice() + " TL)");
			total+=game.getUnitPrice();
		}
		System.out.println("\nTOPLAM TUTAR : " + total + " TL");
	}
}
