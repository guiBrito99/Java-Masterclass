public class Main {
	public static void main(String[] args) {
		printEqual(1, 1, 1);
		printEqual(1, 1, 2);
		printEqual(-1, -1, -1);
		printEqual(1, 2, 3);
	}

	public static void printEqual(int f, int s, int t) {
		String finalString = "Invalid Value";
		if(f >= 0 && s >= 0 && t >= 0) {
			if(f == s && s == t)
				finalString = "All numbers are equal";
			else if(f != s && f != t && s != t)
				finalString = "All numbers are different";
			else
				finalString = "Neither all are equal or different";
		}
		
		System.out.println(finalString);
	}
	
}
