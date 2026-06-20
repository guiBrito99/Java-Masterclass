public class Main {
	public static void main(String args[]) {
		printInformation("Guilherme");
		printInformation("");
		printInformation("\t      \n");
	}
	
	public static void printInformation(String string) {
		int length = string.length();
		System.out.printf("Length = %d\n", length);
		if(string.isEmpty())
			System.out.printf("String is empty\n");
		else if(string.isBlank())
			System.out.printf("String is blank\n");
		else {
			System.out.printf("First char = %c\n", string.charAt(0));
			System.out.printf("Last Char = %c\n", string.charAt(length - 1));
		}
	}
}
