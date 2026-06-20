
public class Main {

	public static void main(String[] args) {
		Car car = new Car();
		
		car.setBrand("Porsche");
		car.setColor("Black");
		car.setModel("Carrera");
		
		System.out.println("Brand: " + car.getBrand());
		
		car.describeCar();

		Car targa = new Car();
		targa.setBrand("Porsche");
		targa.setModel("Targa");
		targa.setDoors(2);
		targa.setColor("Blue");
		targa.setConvertible(false);
		
		targa.describeCar();
	}

}
