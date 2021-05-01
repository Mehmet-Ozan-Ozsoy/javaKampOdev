package gun_3_odev_2;

public class UserManager {
	
	public void add(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + " adlý kullanýcý, " + user.getCategory().toLowerCase() + " listesine eklendi.");
	}
	
	public void delete(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + " adlý kullanýcý, " + user.getCategory().toLowerCase() + " listesinden silindi.");
	}
	
	public void update(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + " adlý " + user.getCategory().toLowerCase() +" bilgileri güncellendi.");
	}
	
	public void addMultipleUser(User[] users) {
		for(User user : users) {
			add(user);
		}
	}
	
	public void list(User[] users) {
		System.out.println("\nKULLANICI LÝSTESÝ\n____________________");
		for(User user : users) {
			System.out.println(user.getFirstName() + " " + user.getLastName());
		}
	}
	
	public void listByCategory(User[] users, String category) {
		System.out.println("\n" + category.toUpperCase() + " LÝSTESÝ\n____________________");
		for(User user : users) {
			if(category==user.getCategory()) {
				System.out.println(user.getFirstName() + " " + user.getLastName());
			}
		}
	}

}
