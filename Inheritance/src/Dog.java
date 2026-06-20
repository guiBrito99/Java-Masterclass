
public class Dog extends Animal{

	private String earShape, tailShape;
	
	public Dog() {
		super("Mutt", "Big", 50);
		// TODO Auto-generated constructor stub
	}
	
	

	public Dog(String type, double weight) {
		this(type, weight, "Perky", "Curled");
	}



	public Dog(String type, double weight, String earShape, String tailShape) {
		super(type, weight < 15 ? "Small" : "Big", weight);
		this.earShape = earShape;
		this.tailShape = tailShape;
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Dog [earShape=" + earShape + ", tailShape=" + tailShape + "] " + super.toString();
	}
	

	private void bark() {
		System.out.println("Woof");
	}
	
	private void run() {
		System.out.println("Dog running");
	}
	
	private void walk() {
		System.out.println("Dog walking");
	}
	
	private void wagTail() {
		System.out.println("tail wagging");
	}

	@Override
	public void move(String speed) {
		// TODO Auto-generated method stub
		super.move(speed);
	//	System.out.println("Dogs walk, run and wag their tail");
		if(speed == "slow") {
			this.walk();
			this.wagTail();
		}else {
			this.run();
			this.bark();
		}
	
	}

	@Override
	public void makeNoise() {
		if(this.type == "Wolf")
			System.out.println("WOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO");
		else
			bark();
	}

	

}
