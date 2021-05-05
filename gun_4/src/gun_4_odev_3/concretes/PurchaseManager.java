package gun_4_odev_3.concretes;

import gun_4_odev_3.abstracts.BasePurchaseManager;
import gun_4_odev_3.entities.Campaigne;
import gun_4_odev_3.entities.Customer;
import gun_4_odev_3.entities.Game;

public class PurchaseManager extends BasePurchaseManager {
	
	private CampaigneManager campaigneManager;
	
	public PurchaseManager (CampaigneManager campaigneManager) {
		this.campaigneManager = campaigneManager;
	}	
	
	public void viewCart(Customer customer, Game[] games, Campaigne campaigne) {
		System.out.println("KULLANICI HESABI : " + customer.getFirstName().toUpperCase() + " " + customer.getLastName().toUpperCase() +	
				"\n\nSEPETTEKÝ ÜRÜNLER\n____________________\n");
		double total = 0;
		double campaigneTotal = 0;
		for(Game game : games) {
			System.out.println(game.getName() + " (Birim Fiyatý : " + game.getUnitPrice() + " TL)" + " (Kampanyalý Fiyat : " + campaigneManager.add(campaigne, game) + " TL)");
			total+=game.getUnitPrice();
			campaigneTotal+=campaigneManager.add(campaigne, game);
		}
		System.out.println("\nARA TOPLAM : " + total + " TL\n\nÝNDÝRÝMLÝ TOPLAM TUTAR : " + campaigneTotal + " TL");
	}
	
	public void buy(Customer customer, Game[] games, Campaigne campaigne) {
		System.out.println("KULLANICI HESABI : " + customer.getFirstName().toUpperCase() + " " + customer.getLastName().toUpperCase() +	
				"\n\nSATIÞ AYRINTILARI\n____________________\n");
		double total = 0;
		double campaigneTotal = 0;
		for(Game game : games) {
			System.out.println(game.getName() + " (Birim Fiyatý : " + game.getUnitPrice() + " TL)" + " (Kampanyalý Fiyat : " + campaigneManager.add(campaigne, game) + " TL)");
			total+=game.getUnitPrice();
			campaigneTotal+=campaigneManager.add(campaigne, game);
		}
		System.out.println("\nARA TOPLAM : " + total + " TL\n\nÝNDÝRÝMLÝ TOPLAM TUTAR : " + campaigneTotal + " TL");
	}
}
