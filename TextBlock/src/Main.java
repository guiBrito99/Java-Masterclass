
public class Main {

	public static void main(String[] args) {
		
		String bulleIt = "Print a Bulleted List:\n" +
				"\u2022 First Point\n" +
				"\t\u2022 Sub Point";
		
		System.out.println(bulleIt);
		
		String textBlock = """
				Print a Bulleted List:
					\u2022 First Point
						\u2022 Sub Point
				""";
		
		System.out.println(textBlock);
		
		int age = 26;
		
		System.out.printf("Your age is %d\n",age);
		
		int birthYear = 2025 - age;
		
		System.out.printf("Your birth year is %d\n",birthYear);

		for(int i = 1; i <= 100000; i *= 10)
			System.out.printf("Printing %6d \n",i);
		
	}

}
