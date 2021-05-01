package gun_3_odev_2;

public class Instructor extends User {
	
	public Instructor(int id, String nationalIdNumber, String firstName, String lastName, int birthYear, String birthPlace, String phone, String eMail, String address, String category, int instructorId, String certificates) {
		super(id, nationalIdNumber, firstName, lastName, birthYear, birthPlace, phone, eMail, address, category);
		this.instructorId = instructorId;
		this.certificates = certificates;
	}
	
	private int instructorId;
	private String certificates;
	
	public int getInstructorId() {
		return instructorId;
	}

	public void setInstructorId(int instructorId) {
		this.instructorId = instructorId;
	}

	public String getCertificates() {
		return certificates;
	}

	public void setCertificates(String certificates) {
		this.certificates = certificates;
	}
	
}
