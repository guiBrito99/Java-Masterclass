
public class Main {

	public static void main(String[] args) {
		printDayOfWeek(0);
		printDayOfWeek(1);
		printDayOfWeek(2);
		printDayOfWeek(3);
		printDayOfWeek(4);
		printDayOfWeek(5);
		printDayOfWeek(6);
		printDayOfWeek(7);

		printWeekDay(0);
		printWeekDay(1);
		printWeekDay(2);
		printWeekDay(3);
		printWeekDay(4);
		printWeekDay(5);
		printWeekDay(6);
		printWeekDay(7);

	}
	
	public static void printDayOfWeek(int day) {
		
		System.out.println(switch(day) {
		case 0-> "Monday";
		case 1 -> "Tuesday";
		case 2 -> "Wednesday";
		case 3 -> "Thursday";
		case 4 -> "Friday";
		case 5 -> "Saturday";
		case 6 -> "Sunday";
		default -> "Invalid Day";
		});
	}
	
	public static void printWeekDay(int day) {
		
		String print;
		
		if(day == 0)
			print = "Monday";
		else if(day == 1)
			print = "Tuesday";
		else if(day == 2)
			print = "Wednesday";
		else if(day == 3)
			print = "Thursday";
		else if(day == 4)
			print = "Friday";
		else if(day == 5)
			print = "Saturday";
		else if(day == 6)
			print = "Sunday";
		else
			print = "Invalid Day";
		
		
		System.out.println(print);
		
	}
	
	

}
