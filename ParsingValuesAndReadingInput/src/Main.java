import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int currentYear = 2025;
		
		try {
			System.out.println(getInputFromConsole(currentYear));
		}catch(Exception e) {
			System.out.println(getInputFromScanner(currentYear));
		}
		
	}
	
	public static String getInputFromConsole(int currentYear) {
		String name = System.console().readLine("What is your name ?\n");
		
		String yearOfBirth = System.console().readLine("What year were you born ?\n");
		
		int age = currentYear - Integer.parseInt(yearOfBirth);
		
		return name + " is " + age + " years old";
	}
	
	public static String getInputFromScanner(int currentYear) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("What is your name ?");
		String name = scanner.nextLine();
		
		int age = -1;
		
		do {
			System.out.println("What year were you born ?");
			try {
				age = checkData(currentYear,scanner.nextLine());
			}catch (NumberFormatException badUserData) {
				System.out.println("Only numbers are allowed");
			}
		}while(age == -1);
		
		scanner.close();
		
		return name + " is " + age + " years old";
	}
	
	public static int checkData(int currentYear, String yearOfBirth) {
		int birthYear = Integer.parseInt(yearOfBirth), age = currentYear - birthYear;
		
		return age >= 0 && age <= 125 ? age : -1;
	}

}
