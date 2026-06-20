
public class Car {
	private int cylinders, wheels = 4;
	private boolean engine = true;
	private String name;
	
	public Car(int cylinders, String name) {
		super();
		this.cylinders = cylinders;
		this.name = name;
	}
	
	public int getCylinders() {
		return cylinders;
	}

	public String getName() {
		return name;
	}

	public String startEngine() {
		return this.getClass().getName() + " -> startEngine()";
	}
	
	public String accelerate() {
		return this.getClass().getName() + " -> accelerate()";
	}
	
	public String brake() {
		return this.getClass().getName() + " -> brake()";
	}
}
