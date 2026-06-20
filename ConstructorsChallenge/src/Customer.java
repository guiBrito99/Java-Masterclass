
public class Customer {

	private String name, email;
	private double creditLimit;
	
	public String getName() {
		return name;
	}
	public String getEmail() {
		return email;
	}
	public double getCreditLimit() {
		return creditLimit;
	}
	
	public Customer(String name, String email, double creditLimit) {
		super();
		this.name = name;
		this.email = email;
		this.creditLimit = creditLimit;
	}
	
	public Customer() {
		this("default", "default", 0);
	}
	
	public Customer(String name) {
		this(name,"deafult",0);
	}
	
	
}
