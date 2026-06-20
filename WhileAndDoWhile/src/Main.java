
public class Main {

	public static void main(String[] args) {
		for(int i = 1; i <= 5; i++)
			System.out.println(i);
		
		System.out.println("------------------------------------");
		
		int j = 1;
		
		while(j <= 5) {
			System.out.println(j);
			j++;
		}

		System.out.println("------------------------------------");

		
		int w = 1;
		while(w <= 5) {
			if(w > 5)
				break;
			
			System.out.println(w);
			w++;
		}

		System.out.println("------------------------------------");

		
		boolean isReady = false;
		int y = 1;
		do {
			if(y > 5)
				break;
			
			System.out.println(y);
			y++;
			isReady = y >0;		
			
		}while(isReady);
		
		System.out.println("------------------------------------");

		int number = 0;
		while(number < 50) {
			number += 5;
			
			if(number % 25 == 0)
				continue;
			
			System.out.println(number);
		}

	}

}
