package gun_4_odev_3.concretes;

import gun_4_odev_3.abstracts.CampaigneService;
import gun_4_odev_3.entities.Campaigne;
import gun_4_odev_3.entities.Game;

public class CampaigneManager implements CampaigneService {

	@Override
	public double add(Campaigne campaigne, Game game) {
		return game.getUnitPrice() - game.getUnitPrice()*campaigne.getDiscountRate();
	}

	@Override
	public double update(Campaigne campaigne, Game game) {
		return game.getUnitPrice() - game.getUnitPrice()*campaigne.getDiscountRate();
	}

	@Override
	public double delete(Campaigne campaigne, Game game) {
		return game.getUnitPrice();
	}



}
