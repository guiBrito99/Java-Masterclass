
public class Main {

	public static void main(String[] args) {
		System.out.println(getDigitCount(0));
		System.out.println(getDigitCount(123));
		System.out.println(getDigitCount(-12));
		System.out.println(getDigitCount(5200));

		System.out.println("-------------------------");
		
		System.out.println(reverse(-121));
		System.out.println(reverse(1212));
		System.out.println(reverse(1234));
		System.out.println(reverse(100));
		System.out.println("-------------------------");
		
		numberToWords(123);
		System.out.println("-------------------------");
		
		numberToWords(1010);
		System.out.println("-------------------------");
		numberToWords(1000);
		System.out.println("-------------------------");
		
		numberToWords(-12);
		System.out.println("-------------------------");
		
	}

	public static int getDigitCount(int number) {
		return number >= 0 ? (number == 0 ? 1 : (int) Math.log10(Math.abs(number)) + 1) : -1;
	}
	
	public static int reverse(int number) {
		int aux = 0, digits = getDigitCount(Math.abs(number));
		
		
		for(int i = 0; i < digits; i++) {
			aux *= 10;
			aux += number % 10;
			number /= 10;
		}
		
		return aux;
	}
	
	public static void numberToWords(int number) {
		
		if(number < 0)
			System.out.println("Invalid Value");
		else {		
			int aux = reverse(number), digits = getDigitCount(number);
			
			for(int i = 0; i < digits; i++) {
				
				switch(aux % 10) {
				
				case 0:
					System.out.println("Zero");
					break;
				
				case 1:
					System.out.println("One");
					break;
					
				case 2:
					System.out.println("Two");
					break;
					
				case 3:
					System.out.println("Three");
					break;
				
				case 4:
					System.out.println("Four");
					break;
					
				case 5:
					System.out.println("Five");
					break;
					
				case 6:
					System.out.println("Six");
					break;
					
				case 7:
					System.out.println("Seven");
					break;
					
				case 8:
					System.out.println("Eight");
					break;
					
				case 9:
					System.out.println("nine");
					break;
				
				
				}
				
				aux /= 10;		
			}
		}	
	}	
}
