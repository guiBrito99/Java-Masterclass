public class SmartKitchen {
	private Refrigerator refrigerator;
	private DishWasher dishWasher;
	private CoffeeMaker coffeeMaker;
	
	public SmartKitchen() {
		this.refrigerator = new Refrigerator();
		this.dishWasher = new DishWasher();
		this.coffeeMaker = new CoffeeMaker();
		
		setKitchenState(false,false,false);
	}
	
	public void addFood() {
		System.out.println("Adding food to refrigerator");
		this.refrigerator.orderFood();
	}
	
	public void pourMilk() {
		System.out.println("Pouring milk in the coffee maker");
		this.coffeeMaker.brewCoffee();
	}
	
	public void loadDishWasher() {
		System.out.println("Loading dish washer");
		this.dishWasher.doDishes();
	}
	
	public void doKitchenWork() {
		addFood();
		pourMilk();
		loadDishWasher();
	}
	
	public void setKitchenState(boolean refrigerator, boolean dishWasher, boolean coffeeMaker) {
		System.out.println("Overwriting kitchen state");
		this.refrigerator.setHasWorkToDo(refrigerator);
		this.dishWasher.setHasWorkToDo(dishWasher);
		this.coffeeMaker.setHasWorkToDo(coffeeMaker);
	}
}
