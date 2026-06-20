public class Car {
	protected String brand, model;
	protected boolean isTurnedOn = false;
	
	public Car(String brand, String model) {
		super();
		this.brand = brand;
		this.model = model;
	}

	public void startEngine() {
		this.isTurnedOn = !this.isTurnedOn;
		System.out.println("The engine is " + (this.isTurnedOn ? "on":"off"));
	}
	
	public void drive() {
		if(this.isTurnedOn) {
			this.runEngine();
			System.out.println("Drinving the " + this.brand + " " + this.model);
		}else
			System.out.println("Can't drive the car turned off");
	}
	
	protected void runEngine() {
		System.out.println("Engine giving power");
	}
}
