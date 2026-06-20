public class Side {
	// French Fries, Onion Rings, Tater tots,Side Salad, Mozzarella Stick
	private int[] type = { 0, 0, 0, 0, 0 };
	private double[] typePrice = { 2.5, 3.75, 3, 3.5, 5 };

	private void changeSides() {
		String message;

		System.out.print("Type in the amount for each side:\n");
		for (int i = 0; i < 5; i++) {
			message = (switch (i) {
			case 0 -> "French Fries";
			case 1 -> "Onion Rings";
			case 2 -> "Tater Tots";
			case 3 -> "Side Salad";
			case 4 -> "Mozzarella Stick";
			default -> "null";
			}) + ":\n";

			this.type[i] = Main.commandVerify(0, Integer.MAX_VALUE, message);
		}
	}
	
	public void print() {
		System.out.print("Selected sides:\n");
		System.out.print("French Fries - " + this.type[0] + "\n");
		System.out.print("Onion Rings - " + this.type[1] + "\n");
		System.out.print("Tater Tots - " + this.type[2] + "\n");
		System.out.print("Side Salad - " + this.type[3] + "\n");
		System.out.print("Mozzarella Stick - " + this.type[4] + "\n");
	}

	public double getPrice() {
		double sum = 0;
		for (int i = 0; i < 5; i++)
			sum += this.type[i] * this.typePrice[i];

		return sum;
	}
	
	public boolean verifyCompletion(boolean verbose) {
		int sum = 0;
		
		for(int i = 0; i < 5; i++)
			sum += this.type[i];
	
		if(verbose)
			System.out.print("Side " + (sum == 0 ? "in":"") + "complete\n");
		
		return sum != 0;
	}

	public static Side getSide() {
		int command = -1;
		String message;
		Side aux = null;

		while (command != 0) {
			message = "Side modifier, select command:\n" + "1 - Select sides\n" + "0 - Exit\n";

			command = Main.commandVerify(0, 1, message);

			if (command == 1) {
				if (aux == null)
					aux = new Side();
				aux.changeSides();
			} else {
				if (aux != null) {
					if(aux.verifyCompletion(true))
						aux.print();
					message = "Select option:\n" + "1 - Go back to edit the sides\n" + "0 - Confirm sides\n";
	
					command = Main.commandVerify(0, 1, message);
				}
			}
			
			if(aux != null && !aux.verifyCompletion(false))
				aux = null;
		}

		return aux;
	}
}
