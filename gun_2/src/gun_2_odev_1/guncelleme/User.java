package gun_2_odev_1.guncelleme;

public class User {

	public User() {

	}

	public User(int id, String TcKimlikNo, String firstName, String lastName, int birthYear, String birthPlace,	String eMail, String phone, String address) {
		this();
		_id = id;
		_TcKimlikNo = TcKimlikNo;
		_firstName = firstName;
		_lastName = lastName;
		_birthYear = birthYear;
		_birthPlace = birthPlace;
		_eMail = eMail;
		_phone = phone;
		_address = address;
	}

	private int _id;
	private String _TcKimlikNo;
	private String _firstName;
	private String _lastName;
	private int _birthYear;
	private String _birthPlace;
	private String _eMail;
	private String _phone;
	private String _address;

	public int getId() {
		return _id;
	}

	public void setId(int id) {
		_id = id;
	}

	public String getFirstName() {
		return _firstName;
	}

	public void setFirstName(String firstName) {
		_firstName = firstName;
	}

	public String getLastName() {
		return _lastName;
	}

	public void setLastName(String lastName) {
		_lastName = lastName;
	}

	public int getBirthYear() {
		return _birthYear;
	}

	public void setBirthYear(int birthYear) {
		_birthYear = birthYear;
	}

	public String getBirthPlace() {
		return _birthPlace;
	}

	public void setBirthPlace(String birthPlace) {
		_birthPlace = birthPlace;
	}

	public String getEMail() {
		return _eMail;
	}

	public void setEMail(String eMail) {
		_eMail = eMail;
	}

	public String getPhone() {
		return _phone;
	}

	public void setPhone(String phone) {
		_phone = phone;
	}

	public String getAddress() {
		return _address;
	}

	public void setAddress(String address) {
		_address = address;
	}

}
