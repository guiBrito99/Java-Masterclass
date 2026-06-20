public class Main {
	public static void main(String[] args) {
		System.out.println(getDurationString(3945));
		System.out.println(getDurationString(65,45));
		System.out.println(getDurationString(-10));
		System.out.println(getDurationString(0));
	}

	public static String getDurationString(int seconds) {
		return getDurationString((int) seconds/60, seconds%60);
	}
	
	public static String getDurationString(int minutes, int seconds) {
		String finalString = "Invalid Value";
		
		if(minutes >= 0 && seconds >= 0 && seconds <= 59) {
			finalString = ((int) minutes/60) + "h " + (minutes%60) + "m " + seconds + "s";
		}
		
		return finalString;
	}
}
