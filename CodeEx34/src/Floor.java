
public class Floor {
	private double width, length;
	
	public Floor(double width, double length) {
		this.length = length >= 0 ? length : 0;
		this.width = width >= 0 ? width : 0;
	}
	
	public double getArea() {
		return this.length*this.width;
	}
}
