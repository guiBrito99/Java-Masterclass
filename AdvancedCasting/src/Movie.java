public class Movie {
	private String title;
	
	public Movie(String title) {
		super();
		this.title = title;
	}



	public void watchMovie() {
		String type = this.getClass().getName();
		System.out.println(this.title + " is a " + type + " movie");
	}
	
	public static Movie getMovie(String type, String title) {
		return switch(type.toLowerCase().charAt(0)) {
			case 'a' -> new Adventure(title);
			case 'c' -> new Comedy(title);
			case 's' -> new ScienceFiction(title);
			default -> new Movie(title);
		};
	}
}

class Adventure extends Movie{

	public Adventure(String title) {
		super(title);
	}

	@Override
	public void watchMovie() {
		// TODO Auto-generated method stub
		super.watchMovie();
		
		System.out.println("The adventure is super cool");
	}
	
}

class Comedy extends Movie{

	public Comedy(String title) {
		super(title);
	}

	@Override
	public void watchMovie() {
		// TODO Auto-generated method stub
		super.watchMovie();
		
		System.out.println("The comedy is pure gold");
	}
	
}

class ScienceFiction extends Movie{

	public ScienceFiction(String title) {
		super(title);
	}

	@Override
	public void watchMovie() {
		// TODO Auto-generated method stub
		super.watchMovie();
		
		System.out.println("The scifi is amazing");
	}
	
}