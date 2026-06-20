
public class Main {

	public static void main(String[] args) {
		for(int i = 0; i < 5; i++) {
			Student s = new Student("0"+ (i*5) ,
					switch(i) {
					case 0 -> "Gui";
					case 1 -> "Gu";
					case 2 -> "Sil";
					case 3 -> "San";
					case 4 -> "Spyke";
					default -> "None"; 
					},"1/1/1970","1");
			System.out.println(s);
			System.out.println("student ID is " + s.id());
		}
		
		
	}

}
