
public class Main {

	public static void main(String[] args) {
		System.out.println(getDaysInMonth(1,1970));
		System.out.println(getDaysInMonth(2,2000));
		System.out.println(getDaysInMonth(2,2001));
		System.out.println(getDaysInMonth(-3,1970));
		System.out.println(getDaysInMonth(5,-4));

	}
	
	public static boolean isLeapYear(int year) {
		return (year >= 1 && year <= 9999) && ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0);
	}
	
	public static int getDaysInMonth(int month, int year) {
		return (year >= 1 && year <= 9999) ?switch(month) {
		case 1,3,5,7,8,10,12 -> 31;
		case 4,6,9,11 -> 30;
		case 2 -> isLeapYear(year) ? 29 : 28;
		default -> -1;
		} : -1;
	}

}
