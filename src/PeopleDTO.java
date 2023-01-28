
public class PeopleDTO {

	private String name;
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	public PeopleDTO(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public static PeopleDTO map(People person) {
		return new PeopleDTO(person.getName(),person.getAge());
		
	}
	@Override
	public String toString() {
		return "PeopleDTO [name=" + name + ", age=" + age + "]";
	}
	
	
}
