public class Main {
	public static void main(String[] args) {
		printYearsAndDays(525600);
		printYearsAndDays(1051200);
		printYearsAndDays(561600);
	}

	public static void printYearsAndDays(long minutes) {
		System.out.println(minutes >= 0 ? minutes + " min = " + minutes/525600 + " y and " + (minutes%525600)/1440 + " d"
				: "Invalid Value");
	}
}
