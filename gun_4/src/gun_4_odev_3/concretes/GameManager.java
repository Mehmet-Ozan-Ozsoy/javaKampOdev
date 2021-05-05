package gun_4_odev_3.concretes;

import gun_4_odev_3.abstracts.GameService;
import gun_4_odev_3.entities.Game;

public class GameManager implements GameService {

	@Override
	public void add(Game game) {
		System.out.println("Oyun veritabanýna eklendi : " + game.getName());
		
	}

	@Override
	public void delete(Game game) {
		System.out.println("Oyun veritabanýndan silindi : " + game.getName());
		
	}

	@Override
	public void update(Game game) {
		System.out.println("Oyun veritabanýnda güncellendi : " + game.getName());
		
	}

	@Override
	public void listAll(Game[] games) {
		System.out.println("OYUN LÝSTESÝ\n___________________\n");
		for(Game game : games) {
			System.out.println(game.getName());
		}
	}
	
	@Override
	public void listByGenre(Game[] games, String genre) {
		System.out.println(genre.toUpperCase() + " TÜRÜ OYUN LÝSTESÝ\n__________________________\n");
		for(Game game : games) {
			if(genre == game.getGenre()) {				
				System.out.println(game.getName());
			}
		}
	}
}
