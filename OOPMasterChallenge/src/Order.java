
public class Order {
	private Hamburguer hamburguer;
	private Drink drink;
	private Side side;
	
	private String messageBuilder(int result) {
		String message = "";
		
		switch(result) {
		case 0:
			message = "Order fully incomplete\n";
			break;
		case 7:
			message = "Order complete\n";
			break;
		default:
			String[] appends = {(this.hamburguer == null ? " hamburguer" : ""),
					(this.drink == null ? " drink" : ""),(this.side == null ? " side": "")};
			message += "Order missing";
			
			for(int i = 0; i < 3; i++) {
				if(i > 0)
					message += !appends[i-1].equals("") && !appends[i].equals("") ? " and" : "";
				message += appends[i];
			}
		}
		
		return message;
	}

	public void print() {
		if (this.hamburguer != null) {
			this.hamburguer.print();
			System.out.print("Hamburguer price: " + this.hamburguer.getPrice() + "\n");
		}

		if (this.drink != null) {
			this.drink.print();
			System.out.print("Drink price: " + this.drink.getPrice() + "\n");
		}

		if (this.side != null) {
			this.side.print();
			System.out.print("Sides price: " + this.side.getPrice() + "\n");
		}
	}

	public void addHamburguer() {
		this.hamburguer = Hamburguer.getHamburguer();
	}

	public void addDrink() {
		this.drink = Drink.getDrink();
	}
	
	public void addSide() {
		this.side = Side.getSide();
	}
	
	public void deleteHamburguer() {
		this.hamburguer = null;
	}
	
	public void deleteDrink() {
		this.drink = null;
	}
	
	public void deleteSide() {
		this.side = null;
	}

	public double getPrice() {
		double sum = 0;
			sum += this.hamburguer != null ? this.hamburguer.getPrice() : 0;
			sum += this.drink != null ? this.drink.getPrice() : 0;
			sum += this.side != null ? this.side.getPrice() : 0;
		return sum;
	}
	
	public int verifyCompletion(boolean verbose) {
		int result = 0;
		
		result = (this.hamburguer != null ? 1 : 0) + (this.drink != null ? 2 : 0) + (this.side != null ? 4 : 0);
		
		if(verbose)
			if(result == 0)
				System.out.print(messageBuilder(result));
		
		return result;
	}
	
	public static Order getOrder() {
		int command = -1;
		Order aux = null;
		String message;
		
		while(command != 0) {
			message =
			"Order Editor, select command:\n" +
			"1 - Add hamburguer\n" +
			"2 - Delete hamburguer\n" +
			"3 - Add drink\n" +
			"4 - Delete drink\n" +
			"5 - Add sides\n" +
			"6 - Delete sides\n" +
			"0 - Exit\n";
			
			command = Main.commandVerify(0, 6, message);
			
			switch(command) {
			case 0:
				if(aux != null) {
					aux.print();
					System.out.print("Order price: " + aux.getPrice() + "\n");
				}
				
				message = "Select option:\n" + "1 - Go back to edit order\n" + "0 - Confirm order\n";
				command = Main.commandVerify(0, 1, message);
				break;
			
			case 1:
				if(aux == null)
					aux = new Order();
				
				if((aux.verifyCompletion(false) & 0b1) == 0) {
					aux.addHamburguer();
				}else
					System.out.print("Hamburguer already created\n");
				
				break;
			case 2:
				if(aux != null) {
					System.out.print("Deleting hamburguer....\n");
					aux.deleteHamburguer();
				}else
					System.out.print("Order is null, cannot delete\n");
					
				break;
			case 3:
				if(aux == null)
					aux = new Order();
				
				if((aux.verifyCompletion(false) & 0b10) == 0) {
					aux.addDrink();
				}else
					System.out.print("Drink already created\n");
				
				break;
			case 4:
				if(aux != null) {
					System.out.print("Deleting drink....\n");
					aux.deleteHamburguer();
				}else
					System.out.print("Order is null, cannot delete\n");
				break;
			case 5:
				if(aux == null)
					aux = new Order();
				
				if((aux.verifyCompletion(false) & 0b100) == 0) {
					aux.addSide();
				}else
					System.out.print("Sides already created\n");
				
				break;
			case 6:
				if(aux != null) {
					System.out.print("Deleting sides....\n");
					aux.deleteHamburguer();
				}else
					System.out.print("Order is null, cannot delete\n");
				break;
			default:
				command = -1;
				System.out.print("Select valid option\n");
			}
			
			if(aux != null && aux.verifyCompletion(false) == 0) {
				System.out.print("Empty order, reseting...\n");
				aux = null;
			}
			
		}
		
		return aux;
	}
}
