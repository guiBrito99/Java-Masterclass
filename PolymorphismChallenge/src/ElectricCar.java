
public class ElectricCar extends Car{
	private double avgKmPerCharge;
	private int batterySize;
	
	public ElectricCar(String brand, String model, double avgKmPerCharge, int batterySize) {
		super(brand, model);
		this.avgKmPerCharge = avgKmPerCharge;
		this.batterySize = batterySize;
	}

	@Override
	public void startEngine() {
		// TODO Auto-generated method stub
		super.startEngine();
		System.out.println("I can't hear it, but I can drive " + this.avgKmPerCharge + " kilometers per charge");
	}

	@Override
	public void drive() {
		System.out.println("I can drive anywhere, the battery size (" + this.batterySize + ") is huge");
		super.drive();
	}

	@Override
	protected void runEngine() {
		
		super.runEngine();
		System.out.println("Panel beeping");
	}
	
	
}
