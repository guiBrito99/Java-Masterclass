package ab.test;

import java.util.Scanner;

public class Main {
	static Scanner s = new Scanner(System.in);
	
	public static void main(String... args) {
		System.out.println("the minimum value is:\n" + minimumValue(readIntegers()));
	}
	
	private static int[] readIntegers() {
		System.out.println("Type in the numbers separated by coma:");
		
		String input = s.nextLine();
		
		String[] numbersArray = input.split(",");
		
		int size = numbersArray.length;
		
		int[] numbers = new int[size];
		
		for(int i = 0; i < size; i++) {
			try {
				numbers[i] = Integer.parseInt(numbersArray[i]);
			}catch(Exception e) {
				System.out.println("Parsing error, ignoring element");
			}
		}
		
		return numbers;
	}
	
	private static int minimumValue(int[] numbers) {
		int min = Integer.MAX_VALUE;
		
		for(int i : numbers)
			min = i < min ? i : min;
		
		return min;
	}
}
