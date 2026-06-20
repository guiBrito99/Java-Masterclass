
public class Main {

	public static void main(String[] args) {
		int counter = 0;
		
		for(int i = 500; i <= 750; i++) {
			if(isPrime(i)) {
				System.out.println(i + " is a prime number");
				counter++;
			}
			
			if(counter == 3)
				break;
		}
		
		counter = 0;
		
		for(int i = 10; i <= 50; i++) {
			if(isPrime(i)) {
				System.out.println(i + " is a prime number");
				counter++;
			}
			
			if(counter == 3)
				break;
		}
		

	}
	
	public static boolean isPrime(int number) {
		if(number < 2)
			return false;
		
		for(int i = 2; i <= Math.sqrt(number); i++)
			if(number % i == 0)
				return false;
		return true;
	}

}
