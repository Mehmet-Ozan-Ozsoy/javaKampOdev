package gun_2_odev_1.guncelleme;

public class Instructor {
	
	public Instructor() {

	}

	public Instructor(int id, String TcKimlikNo, String firstName, String lastName, String eMail, String phone) {
		this();
		_id = id;
		_TcKimlikNo = TcKimlikNo;
		_firstName = firstName;
		_lastName = lastName;
		_eMail = eMail;
		_phone = phone;
	}

	private int _id;
	private String _TcKimlikNo;
	private String _firstName;
	private String _lastName;
	private String _eMail;
	private String _phone;

	public int getId() {
		return _id;
	}

	public void setId(int id) {
		_id = id;
	}

	public String getTcKimlikNo() {
		return _TcKimlikNo;
	}

	public void setTcKimlikNo(String TcKimlikNo) {
		_TcKimlikNo = TcKimlikNo;
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
	
	
	
	
	
}
