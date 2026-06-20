public class DishWasher {
	private boolean hasWorkToDo;
	
	public DishWasher() {
		this.hasWorkToDo = false;
	}
	
	public void doDishes() {
		System.out.println(this.hasWorkToDo ? "Dish washer is already washing the dishes" : "Starting to wash dishes...");
		this.hasWorkToDo = !this.hasWorkToDo;
	}

	public boolean isHasWorkToDo() {
		return hasWorkToDo;
	}

	public void setHasWorkToDo(boolean hasWorkToDo) {
		this.hasWorkToDo = hasWorkToDo;
	}
	
}
