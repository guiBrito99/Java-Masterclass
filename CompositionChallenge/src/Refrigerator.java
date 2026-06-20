public class Refrigerator {
	private boolean hasWorkToDo;
	
	public Refrigerator() {
		this.hasWorkToDo = false;
	}
	
	public void orderFood() {
		System.out.println(this.hasWorkToDo ? "Refrigerator is already ordering food" : "Ordering food...");
		this.hasWorkToDo = !this.hasWorkToDo;
	}

	public boolean isHasWorkToDo() {
		return hasWorkToDo;
	}

	public void setHasWorkToDo(boolean hasWorkToDo) {
		this.hasWorkToDo = hasWorkToDo;
	}
	
}
