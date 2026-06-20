
public class Main {

	public static void main(String[] args) {
		printNumberInWord(-1);
		printNumberInWord(0);
		printNumberInWord(1);
		printNumberInWord(2);
		printNumberInWord(3);
		printNumberInWord(4);
		printNumberInWord(5);
		printNumberInWord(6);
		printNumberInWord(7);
		printNumberInWord(8);
		printNumberInWord(9);
		printNumberInWord(10);

	}
	
	public static void printNumberInWord(int number) {
		String pNumber;
		
		switch(number) {
		case 0:
			pNumber = "Zero";
			break;
			
		case 1:
			pNumber = "One";
			break;
			
		case 2:
			pNumber = "Two";
			break;	
			
		case 3:
			pNumber = "Three";
			break;	
			
		case 4:
			pNumber = "Four";
			break;
			
		case 5:
			pNumber = "Five";
			break;
			
		case 6:
			pNumber = "Six";
			break;
			
		case 7:
			pNumber = "Seven";
			break;
			
		case 8:
			pNumber = "Eight";
			break;
			
		case 9:
			pNumber = "Nine";
			break;
			
		default:
			pNumber = "other";
		}
		
		System.out.println(pNumber);
	}

}
