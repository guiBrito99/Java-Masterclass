package ab.test;

public class Main {
	public static void main(String... args) {
		printText("Hello World again".split(" "));
	}
	
	private static void printText(String... textList) {
		for(String t : textList)
			System.out.println(t); 
	}
}
