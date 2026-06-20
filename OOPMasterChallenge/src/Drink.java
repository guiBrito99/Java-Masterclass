public class Drink {
	private int size = -1, type = -1;
	private double[] typePrice = { 2, 3.5, 3, 1.5 };
	private double sizeRate = 0.5;

	private void changeType(int code) {
		if (code != 0)
			this.type = code;
	}

	private void changeSize(int code) {
		if (code != 0)
			this.size = code;
	}
	
	public void print() {
		System.out.print("Selected drink:\n");
		System.out.print("Drink size - " + (switch (this.size) {
		case 1 -> "Small";
		case 2 -> "Medium";
		case 3 -> "Large";
		default -> "null";
		}) + "\n");
		System.out.print("Drink type - " + (switch (this.type) {
		case 1 -> "Soda";
		case 2 -> "Juice";
		case 3 -> "Coffee";
		case 4 -> "Water";
		default -> "null";
		}) + "\n");
	}

	public double getPrice() {
		return this.type >= 0 ? this.typePrice[type - 1] * this.sizeRate * this.size : 0;
	}
	
	public int verifyCompletion(boolean verbose) {
		int result = (this.size != -1 ? 1 : 0) + (this.type != -1 ? 2 : 0);
		
		if(verbose)
			System.out.print(switch(result) {
			case 0 -> "Drink fully incomplete\n";
			case 1 -> "Drink missing type\n";
			case 2 -> "Drink missing size\n";
			case 3 -> "Drink complete\n";
			default -> "null\n";
			});
		
		return result;
	}

	public static Drink getDrink() {
		int command = -1;
		String message;
		Drink aux = null;

		while (command != 0) {
			message = "Drink modifier, select command:\n" + "1 - Select drink type\n" + "2 - Select drink size\n"
					+ "0 - Exit\n";

			command = Main.commandVerify(0, 2, message);

			switch (command) {
			case 0:
				if (aux != null) {
					if(aux.verifyCompletion(true) == 3)
						aux.print();

					message = "Select option:\n" + "1 - Go back to edit drink\n" + "0 - Confirm drink\n";	
					command = Main.commandVerify(0, 1, message);
				}
				break;
			case 1:
				if (aux == null)
					aux = new Drink();

				message = "Drink type selection:\n" + "1 - Soda\n" + "2 - Juice\n" + "3 - Coffee\n" + "4 - Water\n"
						+ "0 - Exit\n";

				aux.changeType(Main.commandVerify(0, 4, message));
				break;

			case 2:
				if (aux == null)
					aux = new Drink();
				message = "Drink size selection\n" + "1 - Small\n" + "2 - Medium\n" + "3 - Large\n" + "0 - Exit\n";

				aux.changeSize(Main.commandVerify(0, 3, message));
				break;
			default:
			}
			
			if(aux != null && aux.verifyCompletion(false) == 0)
				aux = null;
			
		}
		
		if(aux != null && aux.verifyCompletion(false) != 3) {
			System.out.print("Incomplete drink, reseting...\n");
			aux = null;
		}

		return aux;
	}
}
