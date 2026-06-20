public class Main {
	public static void main(String[] args) {
		String birthDate = "15/03/1999";
		
		int startingIndex = birthDate.indexOf("1999");
		System.out.printf("startingIndex = %d\n", startingIndex);
		System.out.println("Birth year = " + birthDate.substring(startingIndex));
		System.out.println("Month = " + birthDate.substring(3, 5));
		
		System.out.println(String.join("/", "15", "03", "1999"));
	}
}
