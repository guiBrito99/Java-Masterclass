
public class Person {
	private String firstName, lastName;
	private int age = 0;
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if(age >= 0 && age <= 100) this.age = age;
	}
	
	public boolean isTeen() {
		return this.age > 12 && this.age < 20;
	}
	
	public String getFullName() {
		return this.firstName + (!this.firstName.isEmpty() && !this.lastName.isEmpty() ? " " : "") + this.lastName;
	}
}
