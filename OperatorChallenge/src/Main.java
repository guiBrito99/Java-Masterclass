public class Main {
	public static void main(String[] args) {
		double firstValue = 20.0, secondValue = 80.0;
		double addition, reminder;
		boolean divisible;
		
		addition = (firstValue + secondValue)*100.0;
		reminder = addition % 40;
		
		divisible = reminder == 0;
		
		System.out.println("Boolean value " + divisible);
		
		if(!divisible)
			System.out.println("Got some reminder");
			
	}
}
