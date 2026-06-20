
public class Employee extends Worker{
	private String hireDate;
	private long employeeID;
	
	public Employee(String name, String birthDate, String hireDate, long employeeId) {
		super(name, birthDate);
		this.hireDate = hireDate;
		this.employeeID = employeeId;
		// TODO Auto-generated constructor stub
	}
	
	public void identify() {
		System.out.println("Name: " + this.name +
				"\nID: " + this.employeeID +
				"\nHire Date: " + this.hireDate +
				"\nAge: " + super.getAge());
	}
	
	
}
