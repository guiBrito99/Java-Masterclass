import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		inputThenPrintSumAndAverage();

	}
	
	public static void inputThenPrintSumAndAverage() {
		Scanner scanner = new Scanner(System.in);
		
		int count = 0, sum = 0;
		long avg = 0;
		boolean exit = false;
		
		while(!exit) {
			try {
				sum += Integer.parseInt(scanner.nextLine());
				count++;
			}catch(Exception e) {
				exit = true;
			}

		}
		
		avg = count > 0 ? Math.round((double) sum/count) : 0;
		
		System.out.println("SUM = " + sum + " AVG = " + avg);
		
		scanner.close();
	}

}
