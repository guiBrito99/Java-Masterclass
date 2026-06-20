
public class Fish extends Animal{
	private int gills, fins;

	public Fish(String type, double weight, int gills, int fins) {
		super(type, "small", weight);
		this.fins = fins;
		this.gills = gills;
	}

	private void moveMuscles() {
		System.out.println("muscles moving");
	}
	
	private void moveBackFin() {
		System.out.println("backfin moving");
	}

	@Override
	public void move(String speed) {
		// TODO Auto-generated method stub
		super.move(speed);
		this.moveMuscles();
		if(speed == "fast")
			this.moveBackFin();
	}

	@Override
	public String toString() {
		return "Fish [gills=" + gills + ", fins=" + fins + "] " + super.toString();
	}
	
	
	
	
	

}
