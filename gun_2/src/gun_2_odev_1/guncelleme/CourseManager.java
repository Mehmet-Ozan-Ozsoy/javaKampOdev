package gun_2_odev_1.guncelleme;

public class CourseManager {

	public void Add(Course course) {
		System.out.println("\n" + course.getName() + " kursu sepete eklendi.");
	}

	public void Delete(Course course) {
		System.out.println("\n" + course.getName() + " kursu sepetten ��kar�ld�.");
	}

	public void Update(Course course) {
		System.out.println("\n" + course.getName() + " kursu g�ncellendi.");
	}

	public void Select(Course course) {
		System.out.println("\n" + course.getName() + " kursu se�ildi.");
	}

	public void List(Course[] courses) {
		System.out.println("\nKURSLAR\n_______\n");
		for (Course course : courses) {
			System.out.println(course.getId() + "-" + course.getName());
		}
	}

}
