package ab.tests;

import java.util.Arrays;
import java.util.Random;

public class Main {
	public static void main(String[] args) {
		int[] array = Main.getArray(10);
		
		System.out.println("Raw array: " + Arrays.toString(array));
		
		for(int i = 0; i < array.length - 1; i++) {
			if(array[i] < array[i+1]) {
				int aux = array[i];
				array[i] = array[i+1];
				array[i+1] = aux;
				
				i = -1;
			}
		}
		
		System.out.println("Sorted array: " + Arrays.toString(array));
	}
	
	public static int[] getArray(int size) {
		int[] aux = new int[size];
		
		Random random = new Random();
		
		for(int i = 0; i < size; i++)
			aux[i] = random.nextInt(101);
		
		return aux;
	}
}
