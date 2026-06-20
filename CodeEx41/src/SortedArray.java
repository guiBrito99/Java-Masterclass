import java.util.Scanner;

public class SortedArray {
	
	
	public static int[] getIntegers(int size) {
		Scanner scanner = new Scanner(System.in);
		int [] aux = new int[size];
		
		for(int i = 0; i < size; i++)
			aux[i] = scanner.nextInt();
		
		scanner.close();
		return aux;
	}

	public static void printArray(int[] array) {
		for(int i = 0; i < array.length; i++)
			System.out.println("Element " + i + " contents " + array[i]);
	}
	
	public static int[] sortIntegers(int[] array) {
		int[] aux = array.clone();
		
		for(int i = 0; i < aux.length - 1; i++)
			if(aux[i] < aux[i+1]) {
				int iAux = aux[i];
				aux[i] = aux[i+1];
				aux[i+1] = iAux;
				
				i = -1;
			}
				
		return aux;
	}

}

