public class Main {
	public static void main(String[] args) {
		double km = 75.114;
		printConversion(km);
	}
	
	public static long toMilesPerHour(double kilometersPerHour) {
		return kilometersPerHour >= 0 ? Math.round(kilometersPerHour/1.609) : -1;
	}
	
	public static void printConversion(double kilometersPerHour) {
		System.out.println(kilometersPerHour >= 0 ? (kilometersPerHour + " km/h = " + toMilesPerHour(kilometersPerHour) + " mi/h")
				: "Invalid Value");
	}
}
