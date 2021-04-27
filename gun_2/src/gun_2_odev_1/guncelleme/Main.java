package gun_2_odev_1.guncelleme;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("KAYIT OL - KODLAMA.IO\n_____________________");
		
		User user1 = new User(1,"1234567890", "John", "Doe", 1980, "Wakanda","johndoe@email.com","+0123456789","Wakanda");
		
		User[] users= {user1};
		
		UserManager userManager = new UserManager();
		userManager.Add(user1);
		
/////////////////////////////////////////////////////////////////////////////////////////////////
		
		Category category1 = new Category(1,"Programlama");
		
		Category[] categories = { category1 };

		CategoryManager categoryManager = new CategoryManager();
		categoryManager.list(categories);
		categoryManager.select(category1);
		
/////////////////////////////////////////////////////////////////////////////////////////////////
		
		Instructor instructor1 = new Instructor(1,"0123456789","Engin","Demiro�","engindemiro�@email.com","+1234567890");
		
		Instructor[] instructors = { instructor1 };

		InstructorManager instructorManager = new InstructorManager();
		instructorManager.List(instructors);
		instructorManager.Select(instructor1);
	
/////////////////////////////////////////////////////////////////////////////////////////////////

		Course course1 = new Course(1, "Java-React", 120);
		Course course2 = new Course(2, "C#-Angular", 120);
		Course course3 = new Course(3, "Programlamaya Giri� ��in Temel Kurs", 200);

		Course[] courses = { course1, course2, course3 };

		CourseManager courseManager = new CourseManager();
		courseManager.List(courses);
		courseManager.Select(course1);
		courseManager.Add(course1);

	}

}