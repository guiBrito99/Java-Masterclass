import java.util.Scanner;

public class Main {
	public static Scanner s = new Scanner(System.in);
	
	public static void main(String[] args) {
		Order order = null;
		int command= -1;
		String message;
		
		while(command != 0) {
			message = "Order creator, select a command:\n1 - Edit order\n2 - Delete order\n0 - exit\n";
			
			command = Main.commandVerify(0, 1, message);			

			switch(command) {
			case 1:
				if(order == null)
					order = new Order();
				
				order = Order.getOrder();
				break;
			case 2:
				order = null;
			default:
			}
		}
		
		if(order != null) {
			order.print();
			System.out.print("Order price: " + order.getPrice() + "\n");
		}
	}	
	
	public static int commandVerify(int min, int max, String message) {
		int command = -1;
		if(min >= 0 && max > min) {
			while(command < min || command > max) {
				System.out.print(message);
				command = s.nextInt();
			}
		}
		return command;
	}
}