package gun_5_odev_1.databaseAccess.abstracts;

import java.util.List;

import gun_5_odev_1.entities.concretes.User;

public interface UserDao {
	
	void add(User user);
	
	void update(User user);
	
	void delete(User user);
	
	List<User> getAll();	
}
