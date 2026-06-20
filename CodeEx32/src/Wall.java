
public class Wall {
	private double width, height;

	public Wall() {
		super();
	}

	public Wall(double width, double height) {
		super();
		setWidth(width);
		setHeight(height);
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width >= 0 ? width : 0;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height >= 0 ? height : 0;
	}
	
	public double getArea() {
		return this.height*this.width;
	}
	
}
