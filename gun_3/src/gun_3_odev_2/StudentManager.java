package gun_3_odev_2;

public class StudentManager extends UserManager {
	
	public void enroll(Student student, String courseName) {
		System.out.println(student.getFirstName() + " " + student.getLastName() + " adl� ��rencinin " + courseName + " kursuna kayd� ger�ekle�tirilmi�tir.");
	}
	
	public void graduate(Student student, String courseName, double ortalamaPuan) {
		System.out.println(student.getFirstName() + " " + student.getLastName() + " adl� ��renci, " + courseName + " kursunu " + ortalamaPuan  +" puan ortalamas� ile bitirerek sertifika alma hakk� kazanm��t�r.");
	}
	
	public void list(Student[] students) {
		System.out.println("\n��RENC� L�STES�\n____________________");
		for(Student student : students) {
			System.out.println(student.getFirstName() + " " + student.getLastName());
		}
	}
}
