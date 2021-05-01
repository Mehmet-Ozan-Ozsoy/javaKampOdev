package gun_3_odev_2;

public class InstructorManager extends UserManager  {
	
	public void assign(Instructor instructor, String course) {
		System.out.println(instructor.getFirstName() + " " + instructor.getLastName() + " adl� e�itmen, " + course + " kursuna atand�.");
	}
	
	public void assignMultiple(Instructor instructor, String[] courses) {
		for(String course : courses) {
			assign(instructor, course);
		}
	}
	
	public void list(Instructor[] instructors) {
		System.out.println("\nE��TMEN L�STES�\n____________________");
		for(Instructor instructor : instructors) {
			System.out.println(instructor.getFirstName() + " " + instructor.getLastName());
		}
	}

}
