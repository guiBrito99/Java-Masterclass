package ab.test;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		int[] intArray = new int[10];
		
		intArray[5] = 50;
		
		double[] doubleArray = new double[10];
		doubleArray[2] = 3.5;
		
		System.out.println(doubleArray[2]);
		
		int[] firstTen = {1,2,3,4,5,6,7,8,9,10};
		System.out.println(firstTen.toString());
		
		for(int i = 0; i < firstTen.length; i++)
			System.out.println(firstTen[i]);
	
		for(int i : firstTen)
			System.out.println(i);
		
		System.out.println(Arrays.toString(firstTen)); 
	
		Object[] array = new Object[2];
		
		array[0] = intArray;
		array[1] = doubleArray;
		
		for(Object o : array)
			System.out.println(o instanceof int[]);
		
				
		
	}
}
