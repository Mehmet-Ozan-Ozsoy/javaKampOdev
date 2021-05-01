package gun_3_odev_2;

public class Main {

	public static void main(String[] args) {
		
		Instructor instructor1 = new Instructor(
				1,
				"0123456789",
				"Engin",
				"Demiroğ",
				1985,
				"Diyarbakır",
				"+0123456789",
				"engindemirog@email.com",
				"Ankara",
				"Eğitmen",
				1,
				"C, C++, C#, Java, Javascript, Swift, Python, Ruby, Pearl, Flutter, Kotlin, HTML, CSS"
				);
		
		Instructor[] instructors = { instructor1 };		
		
		
		
		Student student1 = new Student(
				1,
				"1234567890",
				"Thomas",
				"Anderson",
				1964,
				"Sydney",
				"+1234567890",
				"thomasanderson@email.com",
				"Melbourne",
				"Öğrenci",
				1,
				"Java-React",
				"C#-Angular");
		
		Student[] students = { student1 };
		
		
		
		User[] users = { instructor1, student1 };
		
		UserManager userManager = new UserManager();
		userManager.list(users);
		userManager.listByCategory(users, "Eğitmen");
		userManager.listByCategory(users, "Öğrenci");
		
		
		
		String[] courses = { "Java-React", "C#-Angular", "Programlamaya Giriş İçin Temel Kurs" };
						
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.add(instructor1);
		instructorManager.addMultipleUser(instructors);
		instructorManager.delete(instructor1);
		instructorManager.update(instructor1);
		instructorManager.assign(instructor1, "Java-React");
		instructorManager.assignMultiple(instructor1, courses);
		instructorManager.list(instructors);
		
		
		
		StudentManager studentManager = new StudentManager();
		studentManager.add(student1);
		studentManager.addMultipleUser(students);
		studentManager.delete(student1);
		studentManager.update(student1);
		studentManager.enroll(student1, "Java-React");
		studentManager.graduate(student1, "C#-Angular", 100);
		studentManager.list(students);
		
	}

}
