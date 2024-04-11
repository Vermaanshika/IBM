package ibm.entity;

public class Student {
	private int id;
	private String name;
	private String Gender;
	

	public Student( int id, String name, String gender) {
		// TODO Auto-generated constructor stub
		super();
		this.id = id;
		this.name = name;
		Gender = gender;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
	

}
