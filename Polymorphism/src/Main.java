import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		String command = "", type, title;
		while(!command.equals("quit")) {
			System.out.print("Choose the movie type:\nA for adventure\nC for comedy\nS for science fiction\nquit to quit the application\n");
			
			command = s.nextLine();
			
			if(!command.equals("quit")) {
				type = command;
				System.out.print("Enter the movie name:\n");
				title = s.nextLine();
				Movie movie = Movie.getMovie(type, title);
				movie.watchMovie();
			}
			
		}
		System.out.println("Application shutting down");
		s.close();
	}
}
