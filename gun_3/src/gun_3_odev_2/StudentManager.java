package gun_3_odev_2;

public class StudentManager extends UserManager {
	
	public void enroll(Student student, String courseName) {
		System.out.println(student.getFirstName() + " " + student.getLastName() + " adlý öðrencinin " + courseName + " kursuna kaydý gerçekleþtirilmiþtir.");
	}
	
	public void graduate(Student student, String courseName, double ortalamaPuan) {
		System.out.println(student.getFirstName() + " " + student.getLastName() + " adlý öðrenci, " + courseName + " kursunu " + ortalamaPuan  +" puan ortalamasý ile bitirerek sertifika alma hakký kazanmýþtýr.");
	}
	
	public void list(Student[] students) {
		System.out.println("\nÖÐRENCÝ LÝSTESÝ\n____________________");
		for(Student student : students) {
			System.out.println(student.getFirstName() + " " + student.getLastName());
		}
	}
}
