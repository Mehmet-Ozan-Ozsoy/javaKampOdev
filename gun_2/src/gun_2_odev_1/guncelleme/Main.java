package gun_2_odev_1.guncelleme;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("KAYIT OL - KODLAMA.IO\n_____________________");
		
		User user1 = new User(1,"1234567890", "John", "Doe", 1980, "Wakanda","johndoe@email.com","+0123456789","Wakanda");
		
		User[] usersAll = {user1};
		
		UserManager userManager = new UserManager();
		userManager.Add(user1);
		
/////////////////////////////////////////////////////////////////////////////////////////////////
		
		Category category1 = new Category(1,"Programlama");
		
		Category[] categoriesAll = { category1 };

		CategoryManager categoryManager = new CategoryManager();
		categoryManager.list(categoriesAll);
		categoryManager.select(category1);
		
/////////////////////////////////////////////////////////////////////////////////////////////////
		
		Instructor instructor1 = new Instructor(1,"0123456789","Engin","Demiroð","engindemiroð@email.com","+1234567890");
		
		Instructor[] instructorsAll = { instructor1 };

		InstructorManager instructorManager = new InstructorManager();
		instructorManager.List(instructorsAll);
		instructorManager.Select(instructor1);
	
/////////////////////////////////////////////////////////////////////////////////////////////////

		Course course1 = new Course(1, "Java-React", category1.getName(), instructor1.getFirstName(), instructor1.getLastName(), 120);
		Course course2 = new Course(2, "C#-Angular", category1.getName(), instructor1.getFirstName(), instructor1.getLastName(), 120);
		Course course3 = new Course(3, "Programlamaya Giriþ Ýçin Temel Kurs", category1.getName(), instructor1.getFirstName(), instructor1.getLastName(), 200);
		Course course4 = new Course(4, "Diðer Kurs", category1.getName(), "DiðerAd", "DiðerSoyad", 200);

		
		Course[] coursesAll = { course1, course2, course3, course4 };
		
		CourseManager courseManager = new CourseManager();
		courseManager.List(category1, instructor1, coursesAll);
		courseManager.Select(course1);
		courseManager.Add(course1);

	}

}
