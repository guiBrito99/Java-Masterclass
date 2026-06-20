public class Hello {
	public static void main(String[] args) {
		System.out.println("Hello Guilherme");
		
		boolean isAlien = false;
		if (!isAlien) {
			System.out.println("It is not an alien!");
			System.out.println("And I'm scared of aliens");
		}
		
		int topScore = 88;
		if (topScore <= 100) {
			System.out.println("You got the top score");
		}
		
		int secondTopScore = 81;
		if((topScore > secondTopScore) && (topScore < 100)) {
			System.out.println("Greater than secondTopScore and less than 100");
		}
		
		if((topScore > 90) || (secondTopScore <= 90)) {
			System.out.println("Either or both of the conditions are true");
		}
		
		int newValue = 50;
//		if(newValue = 50){
		if(newValue == 50) {
			System.out.println("This is true");
		}
		
		boolean isCar = false;
//		if(isCar = true) {
		if(isCar == true) {
			System.out.println("This is not supposed to happen");
		}
		
		String makerOfCar = "Volkswagen";
		boolean isDomestic = makerOfCar == "Volkswagen" ? false : true;
		
		 if(isDomestic)
			 System.out.println("This car is domestic ");
		 
		 String s = isDomestic ? "This car is domestic" : "This car is not domestic";
		 System.out.println(s);
	}
}
