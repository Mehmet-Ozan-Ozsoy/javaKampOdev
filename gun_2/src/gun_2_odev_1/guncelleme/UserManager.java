package gun_2_odev_1.guncelleme;

public class UserManager {

	public void Add(User user) {
		System.out.println("\n" + user.getFirstName() + " " + user.getLastName() + " kullan�c�s� eklendi.");
	}

	public void Delete(User user) {
		System.out.println("\n" + user.getFirstName() + " " + user.getLastName() + " kullan�c�s� silindi.");
	}

	public void Update(User user) {
		System.out.println("\n" + user.getFirstName() + " " + user.getLastName() + " kullan�c�s�na ait bilgiler g�ncellendi.");
	}

}