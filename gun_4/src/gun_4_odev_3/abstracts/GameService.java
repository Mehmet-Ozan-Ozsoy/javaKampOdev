package gun_4_odev_3.abstracts;

import gun_4_odev_3.entities.Game;

public interface GameService {
	
	void add(Game game);
	
	void delete(Game game);
	
	void update(Game game);
	
	void listAll(Game[] games);
	
	void listByGenre(Game[] games, String genre);
}
