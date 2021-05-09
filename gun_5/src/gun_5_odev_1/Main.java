package gun_5_odev_1;

import gun_5_odev_1.business.concretes.UserManager;
import gun_5_odev_1.core.concretes.DefaultAccountValidatorManager;
import gun_5_odev_1.core.concretes.GoogleAuthenticatortManagerAdapter;
import gun_5_odev_1.databaseAccess.concretes.DefaultUserDao;
import gun_5_odev_1.entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		
//SIGN-UP TEST (DEFAULT)
		
		UserManager userManager1 = new UserManager(new DefaultAccountValidatorManager(), new DefaultUserDao());
				
		userManager1.signUp(new User(1,"U1","T", "Anderson","thomas_anderson@metacoretechs.com.au","123456",true));			//Ad hatasý
		
		userManager1.signUp(new User(1,"U1","Thomas", "A","thomas_anderson@metacoretechs.com.au","123456",true));			//Soyad hatasý
		
		userManager1.signUp(new User(1,"U1","Thomas", "Anderson","thomas_andersonmetacoretechs.com.au","123456",true));		//E-posta hatasý
		
		userManager1.signUp(new User(1,"U1","Thomas", "Anderson","thomas_anderson@metacoretechs.com.au","1",true));			//Þifre hatasý
		
		userManager1.signUp(new User(1,"U1","Thomas", "Anderson","thomas_anderson@metacoretechs.com.au","123456",true));	//Baþarýlý kayýt
		
		userManager1.signUp(new User(2,"U2","John", "Doe","thomas_anderson@metacoretechs.com.au","456789",true));			//Kayýtlý e-posta hatasý

		
//SIGN-UP TEST (GOOGLE)
		
		UserManager userManager2 = new UserManager(new GoogleAuthenticatortManagerAdapter(), new DefaultUserDao());

		userManager2.signUp(new User(2,"G1","John", "Doe","john_doe@metacoretechs.com","456789",true));						//Gmail olmayan e-posta hatasý
		
		userManager2.signUp(new User(2,"G1","John", "Doe","john_doe@gmail.com","456789",true));								//Baþarýlý kayýt
		
		
//LOG-IN TEST

		User user = new User(3,"G2","John", "Doe","john_doe@gmail.com","456789",true);
		
		userManager1.logIn(user, "john_doe@email.com", "456789");															//E-posta uyumsuzluðu hatasý
		
		userManager1.logIn(user, "john_doe@gmail.com", "111111");															//Þifre uyumsuzluðu hatasý
		
		userManager1.logIn(user, "john_doe@gmail.com", "456789");															//Baþarýlý giriþ
	}
}
