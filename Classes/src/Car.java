
public class Car {
	private String brand = "Tesla", model = "Model X", color = "Gray";
	private int doors = 2;
	private boolean convertible = true;
	
	public void describeCar() {
		System.out.println("Brand: " + brand);
		System.out.println("Model: " + model);
		System.out.println("Color: " + color);
		System.out.println("Doors: " + doors);
		System.out.println((convertible ? "": "non-") + "convertible");
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		if(brand == null) brand = "Unknown";
		
		switch(brand.toLowerCase()) {
		case "holden", "porsche", "tesla" -> this.brand = brand;
		default -> this.brand = "Unsupported";
		}
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getDoors() {
		return doors;
	}

	public void setDoors(int doors) {
		this.doors = doors;
	}

	public boolean isConvertible() {
		return convertible;
	}

	public void setConvertible(boolean convertible) {
		this.convertible = convertible;
	}
	
	
}
