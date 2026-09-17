package learning.ab;

public class Place {
	private String name;
	private int distance;
	
	public Place(String name, int distance) {
		
		this.name = name;
		this.distance = distance;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getDistance() {
		return this.distance;
	}
	
}
