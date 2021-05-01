package gun_3_odev_2;

public class User {
	
	public User() {
		
	}
	
	public User(int id, String nationalIdNumber, String firstName, String lastName, int birthYear, String birthPlace, String phone, String eMail, String address, String category) {
		this();
		this.id = id;
		this.nationalIdNumber = nationalIdNumber;
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthYear = birthYear;
		this.birthPlace = birthPlace;
		this.phone = phone;
		this.eMail = eMail;
		this.address = address;
		this.category = category;
	}

	private int id;
	private String nationalIdNumber;
	private String firstName;
	private String lastName;
	private int birthYear;
	private String birthPlace;
	private String phone;
	private String eMail;
	private String address;
	private String userCode;
	private String category;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;		
	}
	
	public String getNationalIdNumber() {
		return nationalIdNumber;
	}

	public void setNationalIdNumber(String nationalIdNumber) {
		this.nationalIdNumber = nationalIdNumber;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getBirthYear() {
		return birthYear;
	}

	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}

	public String getBirthPlace() {
		return birthPlace;
	}

	public void setBirthPlace(String birthPlace) {
		this.birthPlace = birthPlace;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String geteMail() {
		return eMail;
	}

	public void setEMail(String eMail) {
		this.eMail = eMail;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getUserCode() {
		return id + firstName.substring(0,1) + lastName.substring(0,1);
	}
	
	public String getCategory() {
		return category;
	}
	
	public void setCategory(String category) {
		this.category = category;
	}
	
}
