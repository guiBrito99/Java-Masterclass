
public class Main {

	public static void main(String[] args) {
		Worker w = new Worker("Worker","1999/1/1");
		System.out.println("Worker1 is " + w.getAge() + " years old");
		w.collectPay();
		w.terminate("2025/09/18");
		w.terminate("today");
		
		Employee e = new Employee("Employee","1988/1/1","2020/1/1",1234);
		e.collectPay();
		e.identify();
		e.terminate("2025/09/18");
		e.terminate("today");
		
		SalariedEmployee se = new SalariedEmployee("SalariedEmployee","1977/1/1","2010/1/1",123,240000);
		se.collectPay();
		se.identify();
		se.retire();
		se.retire();
		
		HourlyEmployee he = new HourlyEmployee("HourlyEmployee","1966/1/1","2000/1/1",12,123);
		he.collectPay();
		he.identify();
	}

}
