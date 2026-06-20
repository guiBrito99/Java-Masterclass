
public class Main {
	public static void main(String args[]) {
		Movie m1 = Movie.getMovie("a", "StarWars");
		
		ScienceFiction m2 = (ScienceFiction) Movie.getMovie("s", "Alien");
		
		var airplane = Movie.getMovie("C", "airplane");
		
		m1.watchMovie();
		m2.watchMovie();
		airplane.watchMovie();
	}
}
