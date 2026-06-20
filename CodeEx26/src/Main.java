
public class Main {

	public static void main(String[] args) {
		System.out.println(getLargestPrime(21));
		System.out.println(getLargestPrime(217));
		System.out.println(getLargestPrime(0));
		System.out.println(getLargestPrime(45));
		System.out.println(getLargestPrime(-1));

	}
	
	public static int getLargestPrime(int number) {
		if(number <= 1)
			return -1;
		
		int aux = number;
		boolean prime = false;
		
		while(aux >= 2) {
			if(number % aux == 0) {
				prime = true;
				for(int i = 2; i <= Math.sqrt(aux); i++) {
					if(aux % i == 0) {
						prime = false;
						break;
					}
				}
				
				if(prime)
					return aux;
			}
			aux--;
		}
		
		return -1;
	}

}
