import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		double sum = 0;
		int counter = 1;
		
		Scanner scanner = new Scanner(System.in);
		
		while(counter <= 5) {
			System.out.println("Enter number #" + counter + ":");
		
			try {
				sum += Double.parseDouble(scanner.nextLine());
				counter++;
			}catch(Exception e) {
				System.out.println("Invalid number");
			}
		}
		
		System.out.println("The sum is " + sum);
		
		scanner.close();
	}

}
