package gun_2_odev_1.guncelleme;

public class Category {
	
	public Category() {
		
	}
	
	public Category(int id, String name) {
		this();
		_id=id;
		_name=name;
	}
	
	private int _id;
	private String _name;
	private String _code;
	
	public int getId() {
		return _id;
	}
	
	public void setId(int id) {
		_id=id;
	}
	
	public String getName() {
		return _name;
	}
	
	public void setName(String name) {
		_name=name;
	}
	
	public String getCode() {
		return _name.substring(0,2) + _id;
	}

}
