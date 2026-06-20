public class Hamburguer {
	private int size = -1, type = -1;
	private double sizePriceRate = 4.15;
	// Onions, Bacon, Pickles, Mushrooms, Egg;
	private int[] toppings = { 0, 0, 0, 0, 0 };
	private double[] toppingsPrice = { 0.85, 3.5, 0.75, 2, 2.5 };
	
	private void changeSize(int code) {
		if (code != 0)
			this.size = code;
	}

	private void changeType(int code) {
		if ((code == 1 && this.type == 2) || (code == 2 && this.type == 1) || this.type == -1) {
			this.type = code;
			this.changeToppings(0);
			System.out.print("Toppings reseted\n");
		}
		
	}

	private boolean changeToppings(int code) {
		int sum = 0;
		for (int i = 4; i >= 0; i--) {
			this.toppings[i] = code % 10;
			sum += this.toppings[i];
			code /= 10;
		}
		if (sum > (this.type == 2 ? 7 : 5)) {
			this.toppings[0] = 0;
			this.toppings[1] = 0;
			this.toppings[2] = 0;
			this.toppings[3] = 0;
			this.toppings[4] = 0;
			System.out.print("Invalid toppings amount\n");
		}
		
		return sum <= (this.type == 2 ? 7 : 5);
	}
	
	public int isDeluxe() {
		return this.type;
	}
	
	public int verifyCompletion(boolean verbose) {
		int result = 0, sum = 0;
		
		for(int i = 0; i < 5; i++)
			sum += this.toppings[i];
		
		result = (this.size != -1 ? 1 : 0) + (sum != 0 ? 2 : 0) + (this.type != -1 ? 4 : 0);
		
		if(verbose)
			System.out.print(switch(result) {
			case 0 -> "Hamburguer fully incomplete\n";
			case 1 -> "Hamburguer missing toppings and type\n";
			case 2 -> "Hamburguer missing size and type\n";
			case 3 -> "Hamburguer missing type\n";
			case 4 -> "Hamburguer missing size and toppings\n";
			case 5 -> "Hamburguer missing toppings\n";
			case 6 -> "Hamburguer missing size\n";
			default -> "Hamburguer complete\n";
			});
		
		return result;
	}
	
	public void print() {
		System.out.print("Selected hamburguer:\n");
		System.out.print("Hamburguer size - " + (switch (this.size) {
		case 1 -> "Small";
		case 2 -> "Medium";
		case 3 -> "Large";
		default -> "null";
		}) + "\n");
		System.out.print("Type - " + (switch (this.type) {
		case 1 -> "Normal";
		case 2 -> "Deluxe";
		default -> "No type selected";
		}) + "\n");
		System.out.print("Onions - " + this.toppings[0] + "\n");
		System.out.print("Bacon - " + this.toppings[1] + "\n");
		System.out.print("Pickles - " + this.toppings[2] + "\n");
		System.out.print("Mushrooms - " + this.toppings[3] + "\n");
		System.out.print("Egg - " + this.toppings[4] + "\n");
	}

	public double getPrice() {
		double sum = 0;
		for (int i = 0; i < 5; i++)
			sum += this.toppings[i] * this.toppingsPrice[i];
		sum += this.size * this.sizePriceRate;
		return sum >= 0 ? sum : 0;
	}

	public static Hamburguer getHamburguer() {
		int command = -1;
		Hamburguer aux = null;
		String message;
		while (command != 0) {
			message = "Hamburguer modifier, select command:\n" + "1 - Select type\n" + "2 - Select toppings\n"
					+ "3 - Select size\n" + "4 - Reset hamburguer\n" +"0 - Exit\n";

			command = Main.commandVerify(0, 4, message);
			switch (command) {
			case 0:
				if(aux != null) {
					if (aux.verifyCompletion(true) == 7)
						aux.print();
	
					message = "Select option:\n" + "1 - Go back to edit hamburguer\n" + "0 - Confirm hamburguer\n";
					command = Main.commandVerify(0, 1, message);
				}
				break;
			case 1:
				if (aux == null)
					aux = new Hamburguer();
				
				message = "Hamburguer type modifier, select command:\n" + "1 - Normal hamburguer\n"
						+ "2 - Deluxe hamburguer\n" + "0 - Exit\n";
				aux.changeType(Main.commandVerify(0, 2, message));

				break;
			case 2:
				if (aux == null)
					aux = new Hamburguer();
				
				if(aux.isDeluxe() != -1) {
					message = "Select "+((aux.isDeluxe() == 2) ? "7":"5") + " toppings\n" + "Onions|Bacon|Pickles|Mushrooms|Egg\n"
							+ "or just type 0 to reset the selection\n";
					while (!aux.changeToppings(Main.commandVerify(0, 50000, message)));
				}else 
					System.out.print("Cannot select toppings, please select hamburguer type\n");
				
				break;
			case 3:
				if (aux == null)
					aux = new Hamburguer();
				
				message = "Type in the hamburguer size:\n" + "1 - Small\n" + "2 - Medium\n" + "3 - Large\n"
						+ "0 - Exit\n";
				aux.changeSize(Main.commandVerify(0, 3, message));
				break;
			case 4:
				message = "Reset hamburguer?\n" + "1 - Keep hamburger\n" + "0 - Reset hamburguer\n";
				
				aux = Main.commandVerify(0, 1, message) == 0 ? null : aux;
					
				
				break;
			default:
				command = -1;
				System.out.print("Select valid option\n");
			}
			
			if(aux != null && aux.verifyCompletion(false) == 0)
				aux = null;
		}
		
		if(aux != null && aux.verifyCompletion(false) != 7) {
			System.out.print("Incomplete hamburguer, reseting...");
			aux = null;
		}

		return aux;
	}
}