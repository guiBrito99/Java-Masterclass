public class Main {
	public static void main(String[] args) {
		int number = -6;
		
		checkNumber(number);
	}
	
	public static void checkNumber(int number) {
		if(number == 0)
			System.out.println("zero");
		else
			System.out.println(number > 0 ? "positive" : "negative");
	}
}
