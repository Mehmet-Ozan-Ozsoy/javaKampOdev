package gun_2_odev_1.guncelleme;

public class UserManager {

	public void Add(User user) {
		System.out.println("\n" + user.getFirstName() + " " + user.getLastName() + " kullanıcısı eklendi.");
	}

	public void Delete(User user) {
		System.out.println("\n" + user.getFirstName() + " " + user.getLastName() + " kullanıcısı silindi.");
	}

	public void Update(User user) {
		System.out.println("\n" + user.getFirstName() + " " + user.getLastName() + " kullanıcısına ait bilgiler güncellendi.");
	}

}
