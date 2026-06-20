
public class Main {

	public static void main(String[] args) {
		System.out.println(isPalindrome(-1221));
		System.out.println(isPalindrome(707));
		System.out.println(isPalindrome(11212));

	}
	
	public static boolean isPalindrome(int number) {
		int aux = number, sum = 0;
		
		while(number != 0) {
			sum *= 10;
			sum += number % 10;
			number /= 10;			
		}
		
		return Math.abs(aux) == Math.abs(sum);
	}

}
