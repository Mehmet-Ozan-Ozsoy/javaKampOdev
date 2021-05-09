package gun_5_odev_1.core.concretes;

import gun_5_odev_1.core.abstracts.AccountValidatorService;
import gun_5_odev_1.googleAccountValidator.GoogleAuthenticatorManager;

public class GoogleAuthenticatortManagerAdapter extends AccountValidatorService {

	@Override
	public boolean isEmailValid(String eMail) {
		return GoogleAuthenticatorManager.gMailValidation(eMail);
	}
}