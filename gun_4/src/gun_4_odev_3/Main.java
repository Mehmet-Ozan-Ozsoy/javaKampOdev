package gun_4_odev_3;

import java.time.LocalDate;

import gun_4_odev_3.adapters.MernisServiceAdapter;
import gun_4_odev_3.concretes.CampaigneManager;
import gun_4_odev_3.concretes.CustomerManager;
import gun_4_odev_3.concretes.GameManager;
import gun_4_odev_3.concretes.PurchaseManager;
import gun_4_odev_3.entities.Campaigne;
import gun_4_odev_3.entities.Customer;
import gun_4_odev_3.entities.Game;

public class Main {

	public static void main(String[] args) throws Exception {
		
		Customer customer1 = new Customer(
				1,
				"Engin",
				"Demiroð",
				LocalDate.of(1985, 1, 6),
				"28861499108",
				"engin@demirog.com",
				"+0123456789",
				"Ankara"				
				);
		
		Customer customer2 = new Customer(
				2,
				"Thomas", 
				"Anderson", 
				LocalDate.of(1971, 11, 13), 
				"01234567890",
				"thomas@anderson.com",
				"+1234567890",
				"Capital City"				
				);
		
		CustomerManager customerManager = new CustomerManager(new MernisServiceAdapter());
		customerManager.add(customer1);
		
		Customer[] customers = { customer1 };
//________________________________________________________________________________________________________________________________
		
		Game game1 = new Game(
				1,
				"Dirt Rally 2.0",
				"Race Simulator",
				"Codemasters",
				"0123456789",
				LocalDate.of(2019, 2, 22),
				"9/10",
				"Colin McRae Rally Series",
				100,
				200				
				);
		
		Game game2 = new Game(
				2,
				"Cyberpunk 2077",
				"Sci-Fi Adventure",
				"CD Project RED",
				"1234567890",
				LocalDate.of(2020, 9, 17),
				"7/10",
				"Adventures of Johnny Silverhand",
				200,
				450				
				);
		
		GameManager gameManager = new GameManager();
		gameManager.add(game1);
		gameManager.add(game2);
				
		Game[] games = { game1, game2 };
//________________________________________________________________________________________________________________________________

		Campaigne campaigne1 = new Campaigne(
				1,
				"Bahar Ýndirimi",
				LocalDate.of(2021, 3, 1),	
				LocalDate.of(2021, 5, 31),
				0.10				
				);		
//________________________________________________________________________________________________________________________________

		PurchaseManager purchaseManager = new PurchaseManager(new CampaigneManager());
		purchaseManager.addToCart(customer1, game1);
		purchaseManager.addToCart(customer1, game2);
		purchaseManager.viewCart(customer1, games, campaigne1);
		purchaseManager.buy(customer1, games, campaigne1);
		

	}

}
