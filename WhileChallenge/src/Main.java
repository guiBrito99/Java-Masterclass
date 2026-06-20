
public class Main {

	public static void main(String[] args) {
		int number = 5, even = 0, odd = 0;
		
		while(number <= 20) {
			if(even == 5)
				break;
			
			if(isEvenNumber(number)) {
				System.out.println(number);
				even++;
			}else {
				odd++;
			}
			
			number++;
		}
		
		System.out.println("Found " + even + " even numbers");
		System.out.println("Found " + odd + " odd numbers");	
	}
	
	public static boolean isEvenNumber(int number) {
		return number % 2 == 0; 
	}

}
