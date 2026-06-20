package ab.test;

import java.util.Arrays;
import java.util.Random;

public class Main {
	public static void main(String[] args) {
		int[] firstArray = getRandomArray(10);
		System.out.println(Arrays.toString(firstArray));
		
		Arrays.sort(firstArray);
		
		System.out.println(Arrays.toString(firstArray));
		
		Arrays.fill(firstArray, 7);
		System.out.println(Arrays.toString(firstArray));
		
		int[] copyArray = Arrays.copyOf(firstArray, firstArray.length);
		System.out.println(Arrays.toString(copyArray));
		
	}
	
	public static int[] getRandomArray(int len) {
		Random random = new Random();
		int[] newInt = new int[len];
		
		for(int i = 0; i < len; i++) {
			newInt[i] = random.nextInt(100);
		}
		
		return newInt;
	}
}
