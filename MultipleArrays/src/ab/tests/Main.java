package ab.tests;

import java.util.Arrays;

public class Main {
	public static void main(String... args) {
		int[][] array2 = new int[4][4];
	
		for(int[] outer : array2)
			System.out.println(Arrays.toString(outer));
	
		Object[] array = new Object[3];
		
		array[0] = new String[] {"a", "b", "c"};
		array[1] = new int[][] {{1,2,3},{4,5,6},{7,8,9}};
		array[2] = new double[3][3][3];
		
		System.out.println(Arrays.deepToString(array));
	}
}
