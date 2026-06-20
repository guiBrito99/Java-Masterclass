public class HourlyEmployee extends Employee{
	private double hourlyPayRate;

	public HourlyEmployee(String name, String birthDate,
			String hireDate, long employeeId,
			double hourlyPayRate) {
		super(name, birthDate, hireDate, employeeId);
		this.hourlyPayRate = hourlyPayRate;
	}

	@Override
	public void collectPay() {
		System.out.println("Getting paid " + this.hourlyPayRate + "/hour");
	}
	
	
}
