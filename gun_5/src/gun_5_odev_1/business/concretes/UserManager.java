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
			System.out.println("Lütfen en az 2 adet harften oluþan bir ad girerek tekrar deneyiniz.\n");
			return;
		}
		
		if(!accountValidatorService.isNameValid(user.getLastName())) {
			System.out.println("Lütfen en az 2 adet harften oluþan bir soyad girerek tekrar deneyiniz.\n");
			return;
		}		
		
		if(!accountValidatorService.isEmailValid(user.getEmail().toLowerCase())) {
			System.out.println("Lütfen geçerli bir e-posta adresi girerek tekrar deneyiniz. (Örnek : kullanici@admin.com)\n");
			return;
		}
		
		for(User other : userDao.getAll()) {
			if(user.getEmail() == other.getEmail()) {
				System.out.println("Ayný e-posta adresine kayýtlý kullanýcý mevcut. Lütfen farklý bir e-posta adresi ile kayýt olmayý deneyiniz.\n");
				return;
			}
		}
				
		if(!accountValidatorService.isPasswordValid(user.getPassword())) {
			System.out.println("Lütfen en az 6 adet karakterden oluþan bir þifre girerek tekrar deneyiniz.\n");
			return;
		}		
		
		System.out.println("Kullanýcý bilgileri geçerli.\nKayýt iþleminizin tamamlanabilmesi için, e-posta adresinize gönderilen doðrulama baðlantýsýný týklayýnýz.\n");
		if(accountValidatorService.isVerified(user.getIsVerified())) {
			System.out.println("Doðrulama iþlemi baþarýlý.\n");
		}
		this.userDao.add(user);
		System.out.println("Profil sayfanýza yönlendiriliyorsunuz.\n");
	}

	@Override
	public void logIn(User user, String eMailInput, String passwordInput) {
		if(eMailInput != user.getEmail() || passwordInput != user.getPassword()) {
			System.out.println("Geçersiz kullanýcý e-postasý ya da þifresi. Lütfen tekrar deneyiniz.\n");
			return;
		}			
		System.out.println("Giriþ baþarýlý. Anasayfaya yönlendiriliyorsunuz.\n");
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