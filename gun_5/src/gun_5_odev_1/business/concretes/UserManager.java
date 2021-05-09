package gun_5_odev_1.business.concretes;

import gun_5_odev_1.business.abstracts.UserService;
import gun_5_odev_1.core.abstracts.AccountValidatorService;
import gun_5_odev_1.databaseAccess.abstracts.UserDao;
import gun_5_odev_1.entities.concretes.User;

public class UserManager implements UserService {

	private AccountValidatorService accountValidatorService;
	private UserDao userDao;

	public UserManager(AccountValidatorService accountValidatorService, UserDao userDao) {
		this.accountValidatorService = accountValidatorService;
		this.userDao = userDao;
	}

	@Override
	public void signUp(User user) {
		if(!accountValidatorService.isNameValid(user.getFirstName())) {
			System.out.println("L�tfen en az 2 adet harften olu�an bir ad girerek tekrar deneyiniz.\n");
			return;
		}
		
		if(!accountValidatorService.isNameValid(user.getLastName())) {
			System.out.println("L�tfen en az 2 adet harften olu�an bir soyad girerek tekrar deneyiniz.\n");
			return;
		}		
		
		if(!accountValidatorService.isEmailValid(user.getEmail().toLowerCase())) {
			System.out.println("L�tfen ge�erli bir e-posta adresi girerek tekrar deneyiniz. (�rnek : kullanici@admin.com)\n");
			return;
		}
		
		for(User other : userDao.getAll()) {
			if(user.getEmail() == other.getEmail()) {
				System.out.println("Ayn� e-posta adresine kay�tl� kullan�c� mevcut. L�tfen farkl� bir e-posta adresi ile kay�t olmay� deneyiniz.\n");
				return;
			}
		}
				
		if(!accountValidatorService.isPasswordValid(user.getPassword())) {
			System.out.println("L�tfen en az 6 adet karakterden olu�an bir �ifre girerek tekrar deneyiniz.\n");
			return;
		}		
		
		System.out.println("Kullan�c� bilgileri ge�erli.\nKay�t i�leminizin tamamlanabilmesi i�in, e-posta adresinize g�nderilen do�rulama ba�lant�s�n� t�klay�n�z.\n");
		if(accountValidatorService.isVerified(user.getIsVerified())) {
			System.out.println("Do�rulama i�lemi ba�ar�l�.\n");
		}
		this.userDao.add(user);
		System.out.println("Profil sayfan�za y�nlendiriliyorsunuz.\n");
	}

	@Override
	public void logIn(User user, String eMailInput, String passwordInput) {
		if(eMailInput != user.getEmail() || passwordInput != user.getPassword()) {
			System.out.println("Ge�ersiz kullan�c� e-postas� ya da �ifresi. L�tfen tekrar deneyiniz.\n");
			return;
		}			
		System.out.println("Giri� ba�ar�l�. Anasayfaya y�nlendiriliyorsunuz.\n");
	}

	@Override
	public void update(User user) {
		this.userDao.update(user);
	}

	@Override
	public void delete(User user) {
		this.userDao.delete(user);
	}

	@Override
	public void getAll() {
		this.userDao.getAll();
	}
}