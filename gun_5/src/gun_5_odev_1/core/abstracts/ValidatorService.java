package gun_5_odev_1.core.abstracts;

public interface ValidatorService {

	boolean isEmailValid(String eMail);
	
	boolean isPasswordValid(String password);
	
	boolean isNameValid(String name);
	
	boolean isVerified(boolean etkinlestirmeBaglantisiniTikla);	
}