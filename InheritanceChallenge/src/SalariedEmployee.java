import java.time.LocalDate;

public class SalariedEmployee extends Employee{
	private double annualSalary;
	private boolean isRetired = false;
	
	public SalariedEmployee(String name, String birthDate,
			String hireDate, long employeeId,
			double annualSalary) {
		super(name, birthDate, hireDate, employeeId);
		this.annualSalary = annualSalary;
	}
	
	public void retire() {
		if(!this.isRetired)
			super.terminate(LocalDate.now().toString());
		else
			System.out.println(this.name + " is already retired");
	}

	@Override
	public void collectPay() {
		System.out.println("Getting paid " + this.annualSalary + "/year");
	}
	
	

}
