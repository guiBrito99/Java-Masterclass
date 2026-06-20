public class Main {
	public static void main(String args[]) {
		SmartKitchen sk = new SmartKitchen();
		sk.addFood();
		sk.addFood();
		sk.loadDishWasher();
		sk.loadDishWasher();
		sk.pourMilk();
		sk.pourMilk();
		
		sk.doKitchenWork();
	}
}
