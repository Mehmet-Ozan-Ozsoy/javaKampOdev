package gun_3_odev_2;

public class Student extends User {
	
	public Student() {
		
	}
	
	public Student(int id, String nationalIdNumber, String firstName, String lastName, int birthYear, String birthPlace, String phone, String eMail, String address, String category, int studentId, String enrolledCourses, String courseCertificates) {
		super(id, nationalIdNumber, firstName, lastName, birthYear, birthPlace, phone, eMail, address, category);
		this.studentId = studentId;
		this.enrolledCourses = enrolledCourses;
		this.courseCertificates = courseCertificates;
	}
	
	int studentId;
	String enrolledCourses;
	String courseCertificates;
	
	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getEnrolledCourses() {
		return enrolledCourses;
	}

	public void setEnrolledCourses(String enrolledCourses) {
		this.enrolledCourses = enrolledCourses;
	}

	public String getCourseCertificates() {
		return courseCertificates;
	}

	public void setCourseCertificates(String courseCertificates) {
		this.courseCertificates = courseCertificates;
	}
}
