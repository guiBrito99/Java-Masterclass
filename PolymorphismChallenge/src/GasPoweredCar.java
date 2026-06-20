
public class GasPoweredCar extends Car{
	private double avgKmPerLitre;
	private int cylinders;
	
	public GasPoweredCar(String brand, String model, double avgKmPerLitre, int cylinders) {
		super(brand, model);
		this.avgKmPerLitre = avgKmPerLitre;
		this.cylinders = cylinders;
	}

	@Override
	public void startEngine() {
		// TODO Auto-generated method stub
		super.startEngine();
		System.out.println(this.isTurnedOn ? "I can hear the " + this.cylinders + " cylinders" : "No more noise");
	}

	@Override
	public void drive() {
		// TODO Auto-generated method stub
		System.out.println("I love to drive gas cars, even when it does only " + this.avgKmPerLitre + " kilometers per litre");
		super.drive();
	}

	@Override
	protected void runEngine() {
		// TODO Auto-generated method stub
		super.runEngine();
		System.out.println("Cylinders roaring");
	}
	
	
}
