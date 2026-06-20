public class Main {
	public static void main(String[] args) {
		System.out.println(convertToCentimeters(1));
		System.out.println(convertToCentimeters(5,8));
		System.out.println(convertToCentimeters(68));
	}

	public static double convertToCentimeters(int inches) {
		return (double) inches*2.54;
	}
	
	public static double convertToCentimeters(int feet, int inches) {
		return convertToCentimeters(feet*12 + inches);
	}
}
