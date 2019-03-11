package package_3;

public class Person {
	
	private String name;
	private String surname;
 
	public Person(String n, String s) {
		this.name = n;
		this.surname = s;
	}
 
	public String getName() {
		return this.name;
	}
 
	public String getSurname() {
		return this.surname;
	}
 
	public void setName(String n) {
		this.name = n;
	}
 
	public void setSurname(String s) {
		this.surname = s;
	}
	
	@Override
	public String toString() {
		return "Name: " + this.name + " - Surname: " + this.surname;
	}
	public static void main(String[] args) {
		Person p = new Person("Michael", "Jordan");
		System.out.println(p.toString());
	}

}
