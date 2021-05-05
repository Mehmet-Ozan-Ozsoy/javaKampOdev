package gun_4_odev_3.abstracts;

import gun_4_odev_3.entities.Campaigne;
import gun_4_odev_3.entities.Game;

public interface CampaigneService {
	
	double add(Campaigne campaigne, Game game);
	
	double update(Campaigne campaigne, Game game);
	
	double delete(Campaigne campaigne, Game game);
}
