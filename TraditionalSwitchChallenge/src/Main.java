
public class Main {

	public static void main(String[] args) {
		nato('o');
	}
	
	public static void nato(char variable) {
		
		String message = variable + " = ";
		
		switch(variable) {
			case 'a':
				message += "Able";
				break;
			case 'b':
				message += "Baker";
				break;
			case 'c':
				message += "Charlie";
				break;
			case 'd':
				message += "Dog";
				break;
			case 'e':
				message += "Easy";
				break;
				
			default:
				message += "Not found";		
		}
		
		System.out.println(message);
		
	}

}
