package gun_4_odev_3.concretes;

import gun_4_odev_3.abstracts.GameService;
import gun_4_odev_3.entities.Game;

public class GameManager implements GameService {

	@Override
	public void add(Game game) {
		System.out.println("Oyun veritaban�na eklendi : " + game.getName());
		
	}

	@Override
	public void delete(Game game) {
		System.out.println("Oyun veritaban�ndan silindi : " + game.getName());
		
	}

	@Override
	public void update(Game game) {
		System.out.println("Oyun veritaban�nda g�ncellendi : " + game.getName());
		
	}

	@Override
	public void listAll(Game[] games) {
		System.out.println("OYUN L�STES�\n___________________\n");
		for(Game game : games) {
			System.out.println(game.getName());
		}
	}
	
	@Override
	public void listByGenre(Game[] games, String genre) {
		System.out.println(genre.toUpperCase() + " T�R� OYUN L�STES�\n__________________________\n");
		for(Game game : games) {
			if(genre == game.getGenre()) {				
				System.out.println(game.getName());
			}
		}
	}
}
