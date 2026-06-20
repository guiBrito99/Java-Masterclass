import java.util.Scanner;

public class MinimumElement {
	private static int readInteger() {
		Scanner s = new Scanner(System.in);
		int aux = s.nextInt();
		
		s.close();
		
		return aux;
	}
	
	private static int[] readElements(int size) {
		int[] aux = new int[size];
		Scanner s = new Scanner(System.in);
		
		
		for(int i = 0; i < size; i++)
			aux[i] = s.nextInt(); 
			
		s.close();	
			
		return aux;
	}
	
	private static int findMin(int[] array) {
		int aux = Integer.MAX_VALUE;
		
		for(int i : array)
			aux = i < aux ? i : aux;
		
		return aux;
	}
}
