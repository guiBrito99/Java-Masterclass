import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		double min = Double.MAX_VALUE, max = Double.MIN_VALUE, input = 0;
		
		boolean exit = false, display = false;
		
		while(!exit) {
			System.out.println("Enter a number or enter a character to quit the application:");
			
			try {
				input = Double.parseDouble(scanner.nextLine());
				if(input < min)
					min = input;
				
				if(input > max)
					max = input;
				
				display = true;
			}catch(Exception e) {
				exit = true;
			}	
			
		}
		
		System.out.println(display ? "Max value: " + max + "\nMin value: " + min : "No number were input");
		
		
		scanner.close();
	}

}
