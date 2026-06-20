import java.util.Arrays;
import java.util.Scanner;

public class Main {
	static Scanner s = new Scanner(System.in);
	public static void main(String... args) {
		System.out.println("type in the values separated by coma:");
		String[] input = s.nextLine().split(",");
		
		int[] aux = new int[input.length];
		
		int size = input.length;
		
		for(int i = 0; i < input.length; i++)
			try {
				aux[i] = Integer.parseInt(input[i]);
			}catch(Exception e) {
				System.out.println("Cannot parse value, skipping");
				size--;
			}
		
		int[] array = new int[size];
		
		for(int i = 0; i < size; i++)
			array[i] = aux[i];
		
		System.out.println("Default array: " + Arrays.toString(array));
		
		int[] reverse = new int[size];
		for(int i = 0; i < size; i++) {
			reverse[i] = array[size - i - 1];
		}
		
		System.out.println("Reverse array: " + Arrays.toString(reverse));
			
		
		
		
	}
}
