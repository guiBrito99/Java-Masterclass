
public class Main {

	public static void main(String[] args) {
		int value = 5;
		
		if(value == 1) {
			System.out.println("Value was 1");
		}else if(value == 2) {
			System.out.println("Value was 2");
		}else
			System.out.println("Value was not 1 or 2");
		
		int switchValue = 3;
		
		switch(switchValue) {
		
		case 1:
			System.out.println("Value was 1");
		break;
		
		case 2:
			System.out.println("Value was 2");
		break;
		
		case 3: case 4: case 5:
			System.out.println("Value was a 3, 4 or 5");
			System.out.println("Value was " + switchValue);
		break;
		
		default:
			System.out.println("Value was not 1 or 2");
		
		}
		
		System.out.println(getQuarter("MAY"));
		
	}

	public static String getQuarter(String month) {
		switch(month) {
			case "JANUARY":
			case "FEBRUARY":
			case "MARCH":
				return "1st";
			case "APRIL":
			case "MAY":
			case "JUNE":
				return "2nd";
			case "JULY":
			case "AUGUST":
			case "SEPTEMBER":
				return "3rd";
			case "OCTOBER":
			case "NOVEMBER":
			case "DECEMBER":
				return "4th";
		}
		return "Invalid";
	}
	
} 
