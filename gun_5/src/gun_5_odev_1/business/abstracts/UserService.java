package gun_5_odev_1.business.abstracts;

import gun_5_odev_1.entities.concretes.User;

public interface UserService {
	
	void signUp(User user);
	
	void logIn(User user, String eMailInput, String passwordInput);
	
	void update(User user);
	
	void delete(User user);
	
	void getAll();
}
