import java.time.LocalDate;

public class Worker {
	private String birthDate, endDate = "";
	protected String name;
	
	public Worker(String name, String birthDate) {
		super();
		this.name = name;
		this.birthDate = birthDate;
	}

	public int getAge() {
		return Integer.parseInt(LocalDate.now().toString().substring(0, 4)) - Integer.parseInt(this.birthDate.substring(0, 4));
	}
	
	public void collectPay() {
		System.out.println("PayDay is the best day");
	}
	
	public void terminate(String endDate) {
		if(this.endDate.isEmpty()) {
			this.endDate = endDate;
			System.out.println("Good luck out there " + this.name);
		}else
			System.out.println(this.name + " no longer works here since " + this.endDate);
	}
}
