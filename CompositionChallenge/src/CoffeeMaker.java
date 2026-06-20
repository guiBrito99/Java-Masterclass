public class CoffeeMaker {
	private boolean hasWorkToDo;
	
	public CoffeeMaker() {
		this.hasWorkToDo = false;
	}
	
	public void brewCoffee() {
		System.out.println(this.hasWorkToDo ? "Refrigerator is already ordering food" : "Ordering food...");
		this.hasWorkToDo = !this.hasWorkToDo;
	}

	public boolean isHasWorkToDo() {
		return hasWorkToDo;
	}

	public void setHasWorkToDo(boolean hasWordTodo) {
		this.hasWorkToDo = hasWordTodo;
	}
	
}
