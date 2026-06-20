
public class Main {

	public static void main(String[] args) {
		int sum = 0, number = - 1234;
		
		while(number != 0) {
			sum += number % 10;
			number /= 10;
		}
		
		sum = Math.abs(sum);
		
		System.out.println("Digit sum = " + sum);

	}

}
