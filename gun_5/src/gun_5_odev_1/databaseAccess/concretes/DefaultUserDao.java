package gun_5_odev_1.databaseAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import gun_5_odev_1.databaseAccess.abstracts.UserDao;
import gun_5_odev_1.entities.concretes.User;

public class DefaultUserDao implements UserDao {

	List<User> users = new ArrayList<User>();
	
	@Override
	public void add(User user) {
		users.add(user);
		System.out.println("Kullanýcý hesabý eklendi.\nKullanýcý Id : " + user.getUserId());
	}

	@Override
	public void update(User user) {
		System.out.println("Kullanýcý hesabý güncellendi.\nKullanýcý Id : " + user.getUserId());
	}

	@Override
	public void delete(User user) {
		System.out.println("Kullanýcý hesabý silindi.\nKullanýcý Id : " + user.getUserId());
	}

	@Override
	public List<User> getAll() {
		return this.users;
	}	
}
