import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		String command = "", brand, model, type;
		Car car;
		while(!command.equals("quit")) {
			System.out.print("Choose car type:\n(G)as powered\n(E)lectric\n(H)ybrid\n\"quit\" to exit application\n");
			command = s.nextLine();
			if(!command.equals("quit")) {
				type = command;
				System.out.println("Type in the car brand:");
				brand = s.nextLine();
				System.out.println("Type in the car model:");
				model = s.nextLine();
				int cylinders, batterySize;
				double avgKmPerLitre, avgKmPerCharge;
				
				switch(type.toLowerCase().charAt(0)) {
				case 'g':
					System.out.println("Type in how many cylinders there are in the car:");
					cylinders = s.nextInt();
					System.out.println("Type in the avgKmPerLitre of the car:");
					avgKmPerLitre = s.nextDouble();
					car = new GasPoweredCar(brand,model,avgKmPerLitre,cylinders);
					break;
				case 'e':
					System.out.println("Type in how many APH the battery have:");
					batterySize = s.nextInt();
					System.out.println("Type in the avgKmPerCharge of the car:");
					avgKmPerCharge = s.nextDouble();
					car = new ElectricCar(brand,model,avgKmPerCharge,batterySize);
					break;
				case 'h':
					System.out.println("Type in how many cylinders there are in the car:");
					cylinders = s.nextInt();
					System.out.println("Type in the avgKmPerLitre of the car:");
					avgKmPerLitre = s.nextDouble();
					System.out.println("Type in how many APH the battery have:");
					batterySize = s.nextInt();
					car = new HybridCar(brand,model,avgKmPerLitre,batterySize,cylinders);
					break;
				default:
					car = new Car("No brand","No model");
				}
				car.drive();
				car.startEngine();
				car.drive();
			}
			
		}
		System.out.println("Application shutting down");
		s.close();
	}
}
