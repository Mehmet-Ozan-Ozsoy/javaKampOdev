package gun_2_odev_1.guncelleme;

public class InstructorManager {

	public void Add(Instructor instructor) {
		System.out.println("\n" + instructor.getFirstName() + " " + instructor.getLastName() + " e?itmen listesine eklendi.");
	}

	public void Delete(Instructor instructor) {
		System.out.println("\n" + instructor.getFirstName() + " " + instructor.getLastName() + " e?itmen listesinden silindi.");
	}

	public void Update(Instructor instructor) {
		System.out.println("\n" + instructor.getFirstName() + " " + instructor.getLastName() + " e?itmenine ait bilgiler g?ncellendi.");
	}

	public void Select(Instructor instructor) {
		System.out.println("\n" + instructor.getFirstName() + " " + instructor.getLastName() + " se?ildi.");
	}

	public void List(Instructor[] instructors) {
		System.out.println("\nE??TMEN\n_______\n");
		for (Instructor instructor : instructors) {
			System.out.println(instructor.getId() + "-" + instructor.getFirstName() + " " + instructor.getLastName());
		}
	}
}
