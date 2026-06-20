
public class HybridCar extends Car{
	private double avgKmPerLitre;
	private int batterySize, cylinders;
	
	public HybridCar(String brand, String model, double avgKmPerLitre, int batterySize, int cylinders) {
		super(brand, model);
		this.avgKmPerLitre = avgKmPerLitre;
		this.batterySize = batterySize;
		this.cylinders = cylinders;
	}

	@Override
	public void startEngine() {
		// TODO Auto-generated method stub
		super.startEngine();
		System.out.println(this.isTurnedOn ? (this.cylinders + " cylinder" + (this.cylinders > 1 ? "s":"") +
				" and the " + this.batterySize + " APH battery are on"):"Everything is off know");
	}

	@Override
	public void drive() {
		// TODO Auto-generated method stub
		super.drive();
		System.out.println("I can drive a lot in this car, " + this.avgKmPerLitre + " km per litre");
	}

	@Override
	protected void runEngine() {
		// TODO Auto-generated method stub
		super.runEngine();
		System.out.println("Electric and piston engines working togheter");
	}
	
	
	
}
