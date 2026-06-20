
public class Main {

	public static void main(String[] args) {
		System.out.println(getGreatestCommonDivisor(25, 15));
		System.out.println(getGreatestCommonDivisor(12, 30));
		System.out.println(getGreatestCommonDivisor(9, 18));
		System.out.println(getGreatestCommonDivisor(81, 153));

	}
	
	public static int getGreatestCommonDivisor(int first, int second) {
		if(first < 10 || second < 10)
			return -1;
		
		int gcd = 1, aux = (first < second ? first : second);
	
		if(first % aux == 0 && second % aux == 0)
			gcd = aux;
		else {
			aux /= 2;
			while(aux > 1 && gcd == 1) {
				if(first % aux == 0 && second % aux == 0)
					gcd = aux;				
				aux--;			
			}
		}
		
		return gcd;
	}

}
