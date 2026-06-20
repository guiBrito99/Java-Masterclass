import java.util.Arrays;

public class ReverseArray {
	private static void reverse(int[] array) {
		int size = array.length;
		int[] aux = new int[size];
		
		System.out.println("Array = " + Arrays.toString(array));
		
		for(int i = 0; i < size; i++) {
			aux[i] = array[size - 1 - i];
		}
		
		System.out.println("Reversed array = " + Arrays.toString(aux));
	}
}
