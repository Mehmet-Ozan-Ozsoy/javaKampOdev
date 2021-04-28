package gun_2_odev_1.guncelleme;

public class Course {

	public Course() {

	}

	public Course(int id, String name, String category, String instructorFirstName, String instructorLastName, int duration) {
		this();
		_id = id;
		_name = name;
		_category = category;
		_instructorFirstName = instructorFirstName;
		_instructorLastName = instructorLastName;
		_duration = duration;
	}

	private int _id;
	private String _name;
	private String _category;
	private String _instructorFirstName;
	private String _instructorLastName;
	private int _duration;
	private String _code;

	public int getId() {
		return _id;
	}

	public void setId(int id) {
		_id = id;
	}

	public String getName() {
		return _name;
	}

	public void setName(String name) {
		_name = name;
	}
	
	public String getCategory() {
		return _category;
	}

	public void setCategory(String category) {
		_category = category;
	}

	public String getInstructorFirstName() {
		return _instructorFirstName;
	}

	public void setInstructor(String instructorFirstName) {
		_instructorFirstName = instructorFirstName;
	}

	public String getInstructorLastName() {
		return _instructorLastName;
	}

	public void setInstructorLastName(String instructorLastName) {
		_instructorLastName = instructorLastName;
	}

	public int getDuration() {
		return _duration;
	}

	public void setDuration(int duration) {
		_duration = duration;
	}

	public String getCode() {
		return _name.substring(0, 2) + _id;
	}

}
