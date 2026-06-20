public class Main {
	public static void main(String[] args) {
		String string = "Hello" + " world";
		StringBuilder builder = new StringBuilder("Hello World");
		
		printInformation(string);
		printInformation(builder);
		
		string.concat(" and goodbye");
		builder.append(" and goodbye");
		
		printInformation(string);
		printInformation(builder);
	}
	
	public static void printInformation(String string) {
		System.out.println("String: " + string);
		System.out.println("Length: " + string.length());
	}
	
	public static void printInformation(StringBuilder stringBuilder) {
		System.out.println("String: " + stringBuilder);
		System.out.println("Length: " + stringBuilder.length());
	}
	
	
}
