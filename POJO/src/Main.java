
public class Main {

	public static void main(String[] args) {
		for(int i = 0; i < 5; i++) {
			Student s = new Student("0"+ (i*5) ,
					switch(i) {
					case 1 -> "Gui";
					case 2 -> "Gu";
					case 3 -> "Sil";
					case 4 -> "San";
					case 5 -> "Spyke";
					default -> "None"; 
					},"1/1/1970","1");
			System.out.println(s);
		}
	}

}
