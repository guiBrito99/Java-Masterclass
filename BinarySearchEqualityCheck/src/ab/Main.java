package ab;

import java.util.Arrays;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
		int[] array = Main.getArray(5);
		
		System.out.println(Arrays.toString(array));
		Arrays.sort(array);
		
		if(Arrays.binarySearch(array, 3) >= 0)
			System.out.println("Found");
		else
			System.out.println("Not found");
	}
	
	public static int[] getArray(int lenght) {
		Random random = new Random();
		int[] array = new int[lenght];
		
		for(int i = 0; i < lenght; i++) {
			array[i] = random.nextInt(6);
		}
		
		return array;
	}
	
	
	
}

