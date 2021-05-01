package gun_3_odev_2;

public class InstructorManager extends UserManager  {
	
	public void assign(Instructor instructor, String course) {
		System.out.println(instructor.getFirstName() + " " + instructor.getLastName() + " adlý eðitmen, " + course + " kursuna atandý.");
	}
	
	public void assignMultiple(Instructor instructor, String[] courses) {
		for(String course : courses) {
			assign(instructor, course);
		}
	}
	
	public void list(Instructor[] instructors) {
		System.out.println("\nEÐÝTMEN LÝSTESÝ\n____________________");
		for(Instructor instructor : instructors) {
			System.out.println(instructor.getFirstName() + " " + instructor.getLastName());
		}
	}

}
